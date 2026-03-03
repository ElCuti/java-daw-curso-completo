/*We are going to paint graphically our figures.
a)
Create a new class by using Net Beans with:  "New > JPanel Form". Call this class JPanelEditor.
The class will appear in "Design" mode. Click on "Source" button in the upper part to switch to code edition mode (we will return to design mode later).
Create in this class a main method and add the following:

JPanelEditor jPanelEditor = new JPanelEditor();
JFrame window = new JFrame("Mi Editor");
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setContentPane(jPanelEditor);
window.setSize(750,500);
window.setLocation(100,100);
window.setVisible(true);

Run the example and you will see an empty window... This is ok.

b)
Create an ArrayList and put some figures in it.
Store the ArrayList as a field of our class JPanelEditor.
Add a new method to each class of the figures to print figures with this "signature":
public void draw(Graphics g) 

Inside the draw method draw the corresponding figure by using the object "g" (this objects has methods to draw figures).
Define in the class "JPanelEditor" the method:
public void paintComponent(Graphics g)

In this method, loop through the ArrayList of figures, and for each figure call the corresponding method draw.

Run the example again and see if the figures are being painted.

c)
Have you used the "abstract" modifier. Try to use it where it is appropriated.

ADVANCED Note: if you see a "line" which is a bit "pixeled", and you dont like it, you can set the "antialisasing" property, like this.
In the "paintComponent" method of JPanelEditor, create a "Graphics2D" object and set "antialiasing" with this code:

Graphics2D g2d = (Graphics2D) g.create();
g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

Now, paint the figures with this new "g2d" object.

2º Part:
We are going to move our figures in the editor (change their position).
Moving a figure consist in changing their coordinates. For example, for a line we would have to change its x1,y1 and x2,y2 coordinates but in a Rectangle we would have to change only its x,y coordinates but obviously not its width or height (otherwise, the size of the rectangle will grow).
a)
We are going to create a button in our Editor. When we click this button, we will make the figures to move to the right.
To add a button to our Editor:
we will open our "JPanelEditor" class
Click on the "Design" button in the upper part
Drag a "Button" from the right part, and drop it in the desired position
Right click on the button and select "edit text" to change the label of the button to "Move to the right" or ">".
Right click on the button and select "Change Variable Name..." and write "jbMoveRight".
Double click on the button. This will open the "Source code" inside a method called "jbMoveRightActionPerformed". This method will be executed each time the user click on the button. So, we will have to put our code to move the figures there.
To move the figures we will make a "pattern" similar to what we have done for painting the figures, that is, we will have to add a method to JPanelEditor and we will have to put methods for moving in the different figures in our hierarchy.

To move figures we will have to change their coordinates as explained at the beginning of this challenge.

Finally, notice that, once we have changed the coordinates of the figures to move them, we will have to "paint again" the content of our JPanelEditor. To do that, we will have to call to the following code:

this.getParent().repaint();

b)
(OPTIONAL) Make buttons to move the figures to the left, up or down.
 */
package com.daw.programming;

import static com.daw.programming.Figure.getStroke;
import static com.daw.programming.Figure.getZoom;
import static com.daw.programming.Figure.setStroke;
import static com.daw.programming.Figure.setZoom;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Stroke;

public class JPanelEditor extends javax.swing.JPanel {

    ArrayList<Figure> figuras = new ArrayList();
    double typeZoom = 1;
    boolean dashed = false;

    public JPanelEditor() {
        initComponents();
    }

    public void addFigure(Figure figura) {
        figuras.add(figura);
    }

    public static void main(String[] args) {
        JPanelEditor jPanelEditor = new JPanelEditor();
        JFrame window = new JFrame("Paisaje Nocturno");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(jPanelEditor);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setVisible(true);

        java.awt.Dimension size = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int w = size.width;
        int h = size.height;

        for (int y = 0; y < h; y += 2) {
            int r = Math.max(0, 10 - y / 20);
            int g = Math.max(0, 20 - y / 15);
            int b = Math.max(30, 120 - y / 8);
            jPanelEditor.addFigure(new Linea(new Color(r, g, b), 0, y, w, y));
        }

        for (int i = 0; i < 450; i++) {
            int sx = (int) (Math.random() * w);
            int sy = (int) (Math.random() * (h * 0.6));
            int radio = (int) (Math.random() * 3) + 1;
            int brillo = 150 + (int) (Math.random() * 105);
            jPanelEditor.addFigure(new Ovalo(new Color(brillo, brillo, 255), sx, sy, radio, radio));
        }

        int moonX = (int) (w * 0.8);
        int moonY = (int) (h * 0.15);
        for (int i = 120; i > 0; i -= 3) {
            int c = 255 - (120 - i) / 2;
            jPanelEditor.addFigure(new Ovalo(new Color(c, c, c), moonX - i / 2, moonY - i / 2, i, i));
        }

        int horizon = (int) (h * 0.55);

        for (int i = 0; i < 9; i++) {
            int mx1 = (int) (w * (i * 0.12 - 0.1));
            int my1 = horizon;
            int mx2 = (int) (w * (i * 0.12 + 0.08));
            int my2 = horizon - (int) (h * 0.2 + Math.random() * h * 0.15);
            int mx3 = (int) (w * (i * 0.12 + 0.26));
            int my3 = horizon;

            int gray = 30 + (int) (Math.random() * 30);
            jPanelEditor.addFigure(new Triangulo(new Color(gray, gray, gray + 15), mx1, my1, mx2, my2, mx3, my3));

            int midX = mx2 + (mx3 - mx2) / 3;
            jPanelEditor.addFigure(new Triangulo(new Color(gray - 15, gray - 15, gray), mx2, my2, mx3, my3, midX, my1));
        }

        for (int y = horizon; y < h; y += 3) {
            int blue = 60 + (y - horizon) / 2;
            if (blue > 255) {
                blue = 255;
            }
            jPanelEditor.addFigure(new Rectangulo(new Color(0, 30, blue), 0, y, w, 4));

            if (Math.random() > 0.8) {
                int waveX = (int) (Math.random() * w);
                int waveW = 20 + (int) (Math.random() * 40);
                jPanelEditor.addFigure(new Linea(new Color(100, 150, 255), waveX, y, waveX + waveW, y));
            }
        }

        for (int i = 0; i < 60; i++) {
            int tx = (int) (Math.random() * w);
            int ty = horizon + (int) (Math.random() * (h - horizon));

            int tw = 8 + (ty - horizon) / 25;
            int th = 20 + (ty - horizon) / 8;

            jPanelEditor.addFigure(new Rectangulo(new Color(40, 25, 10), tx - tw / 2, ty - th, tw, th));

            for (int j = 0; j < 4; j++) {
                int fw = 30 + (ty - horizon) / 6 - j * 8;
                int fh = 40 + (ty - horizon) / 6 - j * 8;
                int fy = ty - th + 15 - j * 15;

                int green = 40 + j * 10;
                jPanelEditor.addFigure(new Triangulo(new Color(5, green, 15), tx - fw / 2, fy, tx, fy - fh, tx + fw / 2, fy));
            }
        }
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke((float) getStroke()));
        if (dashed) {
            float stroke = (float) getStroke();
            Stroke dashed = new BasicStroke(stroke, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
            g2d.setStroke(dashed);
        }
        for (Figure figura : figuras) {
            g2d.setColor(figura.getColor());
            figura.draw(g2d);

        }
    }

    public void move(int movX, int movY) {
        for (Figure figura : figuras) {
            figura.moveFigure(movX, movY);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMoveRight = new javax.swing.JButton();
        jbMoveTop = new javax.swing.JButton();
        jbMoveLeft = new javax.swing.JButton();
        jbMoveDown = new javax.swing.JButton();
        jbSpeed = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jbZoomIn = new javax.swing.JButton();
        jbZoomOut = new javax.swing.JButton();
        jbStrokePlus = new javax.swing.JButton();
        jbDashed = new javax.swing.JButton();
        jbStrokeLow = new javax.swing.JButton();

        jbMoveRight.setText("RIGHT");
        jbMoveRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveRightActionPerformed(evt);
            }
        });

        jbMoveTop.setText("UP");
        jbMoveTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveTopActionPerformed(evt);
            }
        });

        jbMoveLeft.setText("LEFT");
        jbMoveLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveLeftActionPerformed(evt);
            }
        });

        jbMoveDown.setText("DOWN");
        jbMoveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveDownActionPerformed(evt);
            }
        });

        jbSpeed.setMinimum(1);
        jbSpeed.setPaintLabels(true);
        jbSpeed.setPaintTicks(true);

        jLabel1.setText("SPEED");

        jbZoomIn.setText("Zoom +");
        jbZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZoomInActionPerformed(evt);
            }
        });

        jbZoomOut.setText("Zoom -");
        jbZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZoomOutActionPerformed(evt);
            }
        });

        jbStrokePlus.setText("Stroke +");
        jbStrokePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStrokePlusActionPerformed(evt);
            }
        });

        jbDashed.setText("Dashed");
        jbDashed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDashedActionPerformed(evt);
            }
        });

        jbStrokeLow.setText("Stroke -");
        jbStrokeLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStrokeLowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(246, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbMoveDown)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbMoveTop)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbMoveLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMoveRight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbZoomOut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbDashed, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbZoomIn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbStrokeLow, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbStrokePlus, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbDashed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbStrokePlus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbStrokeLow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbZoomIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbZoomOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMoveTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMoveLeft)
                    .addComponent(jbMoveRight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMoveDown)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbMoveRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveRightActionPerformed
        int valorActual = jbSpeed.getValue();
        CommandMove movimiento = new CommandMove(valorActual, 0, figuras);
        movimiento.execute();
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveRightActionPerformed

    private void jbMoveTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveTopActionPerformed
        int valorActual = jbSpeed.getValue();
        CommandMove movimiento = new CommandMove(0, valorActual * -1, figuras);
        movimiento.execute();
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveTopActionPerformed

    private void jbMoveLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveLeftActionPerformed
        int valorActual = jbSpeed.getValue();
        CommandMove movimiento = new CommandMove(valorActual * -1, 0, figuras);
        movimiento.execute();
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveLeftActionPerformed

    private void jbMoveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveDownActionPerformed
        int valorActual = jbSpeed.getValue();
        CommandMove movimiento = new CommandMove(0, valorActual, figuras);
        movimiento.execute();
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveDownActionPerformed

    private void jbZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZoomOutActionPerformed
        CommandZoom movimiento = new CommandZoom(getZoom() - 0.25);
        movimiento.execute();
        this.getParent().repaint();
    }//GEN-LAST:event_jbZoomOutActionPerformed

    private void jbZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZoomInActionPerformed
        CommandZoom movimiento = new CommandZoom(getZoom() + 0.25);
        movimiento.execute();
        this.getParent().repaint();
    }//GEN-LAST:event_jbZoomInActionPerformed

    private void jbStrokePlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStrokePlusActionPerformed
        CommandStroke movimiento = new CommandStroke(getStroke() + 0.25);
        movimiento.execute();
        this.getParent().repaint();
    }//GEN-LAST:event_jbStrokePlusActionPerformed

    private void jbDashedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDashedActionPerformed
        dashed = true;
        this.getParent().repaint();
    }//GEN-LAST:event_jbDashedActionPerformed

    private void jbStrokeLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStrokeLowActionPerformed
        CommandStroke movimiento = new CommandStroke(getStroke() - 0.25);
        movimiento.execute();
        this.getParent().repaint();
    }//GEN-LAST:event_jbStrokeLowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbDashed;
    private javax.swing.JButton jbMoveDown;
    private javax.swing.JButton jbMoveLeft;
    private javax.swing.JButton jbMoveRight;
    private javax.swing.JButton jbMoveTop;
    private javax.swing.JSlider jbSpeed;
    private javax.swing.JButton jbStrokeLow;
    private javax.swing.JButton jbStrokePlus;
    private javax.swing.JButton jbZoomIn;
    private javax.swing.JButton jbZoomOut;
    // End of variables declaration//GEN-END:variables
}
