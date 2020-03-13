import java.awt.*;

public class Rect {


    public void drawMyself(Graphics g) {
        //创建imgHelper对象
        ImgHelper imgHelper = new ImgHelper();
        //调用imgHelper对象的getImage方法返回一个Image对象与ig关联
        Image ig = imgHelper.getImage("src/stickman_standing.png");
        //调用drawImage方法画出自己
        g.drawImage(ig, this.x, this.y, this.w, this.h, null);
        //调用drawString方法打印当前坐标
        //g.drawString("姚兵201602104058"+"当前位置"+"("+this.x+","+this.y+")", this.x, this.y);
    }
    public void standUp() {

    }

    public void squat() {

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    //使角色右移
    public void moveRight() {
        this.x += 5;
    }

    //使角色左移
    public void moveLeft() {
        this.x -= 5;
    }

    //使角色上移
    public void moveUp() {
        this.y -= 5;
    }

    //使角色下移
    public void moveDown() {
        this.y += 5;
    }


    //角色的初始坐标
    private int x = 100;
    private int y = 100;
    //角色的高度宽度
    private int w = 50;
    private int h = 50;


}

