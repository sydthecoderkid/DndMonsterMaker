import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackToLastPane implements ActionListener {
    public static JPanel lastPanel;
    @Override
    public void actionPerformed(ActionEvent e) {
        CreateUI.currentpanel -= 1;
        lastPanel = CreateUI.panels[CreateUI.currentpanel];
        CreateUI.frame.setContentPane(lastPanel);
        CreateUI.frame.revalidate();

    }
}
