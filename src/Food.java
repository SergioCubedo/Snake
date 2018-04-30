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
public class Food {

    public Node position;
    private Snake snake;

    public Food(Snake snake, ArrayList<Node> obsList) {
        this.snake = snake;
        this.position = position;
        generatePosition(obsList);

    }

    private void generatePosition(ArrayList<Node> obsList) {
        boolean hit = true;
        Node node = null;
        while ((hit)) {
            hit = true;
            int randomRow = (int) (Math.random() * Board.NUM_ROWS);
            int randomCol = (int) (Math.random() * Board.NUM_COLS);
            node = new Node(randomRow, randomCol);
            ArrayList<Node> arrayListNode = snake.getListNodes();
            hit = Util.checkNodeWhithNodeList(node, arrayListNode);
            if (!hit) {
                hit = Util.checkNodeWhithNodeList(node, obsList);
            }
        }
        position = node;
    }

    public void draw(Graphics g, int squareWidth, int squareHeight) {
        if (position != null) {
            Util.drawSquare(g, position, Color.yellow, squareWidth, squareHeight);
        }
    }

    public Node getPosition() {
        return position;
    }
}
