import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    TicTacToe game;
    int WINDOW_WIDTH = 500;
    int WINDOW_HEIGHT = 500;

    public TicTacToeViewer (TicTacToe game)
    {
        this.game = game;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("TicTacToe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public void paint(Graphics g)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                game.getBoard()[i][j].drawSquare(g);
            }
        }
        for (int i = 0; i < 3; i++)
        {
            g.drawString(Integer.toString(i), 150 + i * 100, 50);
        }
        for (int i = 0; i < 3; i++)
        {
            g.drawString(Integer.toString(i), 50, 150 + i * 100);
        }
        if (game.getGameOver() == true)
        {
            g.drawString("The winner is " + game.getWinner(), 200, 450);

        }
    }
}
