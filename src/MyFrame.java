//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class MyFrame extends JFrame {
    private DrawingPanelForArray drawingPanelForArray;

    public MyFrame(DrawingPanelForArray drawingPanelForArray, ControlPanel controlPanel) {
        super("̹面向对象程序设计实验平台 by 佀同光");
        this.drawingPanelForArray = drawingPanelForArray;
        this.add(drawingPanelForArray);
        this.add(controlPanel, "South");
        this.setGui();
    }

    public MyFrame(DrawingPanelForArray drawingPanelForArray) {
        super("̹面向对象程序设计实验平台 by 佀同光");
        this.drawingPanelForArray = drawingPanelForArray;
        this.add(drawingPanelForArray);
        this.setGui();
    }

    private void setGui() {
        this.setVisible(true);
        this.setDefaultCloseOperation(0);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int choice = JOptionPane.showConfirmDialog(MyFrame.this, "确认退出吗", "提示", 0);
                if (choice == 0) {
                    System.exit(0);
                }

            }
        });
    }

    public DrawingPanelForArray getDrawingPanelForArray() {
        return this.drawingPanelForArray;
    }
}
