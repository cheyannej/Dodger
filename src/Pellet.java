/*Cheyanne Jackson
GEEN163
November 13, 2016
Several objects of the Pellet class will move down the screen
 */

import java.awt.*;

public class Pellet {

    int xPos;  //horizontal position of the object
    int yPos;  //vertical position of the object
    int size;  //size of the object in pixels

    /**
     * constructor*
     */
    /**
     * Initialize class instance variables. Set color to whatever you like
     * (except white)*
     */
    public Pellet(int xLoc, int yLoc, int radius) {
        xPos = xLoc;
        yPos = yLoc;
        size = radius;
    }

    /**
     * Returns the vertical position of the object, yPos*
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * Set the yPos of the pellet object*
     */
    public void setyPos(int y) {
        yPos = y;
    }

    /**
     * Returns the horizontal position of the pellet, xPos*
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * Move the object's position down by howFar pixels. Add howFar to yPos*
     */
    public void drop(int howFar) {
        yPos += howFar;
    }

    /**
     * Draw the object at the current xPos and yPos as the upper left corner*
     */
    public void drawPellet(Graphics screen) {
        screen.setColor(Color.GREEN);
        screen.fillOval(xPos, yPos, size, size);
    }
}
