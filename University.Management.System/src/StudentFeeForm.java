package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentFeeForm extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6;
    Choice croll;
    JTextField t1, t2, t3;
    JButton b1, b2;

    StudentFeeForm() {
        setTitle("Student Fee Form");
        setSize(500, 400);
        setLocation(450, 200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Roll Number
        l1 = new JLabel("Select Roll Number");
        l1.setBounds(50, 50, 150, 30);
        add(l1);

        croll = new Choice();
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                croll.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        croll.setBounds(220, 50, 200, 30);
        add(croll);

        // Course
        l2 = new JLabel("Course");
        l2.setBounds(50, 100, 150, 30);
        add(l2);

        l3 = new JLabel();
        l3.setBounds(220, 100, 200, 30);
        add(l3);

        // Branch
        l4 = new JLabel("Branch");
        l4.setBounds(50, 150, 150, 30);
        add(l4);

        l5 = new JLabel();
        l5.setBounds(220, 150, 200, 30);
        add(l5);

        // Fee Amount
        l6 = new JLabel("Fee Paid");
        l6.setBounds(50, 200, 150, 30);
        add(l6);

        t1 = new JTextField();
        t1.setBounds(220, 200, 200, 30);
        add(t1);

        // Buttons
        b1 = new JButton("Pay Fee");
        b1.setBounds(100, 270, 120, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(260, 270, 120, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        // Load Course & Branch on Roll Selection
        croll.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from student where rollno='" + croll.getSelectedItem() + "'");
                    if (rs.next()) {
                        l3.setText(rs.getString("course"));
                        l5.setText(rs.getString("branch"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String rollno = croll.getSelectedItem();
            String course = l3.getText();
            String branch = l5.getText();
            String fee = t1.getText();

            try {
                conn c = new conn();
                String q = "insert into student_fee values('" + rollno + "', '" + course + "', '" + branch + "', '" + fee + "')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Fee Paid Successfully!");
                this.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentFeeForm();
    }
}
