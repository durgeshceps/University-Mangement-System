

package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        super("University Management System");

        setSize(1920, 1030);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("icons/slide1.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);

        JMenuBar mb = new JMenuBar();

        // Master Menu
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);

        m1.setFont(new Font("monospaced", Font.BOLD, 16));
        m1.setBackground(Color.WHITE);

        m2.setFont(new Font("monospaced", Font.BOLD, 16));
        m2.setBackground(Color.WHITE);

        m1.addActionListener(this);
        m2.addActionListener(this);

        // User Menu
        JMenu user = new JMenu("Details");
        JMenuItem v1 = new JMenuItem("Student Details");
        JMenuItem v2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.RED);

        v1.setFont(new Font("monospaced", Font.BOLD, 16));
        v2.setFont(new Font("monospaced", Font.BOLD, 16));

        v1.addActionListener(this);
        v2.addActionListener(this);

        // Attendance
        JMenu attendance = new JMenu("Attendance");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.RED);

        a1.addActionListener(this);
        a2.addActionListener(this);

        // Attendance Details
        JMenu attendanceDetails = new JMenu("Attendance Details");
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendanceDetails.setForeground(Color.RED);

        b1.addActionListener(this);
        b2.addActionListener(this);

        // Examination
        JMenu exam = new JMenu("Examination");
        JMenuItem c1 = new JMenuItem("Examination Details");
        JMenuItem c2 = new JMenuItem("Enter Marks");
        exam.setForeground(Color.BLUE);

        c1.addActionListener(this);
        c2.addActionListener(this);

        // Update
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Student");
        JMenuItem r2 = new JMenuItem("Update Teacher");
        report.setForeground(Color.BLUE);

        r1.addActionListener(this);
        r2.addActionListener(this);

        // Fee
        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLUE);

        s1.addActionListener(this);
        s2.addActionListener(this);

        // Utility
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);

        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);

        // About
        JMenu about = new JMenu("About");
        JMenuItem aboutus = new JMenuItem("About Us");
        about.setForeground(Color.RED);

        aboutus.addActionListener(this);

        // Exit
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);

        ex.addActionListener(this);

        // Add menus
        master.add(m1);
        master.add(m2);

        user.add(v1);
        user.add(v2);

        attendance.add(a1);
        attendance.add(a2);

        attendanceDetails.add(b1);
        attendanceDetails.add(b2);

        exam.add(c1);
        exam.add(c2);

        report.add(r1);
        report.add(r2);

        fee.add(s1);
        fee.add(s2);

        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);

        exit.add(ex);

        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendanceDetails);
        mb.add(exam);
        mb.add(report);
        mb.add(fee);
        mb.add(utility);
        mb.add(about);
        mb.add(exit);

        setJMenuBar(mb);

        setFont(new Font("Senserif", Font.BOLD, 16));
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        try {
            if (msg.equals("New Student Admission")) {
                new AddStudent().setVisible(true);
            } else if (msg.equals("New Faculty")) {
                new AddTeacher().setVisible(true);
            } else if (msg.equals("Student Details")) {
                new StudentDetails().setVisible(true);
            } else if (msg.equals("Teacher Details")) {
                new TeacherDetails().setVisible(true);
            } else if (msg.equals("Update Student")) {
                new UpdateStudent().setVisible(true);
            } else if (msg.equals("Update Teacher")) {
                new UpdateTeacher().setVisible(true);
            } else if (msg.equals("Fee Structure")) {
                new FeeStructure().setVisible(true);
            } else if (msg.equals("Student Fee Form")) {
                new StudentFeeForm().setVisible(true);
            } else if (msg.equals("Notepad")) {
                Runtime.getRuntime().exec("notepad.exe");
            } else if (msg.equals("Calculator")) {
                Runtime.getRuntime().exec("calc.exe");
            } else if (msg.equals("Web Browser")) {
                Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            } else if (msg.equals("Exit")) {
                System.exit(0);
            } else if (msg.equals("Student Attendance")) {
                new StudentAttendance().setVisible(true);
            } else if (msg.equals("Teacher Attendance")) {
                new TeacherAttendance().setVisible(true);
            } else if (msg.equals("Student Attendance Detail")) {
                new StudentAttendanceDetail().setVisible(true);
            } else if (msg.equals("Examination Details")) {
                new ExaminationDetails().setVisible(true);
            } else if (msg.equals("Enter Marks")) {
                new EnterMarks().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Project().setVisible(true);
    }
}


