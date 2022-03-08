package assignment_6.prog1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JTextField text;

    public MyFrame() {

        JPanel mainPanel = new JPanel();
        text = new JTextField(10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Address Form");
        setSize(600, 240);
        centerFrameOnDesktop(this);
        setResizable(false);

        mainPanel.add(text);


    }

    public static void centerFrameOnDesktop(Component f) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2),
                (height - frameHeight) / 3);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyFrame mf = new MyFrame();
                mf.setVisible(true);
            }
        });

    }
}