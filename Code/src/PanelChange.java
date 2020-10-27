import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class PanelChange implements ComponentListener {
    @Override
    public void componentResized(ComponentEvent e) {
        System.out.println("Resized");
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        System.out.println("Moved");
    }

    @Override
    public void componentShown(ComponentEvent e) {
        CreateUI UI = new CreateUI();
        BackToLastPane.lastPanel = UI.DndMonsterMaker;
    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
