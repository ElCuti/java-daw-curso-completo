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
        JFrame window = new JFrame("Mi Editor");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(jPanelEditor);
        window.setSize(750, 500);
        window.setLocation(100, 100);
        window.setVisible(true);

        Ovalo sol = new Ovalo(Color.orange, 560, 40, 120, 120);
        Linea r1 = new Linea(Color.yellow, 620, 100, 700, 40);
        Linea r2 = new Linea(Color.yellow, 620, 100, 700, 100);
        Linea r3 = new Linea(Color.yellow, 620, 100, 700, 160);
        Linea r4 = new Linea(Color.yellow, 620, 100, 560, 10);
        Linea r5 = new Linea(Color.yellow, 620, 100, 520, 60);

        Rectangulo suelo = new Rectangulo(new Color(34, 139, 34), 0, 380, 750, 120);

        Rectangulo cuerpo = new Rectangulo(new Color(200, 120, 80), 120, 230, 220, 150);
        Triangulo tejado = new Triangulo(new Color(150, 50, 30), 120, 230, 230, 140, 340, 230);
        Rectangulo puerta = new Rectangulo(new Color(90, 50, 30), 200, 310, 40, 70);
        Ovalo ventana1 = new Ovalo(Color.white, 150, 260, 40, 40);
        Ovalo ventana2 = new Ovalo(Color.white, 270, 260, 40, 40);

        Rectangulo tronco = new Rectangulo(new Color(101, 67, 33), 420, 300, 30, 80);
        Ovalo copa1 = new Ovalo(new Color(34, 139, 34), 390, 240, 90, 70);
        Ovalo copa2 = new Ovalo(new Color(50, 205, 50), 430, 220, 90, 80);

        jPanelEditor.addFigure(suelo);
        jPanelEditor.addFigure(sol);
        jPanelEditor.addFigure(r1);
        jPanelEditor.addFigure(r2);
        jPanelEditor.addFigure(r3);
        jPanelEditor.addFigure(r4);
        jPanelEditor.addFigure(r5);
        jPanelEditor.addFigure(cuerpo);
        jPanelEditor.addFigure(tejado);
        jPanelEditor.addFigure(puerta);
        jPanelEditor.addFigure(ventana1);
        jPanelEditor.addFigure(ventana2);
        jPanelEditor.addFigure(tronco);
        jPanelEditor.addFigure(copa1);
        jPanelEditor.addFigure(copa2);

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        jButton1.setText("Stroke +");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dashed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbMoveDown)
                            .addGap(36, 36, 36))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(60, 60, 60))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbMoveTop)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbMoveLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMoveRight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbZoomIn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbZoomOut, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(3, 3, 3)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbZoomIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbZoomOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
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
        int movX = valorActual;
        int movY = 0;
        move(movX, movY);
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveRightActionPerformed

    private void jbMoveTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveTopActionPerformed
        int valorActual = jbSpeed.getValue();
        int movX = 0;
        int movY = -1 * valorActual;
        move(movX, movY);
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveTopActionPerformed

    private void jbMoveLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveLeftActionPerformed
        int valorActual = jbSpeed.getValue();
        int movX = -1 * valorActual;
        int movY = 0;
        move(movX, movY);
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveLeftActionPerformed

    private void jbMoveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveDownActionPerformed
        int valorActual = jbSpeed.getValue();
        int movX = 0;
        int movY = valorActual;
        move(movX, movY);
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveDownActionPerformed

    private void jbZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZoomOutActionPerformed
        double typeZoom = getZoom();
        typeZoom -= 0.25;
        if (typeZoom < 0.25) {
            typeZoom = 0.25;
        }
        setZoom(typeZoom);
        this.getParent().repaint();
    }//GEN-LAST:event_jbZoomOutActionPerformed

    private void jbZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZoomInActionPerformed
        double typeZoom = getZoom();
        typeZoom += 0.25;
        if (typeZoom > 2) {
            typeZoom = 2;
        }
        setZoom(typeZoom);
        this.getParent().repaint();
    }//GEN-LAST:event_jbZoomInActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double typeStroke = getStroke();
        typeStroke += 0.25;
        setStroke(typeStroke);
        this.getParent().repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dashed = true;
        this.getParent().repaint();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbMoveDown;
    private javax.swing.JButton jbMoveLeft;
    private javax.swing.JButton jbMoveRight;
    private javax.swing.JButton jbMoveTop;
    private javax.swing.JSlider jbSpeed;
    private javax.swing.JButton jbZoomIn;
    private javax.swing.JButton jbZoomOut;
    // End of variables declaration//GEN-END:variables
}
