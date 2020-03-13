import java.awt.Image;
import javax.swing.ImageIcon;

public class ImgHelper {
    public ImgHelper() {
    }

    public static Image getImage(String filename) {
        ImageIcon imageIcon = new ImageIcon(filename);
        Image image = imageIcon.getImage();
        return image;
    }
}
