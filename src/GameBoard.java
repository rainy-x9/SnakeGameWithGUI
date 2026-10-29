import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoard extends JPanel implements ActionListener {

    private Snake snake;
    private SnakeFood food;

    private Timer timer;

    public GameBoard() {

        snake = new Snake(10,10);

        food = new SnakeFood(20,20);

        timer = new Timer(150, this);

        timer.start();
    }
/**
 * Draws all game objects on the screen.
 *
 * @param g Graphics object used for drawing
 */

public GameBoard() {
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        drawSnake(g);

        drawFood(g);
    }

    /**
 * Draws the food on the game board.
 *
 * @param g Graphics object used for drawing
 */
private void drawFood(Graphics g) {

    private void drawSnake(Graphics g) {

        g.setColor(Color.GREEN);

        for(int[] segment : snake.getBody()) {

            g.fillRect(
                segment[1] * 20,
                segment[0] * 20,
                20,
                20
            );
        }
    }

    private void drawFood(Graphics g) {

        g.setColor(Color.YELLOW);

        g.fillOval(
            food.getCol() * 20,
            food.getRow() * 20,
            20,
            20
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        snake.move();

        repaint();
    }
}
//needs keymovements 
//needs game over when it hits a wall
//add score
