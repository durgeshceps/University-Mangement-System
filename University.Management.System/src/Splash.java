////part1
//
//package university.management.system;
//
//import java.awt.*;
//import javax.swing.*;
//
//
//
//
//public class Splash {
//public static void main(String []  args){
//    SplashFrame f = new SplashFrame("KG University");
//    f.setVisible(true);
//    int i;
//    int x = 1;
//    for(i = 2; i<= 600; i += 4, x += 1){
//        f.setLocation((800 - (( i + x) / 2) ), 500 - (i / 2));
//        f.setSize(i+3*x, i+x/2);
//        try {
//            Thread.sleep(10);
//        } catch (Exception e){
//
//        }
//    }
//   }
//  }
//
//   class SplashFrame extends JFrame implements Runnable {
//       SplashFrame(String s) {
//           super(s);
//           setLayout(new FlowLayout());
//
//           ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("src/icone/slide1.jpg"));
//           Image i1 = c1.getImage().getScaledInstance(1200, 675, Image.SCALE_DEFAULT);
//           ImageIcon i2 = new ImageIcon(i1);
//
//           JLabel m1 = new JLabel(i2);
//           add(m1);
//           Thread t1 = new Thread(this);
//           t1.start();
//
//       }
//
//
//       public void run() {
//           try {
//               Thread.sleep(7000);
//               this.setVisible(false);
//
//
//               Login f1 = new Login();
//           } catch (Exception e) {
//               e.printStackTrace();
//           }
//       }
//   }
//
//
//

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
