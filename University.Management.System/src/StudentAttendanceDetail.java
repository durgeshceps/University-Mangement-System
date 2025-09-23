//package university.management.system;
//
//
//
//import javax.swing.*;
//import java.sql.ResultSet;
//import java.sql.*;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class StudentAttendanceDetail extends JFrame implements  {
//
//    JTable j1;
//    JButton b1;
//    String h[]={"Roll Number","Date Time","First Half","Second Half"};
//    String d[][]=new String[15][4];
//    int i=0,j=0;
//
//    StudentAttendanceDetail(){
//        super ("View Student Attendance");
//        setSize(800,300);
//        setLocation(450,150);
//
//        try{
//            String q="select * from attendance_student";
//            conn d1=new conn();
//            ResultSet rs=c1.s.execteQuery(q);
//            while(rs.next()){
//                d[i][j++]=rs.getString("rollno");
//                d[i][j++]=rs.getString("Date");
//                d[i][j++]=rs.getString("first");
//                d[i][j++]=rs.getString("second");
//                i++;
//                j=0;
//
//            }
//            j1=new JTable(d,h);
//
//        }catch (Exception e){}
//
//        b1=new JButton("Print");
//        add(b1,"South");
//        JScrollPane s1=new JScrollPane(j1);
//        add(s1);
//
//        b1.addActionListener(this);
//    }
//
//    public void actionPerformed(ActionEvent ae){
//        try{
//            j1.print();
//
//        }catch (Exception e){}
//    }
//    public static void main(String[] args){new StudentAttendanceDetail().setVisible();}
//}

package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentAttendanceDetail extends JFrame implements ActionListener {

    JTable j1;
    JButton b1;
    String h[] = {"Roll Number", "Date Time", "First Half", "Second Half"};
    String d[][] = new String[50][4];   // increased rows for safety
    int i = 0, j = 0;

    StudentAttendanceDetail() {
        super("View Student Attendance");
        setSize(800, 300);
        setLocation(450, 150);

        try {
            String q = "select * from attendance_student";
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery(q);

            while (rs.next()) {
                d[i][j++] = rs.getString("rollno");
                d[i][j++] = rs.getString("date");     // check column name in DB
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
        add(s1, BorderLayout.CENTER);

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
        new StudentAttendanceDetail().setVisible(true);
    }
}
