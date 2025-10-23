

package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class TeacherAttendanceDetail extends JFrame implements ActionListener {

    JTable j1;
    JButton b1;
    String h[] = {"Roll Number", "Date Time", "First Half", "Second Half"};
    String d[][] = new String[100][4];  // increased size
    int i = 0, j = 0;

    TeacherAttendanceDetail() {
        super("View Teacher Attendance");
        setSize(800, 300);
        setLocation(450, 150);

        try {
            String q = "select * from attendance_Teacher";
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery(q);

            while (rs.next()) {
                d[i][j++] = rs.getString("rollno");
                d[i][j++] = rs.getString("date");
                d[i][j++] = rs.getString("first");
                d[i][j++] = rs.getString("second");
                i++;
                j = 0;
            }

            j1 = new JTable(d, h);

        } catch (Exception e) {
            e.printStackTrace();
        }

        b1 = new JButton("Print");
        add(b1, BorderLayout.SOUTH);

        JScrollPane s1 = new JScrollPane(j1);
        add(s1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            j1.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TeacherAttendanceDetail().setVisible(true);
    }
}

