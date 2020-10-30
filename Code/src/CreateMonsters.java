import javax.swing.*;
import java.awt.event.*;

public class CreateMonsters implements ActionListener {


    private JPanel MonsterPanel;
    private JTextField AC;
    private JTextField monsterNameTextField;
    private JTextField HPTextField;
    private JButton backButton;
    private JButton statsButton;
    private JLabel ArmorClassLabel;
    private JLabel HitPointsLabel;
    public static JPanel thisLastPanel;
    MonsterInfo monsterinfo;

    TextFieldActionListener textFieldListener;
    BackToLastPane backToLastPane = new BackToLastPane();
    CreateStatsUI statsUI = new CreateStatsUI();
    PanelChange panelChanger;




    public CreateMonsters(){
        CreateUI.panels[1] = MonsterPanel;
        panelChanger = new PanelChange();
        setDefaultNames("AC", AC);
        setDefaultNames("Monster Name", monsterNameTextField);
        setDefaultNames("HPTextField", HPTextField);
    AC = AssignListener(AC);
    monsterNameTextField = AssignListener(monsterNameTextField);
    HPTextField = AssignListener(HPTextField);
    backButton.addActionListener(backToLastPane);
    statsButton.addActionListener(statsUI);
    MonsterPanel.setName("Monster Panel");



    }

    public void actionPerformed(ActionEvent e) { //Called when the button is pressed. This is the first method that runs in this class.
        setMonsterUI();
        CreateUI.currentpanel += 1;
    }




    public void setMonsterUI() {
        //Initalizes the content pane.

        BackToLastPane.lastPanel = thisLastPanel;
        CreateUI.frame.setContentPane(new CreateMonsters().MonsterPanel);
        CreateUI.frame.revalidate();

    }


    public JTextField AssignListener(JTextField caller){
        textFieldListener = new TextFieldActionListener();
        caller.addActionListener(textFieldListener);
        caller.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if(caller.getText().equals("HP") || caller.getText().equals("AC") || caller.getText().equals("Monster Name")){
                    caller.setText(""); //Checks to see if the current text is the default, and if so, erases it.
                }

            }

            public void focusLost(FocusEvent e) {
                Totalinfo.setInfo(caller.getName(), caller.getText());
            }
        });

        return caller;
    }

    public static void setDefaultNames(String name, JTextField textField){
        textField.setName(name); //Sets the desired text field's name to parameter
    }






}
