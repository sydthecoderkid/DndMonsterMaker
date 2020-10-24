import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackToMainMenu implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        CreateUI.frame.setContentPane(new CreateUI().DndMonsterMaker);
        CreateUI.frame.revalidate();
    }
}
