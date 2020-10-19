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
        textFieldListener = new TextFieldActionListener();
        AC.addActionListener(textFieldListener);
        AC.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                AC.setText("");
            }

            public void focusLost(FocusEvent e) {
                // nothing
            }
        });

        monsterNameTextField.addActionListener(textFieldListener);
        monsterNameTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                monsterNameTextField.setText("");
            }

            public void focusLost(FocusEvent e) {
                // nothing
            }
        });
    }

    public void actionPerformed(ActionEvent e) { //Called when the button is pressed.
        setMonsterUI();
        monsterinfo = new MonsterInfo();

    }




    public void setMonsterUI() {


        CreateUI.frame.setContentPane(new CreateMonsters().MonsterPanel);
        CreateUI.frame.revalidate();

    }



}
