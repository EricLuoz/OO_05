import java.awt.Graphics;
import javax.swing.JPanel;

public final class DrawingPanelForArray extends JPanel {
    private Rect[] rects;

    public DrawingPanelForArray() {
    }

    public DrawingPanelForArray(Rect[] rects) {
        this.rects = rects;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Rect[] var2 = this.rects;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Rect rect = var2[var4];
            if (rect != null) {
                rect.drawMyself(g);
            }
        }

    }

    public void setShape(Rect[] rects) {
        this.rects = rects;
    }
}