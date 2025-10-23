

package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    JButton b1;

    EnterMarks() {
        setSize(500, 550);
        setLocation(400, 200);
        setLayout(null);

        // Heading
        l1 = new JLabel("Enter marks of Student");
        l1.setFont(new Font("serif", Font.BOLD, 30));
        l1.setBounds(50, 0, 500, 80);
        add(l1);

        // Roll Number
        l2 = new JLabel("Enter Roll Number");
        l2.setBounds(50, 70, 200, 40);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(200, 80, 200, 25);
        add(t1);

        // Labels for subject and marks
        l3 = new JLabel("Enter Subject");
        l3.setBounds(50, 150, 200, 40);
        add(l3);

        l4 = new JLabel("Enter Marks");
        l4.setBounds(250, 150, 200, 40);
        add(l4);

        // Subject + Marks fields
        t2 = new JTextField(); // subject 1
        t2.setBounds(50, 200, 150, 25);
        add(t2);

        t5 = new JTextField(); // marks 1
        t5.setBounds(250, 200, 150, 25);
        add(t5);

        t3 = new JTextField(); // subject 2
        t3.setBounds(50, 240, 150, 25);
        add(t3);

        t6 = new JTextField(); // marks 2
        t6.setBounds(250, 240, 150, 25);
        add(t6);

        t4 = new JTextField(); // subject 3
        t4.setBounds(50, 280, 150, 25);
        add(t4);

        t7 = new JTextField(); // marks 3
        t7.setBounds(250, 280, 150, 25);
        add(t7);

        t8 = new JTextField(); // subject 4
        t8.setBounds(50, 320, 150, 25);
        add(t8);

        t9 = new JTextField(); // marks 4
        t9.setBounds(250, 320, 150, 25);
        add(t9);

        t10 = new JTextField(); // subject 5
        t10.setBounds(50, 360, 150, 25);
        add(t10);

        t11 = new JTextField(); // marks 5
        t11.setBounds(250, 360, 150, 25);
        add(t11);

        // Submit Button
        b1 = new JButton("Submit");
        b1.setBounds(180, 420, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                conn c1 = new conn();

                // Insert two records for demo, you can expand
                String s1 = "insert into subject values('" + t1.getText() + "','" + t2.getText() + "','" + t5.getText() + "')";
                String s2 = "insert into subject values('" + t1.getText() + "','" + t3.getText() + "','" + t6.getText() + "')";

                c1.s.executeUpdate(s1);
                c1.s.executeUpdate(s2);

                JOptionPane.showMessageDialog(null, "Marks Inserted Successfully");
                this.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new EnterMarks().setVisible(true);
    }
}

