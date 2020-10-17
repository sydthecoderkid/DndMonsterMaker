import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateMonsters implements ActionListener {


    private JPanel MonsterPanel;

    public void actionPerformed(ActionEvent e) {
        setMonsterUI();
    }

    public void setMonsterUI() {

        JFrame frame = new JFrame("MonsterMaker");
        frame.setContentPane(new CreateMonsters().MonsterPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(1000,700);
        frame.setPreferredSize(dimension);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        CreateUI.frame.setVisible(false);
    }
}
