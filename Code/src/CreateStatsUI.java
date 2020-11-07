import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CreateStatsUI implements ActionListener {
    private JPanel StatsPanel;
    private JLabel Stats;
    private JTextField strBonusTextField;
    private JTextField dexBonusTextField;
    private JTextField wisBonusTextField;
    private JTextField conBonusTextField;
    private JTextField intBonusTextField;
    private JTextField charBonusTextField;
    private JButton backButton;
    private JButton CreateAttacks;
    TextFieldActionListener textFieldListener = new TextFieldActionListener();
    CreateAttacks attackCreator = new CreateAttacks();

    public static String strText;
    public static String dexText;
    public static String wisText;
    public static String conText;
    public static String intText;
    public static String charText;


    /*To assign each one of these values to their proper variables,
    have them be equal to the default text at first, but when the button is pressed
    each one is set equal to their respective key in the hashmap. No array needed!

    */

    public CreateStatsUI(){
       CreateUI.panels[2] = StatsPanel;
        BackToLastPane backToLastPane = new BackToLastPane();
        setDefaultNames("Str", strBonusTextField);
        setDefaultNames("Dex", dexBonusTextField);
        setDefaultNames("Wis", wisBonusTextField);
        setDefaultNames("Con", conBonusTextField);
        setDefaultNames("Int", intBonusTextField);
        setDefaultNames("Char", charBonusTextField);


        strBonusTextField = AssignListener(strBonusTextField);
        dexBonusTextField = AssignListener(dexBonusTextField);
        conBonusTextField = AssignListener(conBonusTextField);
        wisBonusTextField = AssignListener(wisBonusTextField);
        intBonusTextField = AssignListener(intBonusTextField);
        charBonusTextField = AssignListener(charBonusTextField);

        backButton.addActionListener(backToLastPane);
        CreateAttacks.addActionListener(attackCreator);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        initializeThisPlane();
        CreateUI.currentpanel += 1;

    }

    public void initializeThisPlane(){

        BackToLastPane.lastPanel = (JPanel) CreateUI.frame.getContentPane();
        CreateUI.frame.setContentPane(new CreateStatsUI().StatsPanel);
        CreateUI.frame.revalidate(); //This line is key.

    }

    public static void setDefaultNames(String name, JTextField textField){
        textField.setName(name); //Sets the desired text field's name to parameter
    }

    public JTextField AssignListener(JTextField caller){
        textFieldListener = new TextFieldActionListener();
        caller.addActionListener(textFieldListener);
        caller.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if(caller.getText().equals("Str Bonus") || caller.getText().equals("Dex Bonus") || caller.getText().equals("Wis Bonus") || caller.getText().equals("Con Bonus") || caller.getText().equals("Int Bonus") || caller.getText().equals("Char Bonus")){
                    caller.setText(""); //Checks to see if the current text is the default, and if so, erases it.
                }
            }
            public void focusLost(FocusEvent e) {
                Totalinfo.setInfo(caller.getName(), caller.getText());
            }
        });

        return caller;
    }


}
