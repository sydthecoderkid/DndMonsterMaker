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
    TextFieldActionListener textFieldListener = new TextFieldActionListener();


    public CreateStatsUI(){

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




    }
    @Override
    public void actionPerformed(ActionEvent e) {
        initializeThisPlane();

    }

    public void initializeThisPlane(){
        CreateUI.frame.setContentPane(new CreateStatsUI().StatsPanel);
        CreateUI.frame.revalidate();
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
                // nothing
            }
        });

        return caller;
    }


}
