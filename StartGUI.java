import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;  

public class StartGUI {
    private JButton btnStart;
    private JButton btnExit;
    
    public StartGUI(){
        initVariable();
    }

    public void initVariable(){
        BufferedImage iconStart;
        BufferedImage iconExit;
        try {
            iconStart = ImageIO.read(new File("asset/button/Start-Button.png"));
            Image iconStartImage = iconStart.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
            iconExit = ImageIO.read(new File("asset/button/Exit-Button.png"));
            Image iconExitImage = iconExit.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
            btnStart = new JButton(new ImageIcon(iconStartImage));
            btnExit = new JButton(new ImageIcon(iconExitImage));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public JButton getStartButton(){
        return btnStart;
    }

    public JButton getExistButton(){
        return btnExit;
    }
}
