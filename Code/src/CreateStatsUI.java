import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateStatsUI implements ActionListener {
    private JPanel StatsPanel;
    private JLabel Stats;

    @Override
    public void actionPerformed(ActionEvent e) {
        initalizeThisPane();
    }

    public void initalizeThisPane(){
        CreateUI.frame.setContentPane(new CreateStatsUI().StatsPanel);
        CreateUI.frame.revalidate();
    }

}
