import javax.swing.JFrame;

public class Display extends JFrame {

    public Display() {

        setTitle("Snake Game");

        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        add(new GameBoard());

        setVisible(true);
    }
}
//still working on this
//Own display group
