    /*Cheyanne Jackson
GEEN163
November 13, 2016
Write a program where an object dodges falling pellets
*/

import javax.swing.*;
import java.awt.*;

public class DodgerGameFrame extends JFrame implements java.awt.event.ActionListener {
   
   GamePanel panel = new GamePanel(500,500);  //create GamePanel object
   JButton leftB = new JButton("Left");  // create Button to move dodger
   JButton rightB = new JButton("Right");  // create Button to move dodger

   public DodgerGameFrame() {
      setSize(500,500);
      panel = new GamePanel(500,500-50);
      Container pane = getContentPane();
      Container pane2 = new Container();
      BoxLayout where = new BoxLayout(pane,BoxLayout.Y_AXIS);
      setLayout(where);
      BoxLayout buttonLayout = new BoxLayout(pane2,BoxLayout.X_AXIS);
      pane2.setLayout(buttonLayout);
      
      pane.add(panel);
      pane.add(pane2);
      pane2.add(leftB);   // Add the other GUI objects in the same manner as above.
      pane2.add(rightB);
      
      
      leftB.addActionListener(this);
      rightB.addActionListener(this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible( true );
      }
   
   public void actionPerformed(java.awt.event.ActionEvent thing) {
      if(thing.getSource() == leftB) {
         panel.moveLeft();
         }
      if(thing.getSource() == rightB) {
         panel.moveRight();
         }
      }

   public static void main(String[]args) {
      DodgerGameFrame ant = new DodgerGameFrame();
      }
   }
