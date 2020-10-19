import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CreateMonsters implements ActionListener {


    private JPanel MonsterPanel;
    private JTextField AC;
    private JTextField monsterNameTextField;
    private JTextField HPTextField;

    MonsterInfo monsterinfo;

    TextFieldActionListener textFieldListener;

    public CreateMonsters(){

    AC = AssignListener(AC);
    monsterNameTextField = AssignListener(monsterNameTextField);
    HPTextField = AssignListener(HPTextField);
    setDefaultNames("AC", AC);
    setDefaultNames("Monster Name", monsterNameTextField);
    setDefaultNames("HPTextField", HPTextField);



    }

    public void actionPerformed(ActionEvent e) { //Called when the button is pressed.
        setMonsterUI();
        monsterinfo = new MonsterInfo();
    }




    public void setMonsterUI() {

        //Initalizes the content pane.
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
                // nothing
            }
        });

        return caller;
    }

    public static void setDefaultNames(String name, JTextField textField){
        textField.setName(name); //Sets the desired text field's name to parameter
    }



}
