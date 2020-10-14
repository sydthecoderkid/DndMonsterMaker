import javax.swing.*;
import java.awt.*;

public class CreateUI {

    private JPanel DndMonsterMaker;
    private JLabel DnDMonsterMaker;
    private JButton createNewMonsterButton;
    private JButton loadMonsterButton;

    public void createWindow() {
        JFrame frame = new JFrame("DndMonsterMaker");
        frame.setContentPane(new CreateUI().DndMonsterMaker);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(1000,700);
        frame.setPreferredSize(dimension);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }



}
