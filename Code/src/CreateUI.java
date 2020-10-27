import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class CreateUI{

    public JPanel DndMonsterMaker;
    private JLabel DnDMonsterMaker;
    private JButton createNewMonsterButton;
    private JButton loadMonstersButton;

    public static JFrame frame;

    LoadMonsters monsterLoader;

    CreateMonsters monsterCreator;

    public static JPanel panels[];


    public static int currentpanel = 0;

    public CreateUI(){
        panels = new JPanel[4];
        monsterLoader = new LoadMonsters();
        monsterCreator = new CreateMonsters();
        createNewMonsterButton.addActionListener(monsterCreator);
        loadMonstersButton.addActionListener(monsterLoader);
        panels[0] = DndMonsterMaker;
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
