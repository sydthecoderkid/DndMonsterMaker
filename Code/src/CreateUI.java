import java.awt.*;
import javax.swing.*;



public class CreateUI extends JPanel{

    public static void createWindow(){
        JFrame frame = new JFrame("D&DMonsterMaker");
        frame.getContentPane().add(new CreateUI());
        int width = 1000;
        int height = 700;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.pack();
        frame.setSize (width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void paint(Graphics g){


        g.setFont(new Font("TimesRoman", Font.PLAIN, 32));
        g.drawString("D&D Monster Maker",350,40);
        

    }
}
