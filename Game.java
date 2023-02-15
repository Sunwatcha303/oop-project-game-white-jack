import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {
    private JFrame frame; 
    private JPanel panel;

    private StartGUI startGUI;
    private JButton btnStart;
    private JButton btnExit;

    private int width;
    private int height;
    
    public Game(){
        initVariable();
        initWindow();
    }

    public void initWindow(){
        // btnStart.setBounds(100, 200, 200, 100);
        // btnExit.setBounds(400, 200, 200, 100);
        btnStart.setSize(200, 100);
        btnExit.setSize(200, 100);
        btnStart.setBorderPainted(false);
        btnStart.setFocusPainted(false);
        btnStart.setContentAreaFilled(false);
        btnExit.setBorderPainted(false);
        btnExit.setFocusPainted(false);
        btnExit.setContentAreaFilled(false);
        btnStart.add(Box.createHorizontalGlue());
        btnStart.add(Box.createVerticalGlue());;
        btnExit.add(Box.createHorizontalGlue());
        btnExit.add(Box.createVerticalGlue());;
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(btnStart);
        panel.add(btnExit);

        frame.add(panel);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initVariable(){
        frame = new JFrame("White Jack");

        panel = new JPanel();

        startGUI = new StartGUI();
        btnStart = startGUI.getStartButton();
        btnExit = startGUI.getExistButton();

        width = 800;
        height = 600;
    }

}
