import java.awt.*;
import javax.swing.*;




public class CreateUI extends JPanel{
    static JFrame frame = new JFrame("D&DMonsterMaker");

    public static void createWindow(){
        frame.getContentPane().add(new CreateUI());
        GroupLayout layout = new GroupLayout(frame);
        int width = 1000;
        int height = 700;
        setTitle();
        createButtons();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.pack();
        frame.setSize (width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void paint(Graphics g){

    }

    public static void setTitle(){
        JLabel label = new JLabel();
        label.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        label.setHorizontalAlignment(0);
        label.setVerticalAlignment(1);
        label.setText("D&D Monster Maker");
        frame.add(label);
    }

    public static void createButtons(){

    }

}
