package main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {

    //SCREEN SETTINGS
    final int originalTileSize = 32; //16x16
    final int scale = 2;

    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
}
