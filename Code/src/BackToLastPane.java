import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackToLastPane implements ActionListener {
    public static JPanel lastPanel;
    @Override
    public void actionPerformed(ActionEvent e) {
        CreateUI.frame.setContentPane(lastPanel);
        System.out.println(CreateUI.frame.getContentPane().getName());
        CreateUI.frame.revalidate();

    }
}
