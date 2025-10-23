
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    Login() {
        super("Login");

        setBackground(Color.white);
        setLayout(null);

        // Username label and field
        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        add(t1);

        // Password label and field
        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        t2 = new JPasswordField();
        t2.setBounds(150, 70, 150, 30);
        add(t2);

        // Safe image loading
        ImageIcon i1;
        URL imgUrl = getClass().getClassLoader().getResource("D:\\University.Management.System\\src\\icone\\slide1.jpg");
        if (imgUrl != null) {
            i1 = new ImageIcon(imgUrl);
        } else {
            System.out.println("Image not found!");
            i1 = new ImageIcon(); // empty icon as fallback
        }
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350, 20, 100, 100);
        add(l3);

        // Buttons
        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600, 300);
        setLocation(500, 300);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                conn c1 = new conn();
                String u = t1.getText();
                String v = new String(t2.getPassword());

                String q = "SELECT * FROM login WHERE username='" + u + "' AND password='" + v + "'";
                ResultSet rs = c1.s.executeQuery(q);

                if (rs.next()) {
                    new Project().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

