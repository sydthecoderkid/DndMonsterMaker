import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateStatsUI implements ActionListener {
    private JPanel StatsPanel;
    private JLabel Stats;
    private JTextField strBonusTextField;
    private JTextField dexBonusTextField;
    private JTextField charBonusTextField;
    private JTextField wisBonusTextField;

    @Override
    public void actionPerformed(ActionEvent e) {
        initalizeThisPane();
    }

    public void initalizeThisPane(){
        CreateUI.frame.setContentPane(new CreateStatsUI().StatsPanel);
        CreateUI.frame.revalidate();
    }

    public static void setDefaultNames(String name, JTextField textField){
        textField.setName(name); //Sets the desired text field's name to parameter
    }


}
