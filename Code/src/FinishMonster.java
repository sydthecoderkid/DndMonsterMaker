import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinishMonster implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        CreatePDF creator = new CreatePDF();
        creator.createDocument();
    }
}
