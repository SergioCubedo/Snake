/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author alu20490610w
 */
public class Snake {

    private ArrayList<Node> arrayListNode;
    private DirectionType directionType;
    private int eatCounter;

    
    public Snake() {
        initsNodes();
        directionType = DirectionType.RIGTH;
        eatCounter = 0;

    }

    public ArrayList<Node> getListNodes() {
        return arrayListNode;
    }

    private void initsNodes() {
        arrayListNode = new ArrayList<Node>();
        arrayListNode.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2));
        arrayListNode.add(new Node(Board.NUM_ROWS / 2 - 1, Board.NUM_COLS / 2));
        arrayListNode.add(new Node(Board.NUM_ROWS / 2 - 2, Board.NUM_COLS / 2));
    }

    public void draw(Graphics g, int squareWidth, int squareHeight) {
        for (Node n : arrayListNode) {
            Util.drawSquare(g, n, Color.black, squareWidth, squareHeight);

        }

    }
    public DirectionType getDirection() {
        return directionType;
    }

}
