/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author alu20490610w
 */
public class Board extends JPanel implements ActionListener {

    public static final int NUM_ROWS = 30;
    public static final int NUM_COLS = 10;

    private int deltaTime;
    private Food food;
    private SpecialFood splecialFood;
    private Snake snake;
    private Timer timer;

    private ScoreBoard scoreboard;

    public Board() {
        super();
        initValues();
        timer = new Timer(deltaTime, this);
    }

    public void setScoreBoard(ScoreBoard scoreboard) {
        this.scoreboard = scoreboard;
    }

    public void initValues() {
        setFocusable(true);
        snake = new Snake();
        deltaTime = 500;

    }

    public void initGame() {
        initValues();
        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void processGameOver() {
        timer.stop();
        //removeKeyListener(myKeyAdapter);
        scoreboard.displayGameOver();

    }

    private boolean canMoveTo(DirectionType newDirection) {
        DirectionType snakeDirection = snake.getDirection();
        switch (newDirection) {
            case UP:
            case DOWN:
                if (snakeDirection == DirectionType.UP || snakeDirection == DirectionType.DOWN) {
                    return false;
                } else {
                    return true;
                }
            case RIGTH:
            case LEFT:
                if (snakeDirection == DirectionType.LEFT || snakeDirection == DirectionType.RIGTH) {
                    return false;
                } else {
                    return true;
                }

        }
        return false;

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //drawBoard(g);
        if (snake != null) {
             snake.draw(g, getSquareWidth(), getSquareHeight());
        }

    }

    public int getSquareWidth() {
        return getWidth() / NUM_COLS;

    }

    public int getSquareHeight() {
        return getHeight() / NUM_ROWS;

    }

}
