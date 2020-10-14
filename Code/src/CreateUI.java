import javax.swing.*;

public class CreateUI {

    private JPanel DndMonsterMaker;
    private JLabel DnDMonsterMaker;

    public void createWindow() {
        JFrame frame = new JFrame("DndMonsterMaker");
        frame.setContentPane(new CreateUI().DndMonsterMaker);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
