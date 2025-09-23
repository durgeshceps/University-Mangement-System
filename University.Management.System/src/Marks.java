//import university.management.system.conn;
//
//import javax.swing.*;
//import java.awt.*;
//import java.sql.ResultSet;
//
//JTextArea t1;
//  JPanel p1;
//
//Marks() {}
//Marks(String str){
//    setSize(500,600);
//    setLayout(new BorderLayout());
//    p1 = new JPanel();
//    t1 = new JTextArea(50,15);
//    JScrollPane jsp = new JScrollPane(t1);
//    t1.setFont(new Font("Senserif",Font.ITALIC,18));
//
//    add(p1,"North");
//
//    add(jsp,"Center");
//
//    setLocation(450,200);
//    marks(str);
//}
//
//
//
//public class mark(String s ) {
//    try
//
//    {
//
//        conn c = new conn();
//
//        t1.setText("\tResult of Examination\n\nSubject\n");
//
//        ResultSet rs1 = c.s.executeQuery(("Select * from subject where rollno=" + s));
//
//        if (rs1.next()) {
//            t1.append("\n\t" + rs1.getString("Subject1"));
//            t1.append("\n\t" + rs1.getString("Subject2"));
//            t1.append("\n\t" + rs1.getString("Subject3"));
//            t1.append("\n\t" + rs1.getString("Subject4"));
//            t1.append("\n\t" + rs1.getString("Subject5"));
//            t1.append("\n_______________________________________");
//            t1.append("\n");
//        }
//
//        ResultSet rs2 = c.s.executeQuery(("Select * from subject where rollno=" + s));
//
//
//        if (rs2.next()) {
//            t1.append("\nMarks\n\n\t" + rs2.getString("Marks1"));
//            t1.append("\n\t" + rs2.getString("Marks2"));
//            t1.append("\n\t" + rs2.getString("Marks3"));
//            t1.append("\n\t" + rs2.getString("Marks4"));
//            t1.append("\n\t" + rs2.getString("Marks5"));
//
//            int marks1 = Integer.parseInt(rs2.getString("marks1"));
//            int marks2 = Integer.parseInt(rs2.getString("marks2"));
//            int marks3 = Integer.parseInt(rs2.getString("marks3"));
//            int marks4 = Integer.parseInt(rs2.getString("marks4"));
//            int marks5 = Integer.parseInt(rs2.getString("marks5"));
//
//            int total = marks1+marks2+marks3+marks4+marks5;
//
//            t1.append("\nTotal:  ");
//            t1.append(total+"/500");
//
//            t1.append("\n_______________________________________");
//            t1.append("\n");
//        }
//
//
//    }catch(Exception e){
//        e.printStackTrace();
//
//
//    }
//}
//public static void main(String[] args){
//    new Marks().setVisible(true);}
//}
//
//

package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Marks extends JFrame {

    JTextArea t1;
    JPanel p1;

    // Default constructor
    Marks() {}

    // Constructor with roll number
    Marks(String str) {
        setSize(500, 600);
        setLayout(new BorderLayout());

        p1 = new JPanel();
        t1 = new JTextArea(50, 15);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("SansSerif", Font.ITALIC, 18));

        add(p1, "North");
        add(jsp, "Center");

        setLocation(450, 200);

        // Call marks method
        marks(str);
    }

    // Method to fetch marks
    public void marks(String s) {
        try {
            conn c = new conn();

            t1.setText("\tResult of Examination\n\nSubject\n");

            // ✅ First query: get subjects
            ResultSet rs1 = c.s.executeQuery("Select * from subject where rollno='" + s + "'");
            if (rs1.next()) {
                t1.append("\n\t" + rs1.getString("Subject1"));
                t1.append("\n\t" + rs1.getString("Subject2"));
                t1.append("\n\t" + rs1.getString("Subject3"));
                t1.append("\n\t" + rs1.getString("Subject4"));
                t1.append("\n\t" + rs1.getString("Subject5"));
                t1.append("\n_______________________________________");
                t1.append("\n");
            }

            // ✅ Second query: get marks
            ResultSet rs2 = c.s.executeQuery("Select * from subject where rollno='" + s + "'");
            if (rs2.next()) {
                t1.append("\nMarks\n\n\t" + rs2.getString("Marks1"));
                t1.append("\n\t" + rs2.getString("Marks2"));
                t1.append("\n\t" + rs2.getString("Marks3"));
                t1.append("\n\t" + rs2.getString("Marks4"));
                t1.append("\n\t" + rs2.getString("Marks5"));

                int marks1 = Integer.parseInt(rs2.getString("Marks1"));
                int marks2 = Integer.parseInt(rs2.getString("Marks2"));
                int marks3 = Integer.parseInt(rs2.getString("Marks3"));
                int marks4 = Integer.parseInt(rs2.getString("Marks4"));
                int marks5 = Integer.parseInt(rs2.getString("Marks5"));

                int total = marks1 + marks2 + marks3 + marks4 + marks5;

                t1.append("\n\nTotal: " + total + "/500");
                t1.append("\n_______________________________________");
                t1.append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        new Marks("101").setVisible(true); // ✅ pass rollno like "101"
    }
}
