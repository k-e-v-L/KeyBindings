import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game(){

        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.green);
        label.setBounds(90,90,90,90);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        label.getActionMap().put("leftAction", leftAction);
        frame.add(label);
        frame.setVisible(true);

    }
    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setLocation(label.getX(),label.getY()-10);

        }
    }
    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setLocation(label.getX()-10,label.getY());

        }
    }
    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setLocation(label.getX(),label.getY()+10);

        }
    }
    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            label.setLocation(label.getX()+10,label.getY());

        }
    }
}
