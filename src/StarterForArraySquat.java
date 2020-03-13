public final class StarterForArraySquat {
    public StarterForArraySquat() {
    }

    public static void main(String[] args) {
        Rect[] rects = new Rect[3];
        Rect rect0 = new Rect();
        rects[0] = rect0;
        rect0.moveDown();
        rect0.moveRight();
        Rect rect1 = new Rect();

        for(int i = 1; i < 10; ++i) {
            rect1.moveLeft();
            rect1.moveDown();
        }

        rects[1] = rect1;
        rects[2] = new Rect();
        DrawingPanelForArray drawingPanelForArray = new DrawingPanelForArray(rects);
        ControlPanel controlPanel = new ControlPanel(rect0);
        MyFrame myFrame = new MyFrame(drawingPanelForArray, controlPanel);
        myFrame.setSize(500, 400);
        myFrame.setVisible(true);
    }
}