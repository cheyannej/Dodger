/*Cheyanne Jackson
GEEN163
November 13, 2016
A Dodger object moves left and right at the bottom of the screen trying to avoid the pellets
*/

import java.awt.*;

public class Dodger {

   int xPos;  //horizontal position of the object
   int yPos;  //vertical position of the object
   int size;  //size of the object in pixels
   int maXX;  //maximum value the xPos can be
      
   
   /**constructor**/
   /**Initialize class instance variables**/
   public Dodger(int xLoc, int yLoc, int heightWidth, int maxX) {
      xPos = xLoc;
      yPos = yLoc;
      size = heightWidth;
      this.maXX = maxX;
      
      }
      /**Move the Dodger object to the left by the specified amount**/
   public void moveLeft(int amount) {
      xPos -= amount;
      if(xPos < 0) {
         xPos = 0;
         }
      }
      /**Move the Dodger object to the right by the specified amount**/
   public void moveRight(int amount) {
      xPos += amount;
      if(xPos > maXX-size) {
         xPos = maXX- size;
         }
      }
      /**Draw the Dodger object at the current xPos and yPos as the upper left hand corner**/
   public void drawBoard(java.awt.Graphics canvas) {
      canvas.setColor(Color.RED);
      canvas.fillRect(xPos,yPos,70,30);
   
      }
      /**Returns true if this object touches the pellet. **/
   public boolean touches(Pellet dot) {
      int dSize = xPos - size/2;  // dodger size - subtract size divided by 2 to xPos
      int DSize = xPos + size;  // dodger size - adding size to xPos
   
      if(dot.getyPos() >= yPos && dot.getxPos() >= dSize && dot.getxPos() <= DSize) {
         return true;
         }
         return false;
      }
   }
