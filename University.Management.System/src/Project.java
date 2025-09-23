////part3
//package university.management.system;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//
//
//public class Project extends JFrame implements ActionListener {
//
//    Project(){
//        super("University Management System");
//
//        setSize(1920, 1030);
//
//        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("src/icone/slide1.jpg"));
//        Image i3 = ic.getImage().getScaledInstance(1900,950, Image.SCALE_DEFAULT);
//        ImageIcon icc3 = new ImageIcon(i3);
//        JLabel l1 = new JLabel(icc3);
//
//        add(l1);
//
//        JMenuBar mb = new JMenuBar();
//        JMenu master = new JMenu("Master");
//        JMenuItem m1 = new JMenuItem("new Faculty");
//        JMenuItem m2 = new JMenuItem("new Student Admission");
//        master.setForeground(Color.BLUE);
//
//
//        m1.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image1 = icon1.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
//        m1.setIcon(new ImageIcon(image1));
//        m1.setMnemonic('A');
//        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        m1.setBackground(Color.WHITE);
//
//        m2.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image2 = icon2.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        m2.setIcon(new ImageIcon(image2));
//        m2.setMnemonic('B');
//        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        m2.setBackground(Color.WHITE);
//
//
//        m1.addActionListener(this);
//        m2.addActionListener(this);
//
//
//        JMenu user = new JMenu("Detials");
//        JMenuItem v1 = new JMenuItem("Student Details");
//        JMenuItem v2 = new JMenuItem("Teacher Details");
//        user.setForeground(Color.RED);
//
//        v1.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image4 = icon4.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
//        v1.setIcon(new ImageIcon(image4));
//        v1.setMnemonic('C');
//        v1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        v1.setBackground(Color.WHITE);
//
//
//        v2.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image5 = icon5.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        v2.setIcon(new ImageIcon(image5));
//        v2.setMnemonic('D');
//        v2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        v2.setBackground(Color.WHITE);
//
//
//        v1.addActionListener(this);
//        v2.addActionListener(this);
//
//
//
//        JMenu attendance = new JMenu("Attendance");
//        JMenuItem a1 = new JMenuItem("Student Details");
//        JMenuItem a2 = new JMenuItem("Teacher Details");
//        attendance.setForeground(Color.RED);
//
//        a1.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image24 = icon23.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
//        a1.setIcon(new ImageIcon(image24));
//        a1.setMnemonic('M');
//        a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        a1.setBackground(Color.WHITE);
//
//
//        a2.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image25 = icon25.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        a2.setIcon(new ImageIcon(image25));
//        a2.setMnemonic('N');
//        a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        a2.setBackground(Color.WHITE);
//
//
//        a1.addActionListener(this);
//        a2.addActionListener(this);
//
//
//
//
//        JMenu attendance_detials = new JMenu("Attendance Detials");
//        JMenuItem b1 = new JMenuItem("Student Attendance Details");
//        JMenuItem b2 = new JMenuItem("Teacher Attendance  Details");
//        attendance_detials.setForeground(Color.RED);
//
//        b1.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon26 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image28 = icon26.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
//        b1.setIcon(new ImageIcon(image28));
//        b1.setMnemonic('G');
//        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        b1.setBackground(Color.WHITE);
//
//
//        b2.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon28 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image29 = icon28.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        b2.setIcon(new ImageIcon(image29));
//        b2.setMnemonic('F');
//        b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        b2.setBackground(Color.WHITE);
//
//
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//
//
//
//        JMenu exam = new JMenu("Attendance Detials");
//        JMenuItem c1 = new JMenuItem("Student Attendance Details");
//        JMenuItem c2 = new JMenuItem("Teacher Attendance  Details");
//        exam.setForeground(Color.BLUE);
//
//        c1.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image31 = icon30.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
//        c1.setIcon(new ImageIcon(image31));
//        c1.setMnemonic('Q');
//        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        c1.setBackground(Color.WHITE);
//
//
//        c2.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image33 = icon32.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        c2.setIcon(new ImageIcon(image33));
//        c2.setMnemonic('R');
//        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        c2.setBackground(Color.WHITE);
//
//
//        c1.addActionListener(this);
//        c2.addActionListener(this);
//
//
//
//        JMenu report = new JMenu("Update Detials");
//        JMenuItem r1 = new JMenuItem("Update Student ");
//        JMenuItem r2 = new JMenuItem("Update Teacher ");
//        report.setForeground(Color.BLUE);
//
//        r1.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image7 = icon7.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
//        r1.setIcon(new ImageIcon(image7));
//        r1.setMnemonic('H');
//        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        r1.setBackground(Color.WHITE);
//
//
//        r2.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image imagee = iconn.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        r2.setIcon(new ImageIcon(imagee));
//        r2.setMnemonic('E');
//        r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        r2.setBackground(Color.WHITE);
//
//
//
//        JMenu fee = new JMenu("Fee Detials");
//        JMenuItem s1 = new JMenuItem("Fee Structure ");
//        JMenuItem s2 = new JMenuItem(" Student Fee Form ");
//        fee.setForeground(Color.BLUE);
//
//        s1.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image15 = icon14.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
//        s1.setIcon(new ImageIcon(image15));
//        s1.setMnemonic('H');
//        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        s1.setBackground(Color.WHITE);
//
//
//        s2.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image17 = icon16.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        s2.setIcon(new ImageIcon(image17));
//        s2.setMnemonic('E');
//        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        s2.setBackground(Color.WHITE);
//
//
//        s1.addActionListener(this);
//        s2.addActionListener(this);
//
//
//
//
//        JMenu utility = new JMenu("Utility");
//        JMenuItem ut1 = new JMenuItem("Notepad ");
//        JMenuItem ut2 = new JMenuItem(" Caclulator ");
//        JMenuItem ut3 = new JMenuItem(" Web Browser ");
//        utility.setForeground(Color.RED);
//
//        ut1.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image19 = icon18.getImage().getScaledInstance(25, 25 , Image.SCALE_DEFAULT);
//        ut1.setIcon(new ImageIcon(image19));
//        ut1.setMnemonic('I');
//        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        ut1.setBackground(Color.WHITE);
//
//
//        ut2.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon20 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image21 = icon20.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        ut2.setIcon(new ImageIcon(image21));
//        ut2.setMnemonic('J');
//        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        ut2.setBackground(Color.WHITE);
//
//
//        ut3.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image10 = icon10.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        ut3.setIcon(new ImageIcon(image10));
//        ut3.setMnemonic('K');
//        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        ut3.setBackground(Color.WHITE);
//
//
//        ut1.addActionListener(this);
//        ut2.addActionListener(this);
//        ut3.addActionListener(this);
//
//
//
//
//
//        JMenu about = new JMenu("About");
//        JMenuItem aboutus = new JMenuItem("About us ");
//        about.setForeground(Color.RED);
//
//        aboutus.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image22 = icon21.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        aboutus.setIcon(new ImageIcon(image22));
//        aboutus.setMnemonic('L');
//        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        aboutus.setBackground(Color.WHITE);
//
//
//        aboutus.addActionListener(this);
//
//
//
//        JMenu exit = new JMenu("Exit");
//        JMenuItem ex = new JMenuItem("Exit ");
//        exit.setForeground(Color.RED);
//
//        ex.setFont(new Font ("monospaced", Font.BOLD,16));
//        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image image11 = icon11.getImage().getScaledInstance(20, 20 , Image.SCALE_DEFAULT);
//        ex.setIcon(new ImageIcon(image11));
//        ex.setMnemonic('Z');
//        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        ex.setBackground(Color.WHITE);
//
//
//        ex.addActionListener(this);
//
//
//
//
//       master.add(m1);
//       master.add(m2);
//
//       user.add(v1);
//       user.add(v2);
//
//       report.add(r1);
//       report.add(r2);
//
//       fee.add(s1);
//       fee.add(s2);
//
//
//       utility.add(ut1);
//       utility.add(ut2);
//       utility.add(ut3);
//
//       exit.add(ex);
//
//       mb.add(master);
//       mb.add(user);
//       mb.add(attendance);
//       mb.add(attendance_detials);
//       mb.add(exam);
//       mb.add(report);
//       mb.add(fee);
//       mb.add(utility);
//       mb.add(about);
//       mb.add(exit);
//
//       setJMenuBar(mb);
//
//       setFont(new Font("Senserif", Font.BOLD,16));
//       setLayout(new FlowLayout());
//       setVisible(false);
//
//    }
//
//       public void actionPerformed(ActionEvent ae) {
//           String msg = ae.getActionCommand();
//           if (msg.equals("New Student Admission")) {
//               new AddStudent().f.setVisible(true);
//
//           } else if (msg.equals("new Faculty")){
//        new AddTeacher().f.setVisible(true);
//
//             } else if (msg.equals("Student Details")) {
//               new StudentDetails().setVisible(true);
//
//           } else if (msg.equals("Teacher Details")) {
//               new TeacherDetails().setVisible(true);
//
//           } else if (msg.equals("Update Student")) {
//               new UpdateStudent().setVisible(true);
//           }
//           else if (msg.equals("Update Teachers")){
//               new UpdateTeacher().setVisible(true);
//           }
//           else if (msg.equals("Fee Structure")) {
//               new FeeStructure().setVisible(true);
//           }
//           else if (msg.equals(" Student Fee Form")) {
//               new StudentFeeForm().setVisible(true);
//           } else if (msg.equals("Notepad")){
//               try{
//                   Runtime.getRuntime().exec("notepad.exe");
//
//               } catch (Exception e){}
//           } else if (msg.equals("Calculator")){
//               try{
//                   Runtime.getRuntime().exec("calc.exe");
//
//               } catch (Exception e){}
//           } else if (msg.equals("Web Browser")) {
//               try{
//                   Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application");
//               }catch (Exception e) {}
//           } else if (msg.equals("Exit ")) {
//               System.exit(0);
//
//           } else if (msg.equals("Exit")) {
//               System.exit(0);
//           } else if ((msg.equals("About Us"))) {
//               new AboutUs().f.setVisible(true);
//           } else if ((msg.equals("Student Attendance"))) {
//               new StudentAttendance().f.setVisible(true);
//           } else if ((msg.equals("Teacher Attendance"))) {
//               new TeacherAttendance().f.setVisible(true);
//           } else if ((msg.equals("Student Attendance Detail"))) {
//               new StudentAttendaceDetail().f.setVisible(true);
//           } else if ((msg.equals("Examination Details"))) {
//               new ExaminationDetails().f.setVisible(true);
//           } else if ((msg.equals("Enter Marks"))) {
//               EnterMarks().setVisible(true);
//           }
//
//
//       }
//
//            public static void main(String[] args){
//        new Project().setVisible(true);
//    }
//
//
//       }
//

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

