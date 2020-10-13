import java.awt.*;
import javax.swing.*;

public class CreateUI extends JPanel{

     static JFrame frame = new JFrame("D&DMonsterMaker");

    public static void createWindow(){

        int width = 1000;
        int height = 700;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.pack();
        frame.setSize (width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        createMainMenu(graphics);
    }

    public static void createMainMenu(Graphics graphics){
        graphics.drawString("Welcome, Dungeon Master.", 10, 10);
    }
}
