//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public final class ControlPanel extends JPanel {
    private Rect rect;

    public Rect getToMove() {
        return this.rect;
    }

    public void setToMove(Rect toMove) {
        this.rect = toMove;
    }

    public ControlPanel(Rect toMove) {
        this.rect = toMove;
        this.addButtons(toMove);
    }

    private void addButtons(Rect toMove) {
        JButton moveRightBtn = new JButton("右移");
        this.add(moveRightBtn);
        ControlPanel.MoveRightHandler moveRightHandler = new ControlPanel.MoveRightHandler();
        moveRightBtn.addActionListener(moveRightHandler);
        JButton moveLeftBtn = new JButton("左移");
        this.add(moveLeftBtn);
        ControlPanel.MoveLeftHandler moveLeftHandler = new ControlPanel.MoveLeftHandler();
        moveLeftBtn.addActionListener(moveLeftHandler);
        JButton moveDownBtn = new JButton("下移");
        this.add(moveDownBtn);
        ControlPanel.MoveDownHandler moveDownHandler = new ControlPanel.MoveDownHandler();
        moveDownBtn.addActionListener(moveDownHandler);
        JButton moveUpBtn = new JButton("上移");
        this.add(moveUpBtn);
        ControlPanel.MoveUpHandler moveUpHandler = new ControlPanel.MoveUpHandler();
        moveUpBtn.addActionListener(moveUpHandler);
        JButton squatBtn = new JButton("下蹲");
        this.add(squatBtn);
        ControlPanel.SquatHandler squatHandler = new ControlPanel.SquatHandler();
        squatBtn.addActionListener(squatHandler);
        JButton standupBtn = new JButton("起立");
        this.add(standupBtn);
        ControlPanel.StandupHandler standupHandler = new ControlPanel.StandupHandler();
        standupBtn.addActionListener(standupHandler);
        JButton closeBtn = new JButton("退出");
        this.add(closeBtn);
        ControlPanel.CloseFrameHandler closeFrameHandler = new ControlPanel.CloseFrameHandler();
        closeBtn.addActionListener(closeFrameHandler);
    }

    private class CloseFrameHandler implements ActionListener {
        private CloseFrameHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class StandupHandler implements ActionListener {
        private StandupHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            ControlPanel.this.rect.standUp();
            ((MyFrame)ControlPanel.this.getRootPane().getParent()).getDrawingPanelForArray().repaint();
        }
    }

    private class SquatHandler implements ActionListener {
        private SquatHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            ControlPanel.this.rect.squat();
            ((MyFrame)ControlPanel.this.getRootPane().getParent()).getDrawingPanelForArray().repaint();
        }
    }

    private class MoveUpHandler implements ActionListener {
        private MoveUpHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            ControlPanel.this.rect.moveUp();
            ((MyFrame)ControlPanel.this.getRootPane().getParent()).getDrawingPanelForArray().repaint();
        }
    }

    private class MoveDownHandler implements ActionListener {
        private MoveDownHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            ControlPanel.this.rect.moveDown();
            ((MyFrame)ControlPanel.this.getRootPane().getParent()).getDrawingPanelForArray().repaint();
        }
    }

    private class MoveLeftHandler implements ActionListener {
        private MoveLeftHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            ControlPanel.this.rect.moveLeft();
            ((MyFrame)ControlPanel.this.getRootPane().getParent()).getDrawingPanelForArray().repaint();
        }
    }

    private class MoveRightHandler implements ActionListener {
        private MoveRightHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            ControlPanel.this.rect.moveRight();
            MyFrame myFrame = (MyFrame)ControlPanel.this.getRootPane().getParent();
            myFrame.getDrawingPanelForArray().repaint();
        }
    }
}
