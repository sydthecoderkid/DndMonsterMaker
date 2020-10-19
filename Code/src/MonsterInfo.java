import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.TextAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonsterInfo implements DocumentListener {


    @Override
    public void insertUpdate(DocumentEvent e) {
        System.out.println("Hey");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("Hey");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        System.out.println("Hey");
    }
}
