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

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.Color;

public class JPanelEditor extends javax.swing.JPanel {

    ArrayList<Figure> figuras = new ArrayList();

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

        Linea linea1 = new Linea(Color.yellow, 200, 1, 400, 400);
        Rectangulo rectangulo1 = new Rectangulo(Color.blue, 1, 200, 100, 180);
        Triangulo triangulo1 = new Triangulo(Color.red, 100, 50, 150, 100, 200, 150);
        Ovalo ovalo1 = new Ovalo(Color.gray, 400, 300, 200, 500);
        jPanelEditor.addFigure(linea1);
        jPanelEditor.addFigure(rectangulo1);
        jPanelEditor.addFigure(triangulo1);
        jPanelEditor.addFigure(ovalo1);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
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

        jbMoveRight.setText("-->");
        jbMoveRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveRightActionPerformed(evt);
            }
        });

        jbMoveTop.setText("^");
        jbMoveTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveTopActionPerformed(evt);
            }
        });

        jbMoveLeft.setText("<--");
        jbMoveLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveLeftActionPerformed(evt);
            }
        });

        jbMoveDown.setText("S");
        jbMoveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbMoveLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMoveRight, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbMoveTop)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbMoveDown)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jbMoveTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMoveRight)
                    .addComponent(jbMoveLeft))
                .addGap(1, 1, 1)
                .addComponent(jbMoveDown))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbMoveRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveRightActionPerformed
        int movX = 10;
        int movY = 0;
        move(movX, movY);
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveRightActionPerformed

    private void jbMoveTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveTopActionPerformed
        int movX = 0;
        int movY = -10;
        move(movX, movY);
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveTopActionPerformed

    private void jbMoveLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveLeftActionPerformed
        int movX = -10;
        int movY = 0;
        move(movX, movY);
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveLeftActionPerformed

    private void jbMoveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveDownActionPerformed
        int movX = 0;
        int movY = 10;
        move(movX, movY);
        this.getParent().repaint();
    }//GEN-LAST:event_jbMoveDownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbMoveDown;
    private javax.swing.JButton jbMoveLeft;
    private javax.swing.JButton jbMoveRight;
    private javax.swing.JButton jbMoveTop;
    // End of variables declaration//GEN-END:variables
}
