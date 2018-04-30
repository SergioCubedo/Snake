/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author alu20490610w
 */
public class SpecialFood extends Food {

    private int visibleTime;

    public SpecialFood(Snake snake,ArrayList<Node> obsList) {
        super(snake, obsList);
        visibleTime = 10;
    }
    
     public void draw(Graphics g, int squareWidth, int squareHeight) {
        if (position != null) {
            Util.drawSquare(g, position, Color.red, squareWidth, squareHeight);
        }
    }


}
