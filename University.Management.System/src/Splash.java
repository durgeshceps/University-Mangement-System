

package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash {

    public static void main(String[] args) {
        new SplashFrame().setVisible(true);
    }
}

class SplashFrame extends JFrame {

    SplashFrame() {
        setTitle("University Management System");
        setSize(600, 400);
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Load image from resources folder
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(getClass().getResource("D:\\University.Management.System\\src\\icone\\slide1.jpg"));
        } catch (Exception e) {
            System.out.println("Image not found: " + e.getMessage());
        }

        JLabel label = new JLabel();
        if (icon != null) {
            label.setIcon(icon);
        } else {
            label.setText("Splash Screen");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setFont(new Font("Serif", Font.BOLD, 24));
        }

        add(label, BorderLayout.CENTER);

        // Optional: close splash after 3 seconds
        new Timer(3000, e -> {
            dispose();
            new Project().setVisible(true); // Open main project window
        }).start();
    }
}

