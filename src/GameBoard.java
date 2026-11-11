
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class GameBoard extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        
        Color myBlue = new Color(30, 100, 200);

        g2.setColor(myBlue);
        g2.fillRect(0, 0, getWidth(), getHeight() / 2);

        
        g2.setColor(new Color(235, 235, 245));
        g2.setFont(new Font("Century Gothic", Font.PLAIN, 55));

        String title = "SuDoKu";

        FontMetrics fm = g2.getFontMetrics();

        int x = (getWidth() - fm.stringWidth(title)) / 2;
        int y = 220;

        g2.drawString(title, x, y);
    }
}

