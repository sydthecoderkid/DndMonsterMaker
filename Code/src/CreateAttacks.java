import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CreateAttacks implements ActionListener {

    public static JPanel thisLastPanel;
    private JPanel CreateAttackPanel;
    private JLabel CreateAttacks;
    private JTextArea attackOneTextArea;
    private JTextArea attackTwoTextArea;
    private JTextArea attackThreeTextAre;
    public TextFieldActionListener textFieldListener;

    public CreateAttacks(){
        CreateUI.panels[2] = CreateAttackPanel;
        attackOneTextArea = AssignListener(attackOneTextArea);
        attackOneTextArea.setName("attackOneTextAre");

        attackTwoTextArea = AssignListener(attackTwoTextArea);
        attackTwoTextArea.setName("attackTwoTextArea");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        CreateUI.currentpanel += 1;
        setUI();
    }

    public void setUI(){
        BackToLastPane.lastPanel = thisLastPanel;
        CreateUI.frame.setContentPane(new CreateAttacks().CreateAttackPanel);
        CreateUI.frame.revalidate();
    }

    public JTextArea AssignListener(JTextArea caller){
        textFieldListener = new TextFieldActionListener();
        caller.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if(caller.getText().equals("Attack One:") || caller.getText().equals("Attack Two:")){
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
