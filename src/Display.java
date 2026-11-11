
import javax.swing.JFrame;

public class Display extends JFrame {

    public Display() {

        setTitle("Sudoku");

        setSize(600, 820);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setResizable(false);

        add(new GameBoard());

        setVisible(true);
    }
}

