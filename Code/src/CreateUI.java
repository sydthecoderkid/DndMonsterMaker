import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class CreateUI{

    public JPanel DndMonsterMaker;
    private JLabel DnDMonsterMaker;
    private JButton createNewMonsterButton;
    private JButton loadMonstersButton;

    public static JFrame frame;

    LoadMonsters monsterLoader;

    CreateMonsters monsterCreator;

    public CreateUI(){
        monsterLoader = new LoadMonsters();
        monsterCreator = new CreateMonsters();
        createNewMonsterButton.addActionListener(monsterCreator);
        loadMonstersButton.addActionListener(monsterLoader);
    }

    public void createWindow() {

        frame = new JFrame("DndMonsterMaker");
        frame.setContentPane(new CreateUI().DndMonsterMaker);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(1000,700);
        frame.setPreferredSize(dimension);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }







}
