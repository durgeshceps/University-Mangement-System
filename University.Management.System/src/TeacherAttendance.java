

package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherAttendance extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2;
    Choice c2, fh, sh;

    TeacherAttendance() {
        setLayout(new GridLayout(4, 2, 50, 50));

        // Roll Number Choice
        c2 = new Choice();
        try {
            conn c = new conn();
            ResultSet r5 = c.s.executeQuery("select * from Teacher");
            while (r5.next()) {   // ✅ fixed variable name
                c2.add(r5.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        add(new JLabel("Select Roll Number"));
        add(c2);

        // First Half Attendance
        l1 = new JLabel("First Half");
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");

        add(l1);
        add(fh);

        // Second Half Attendance
        l2 = new JLabel("Second Half");
        sh = new Choice();
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");

        add(l2);
        add(sh);

        // Buttons
        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(400, 450);
        setLocation(600, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String f = fh.getSelectedItem();
            String s = sh.getSelectedItem();
            String dt = new java.util.Date().toString();
            String id = c2.getSelectedItem();

            String qry = "insert into attendance_Teacher values('" + id + "', '" + dt + "', '" + f + "', '" + s + "')"; // ✅ fixed quotes

            try {
                conn c1 = new conn();
                c1.s.executeUpdate(qry); // ✅ fixed typo
                JOptionPane.showMessageDialog(null, "Attendance confirmed");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String s[]) {
        new TeacherAttendance();
    }
}

