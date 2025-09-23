//package university.management.system;
//
//import java.awt.*;
//import java.awt.event.*;
//import java.util.*;
//import javax.lang.model.element.NestingKind;
//import javax.swing.*;
//
//
//class AddTeacher implements ActionListener {
//
//    JFrame f;
//    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
//    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
//    JButton b,b1,b2,b3;
//    JComboBox c1,c2;
//
//    Random ran = new Random();
//    long first4 = (ran.nextLong() % 9000L) + 1000L;
//    long first  = Math.abs(first4);
//
//
//
//    public AddTeacher(){
//
//        f = new JFrame("Add Teacher");
//        f.setBackground(Color.WHITE);
//        f.setLayout(null);
//
//
//        id15= new JLabel();
//        id15.setBounds(0,0,2848,1152);
//        id15.setLayout(null);
//        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("src/icone/profile-icon.jpg"));
//        Image i3 = img.getImage().getScaledInstance(2048,1152,Image.SCALE_DEFAULT);
//        ImageIcon icc3 = new ImageIcon(i3);
//        id15.setIcon(icc3);
//
//        id8 = new JLabel("New Teacher Details");
//        id8.setBounds(320,30,500,50);
//        id8.setFont(new Font("serif", Font.ITALIC,25));
//        id8.setForeground(Color.black);
//        id15.add(id8);
//        f.add(id15);
//
//
//        id1 = new JLabel("Name");
//        id1.setBounds(50,150,100,30);
//        id1.setFont(new Font("serif",Font.BOLD,20));
//        id1.setForeground(Color.BLACK);
//        id15.add(id1);
//
//        t1=new JTextField();
//        t1.setBounds(200,150,150,30);
//        id15.add(t1);
//
//        id2 = new JLabel("Father's Name");
//        id2.setBounds(400,150,200,30);
//        id2.setFont(new Font("serif", Font.BOLD,20));
//        id15.add(id2);
//
//        t2=new JTextField();
//        t2.setBounds(200,150,150,30);
//        id15.add(t2);
//
//        id3= new JLabel("Age");
//        id3.setBounds(50,200,100,30);
//        id3.setFont(new  Font("serif",Font.BOLD,20));
//        id15.add(id3);
//
//        t3=new JTextField();
//        t3.setBounds(50,200,150,30);
//        id15.add(t3);
//
//        id4= new JLabel("DOB (dd/mm/yyyy)");
//        id4.setBounds(50,200,100,30);
//        id4.setFont(new Font ("serif",Font.BOLD,20));
//        id15.add(id4);
//
//        t4=new JTextField();
//        t4.setBounds(50,200,150,30);
//        id15.add(t4);
//
//
//        id5= new JLabel("Address");
//        id5.setBounds(50,200,100,30);
//        id5.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id5);
//
//        t5=new JTextField();
//        t5.setBounds(50,200,150,30);
//        id15.add(t5);
//
//
//        id6= new JLabel("Phone");
//        id6.setBounds(50,200,100,30);
//        id6.setFont(new Font ("serif",Font.BOLD,20));
//        id15.add(id6);
//
//        t6=new JTextField();
//        t6.setBounds(50,200,150,30);
//        id15.add(t6);
//
//        id7= new JLabel("Email Id");
//        id7.setBounds(50,200,100,30);
//        id7.setFont(new  Font("serif",Font.BOLD,20));
//        id15.add(id7);
//
//        t7=new JTextField();
//        t7.setBounds(50,200,150,30);
//        id15.add(t7);
//
//
//        id8= new JLabel("Class X(%)");
//        id8.setBounds(50,200,100,30);
//        id8.setFont(new Font ("serif",Font.BOLD,20));
//        id15.add(id8);
//
//        t8=new JTextField();
//        t8.setBounds(50,200,150,30);
//        id15.add(t8);
//
//
//        id9= new JLabel("Class XII(%)");
//        id9.setBounds(50,200,100,30);
//        id9.setFont(new Font ("serif",Font.BOLD,20));
//        id15.add(id9);
//
//        t9=new JTextField();
//        t9.setBounds(50,200,150,30);
//        id15.add(t9);
//
//
//        id12= new JLabel("Roll NO");
//        id12.setBounds(50,400,150,30);
//        id12.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(id12);
//
//        t11=new JTextField();
//        t11.setBounds(200,400,150,30);
//        id11.setText("1533"+first);
//        id15.add(t11);
//
//        lab=new JLabel("Course");
//        lab.setBounds(400,400,150,30);
//        lab.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(lab);
//
//        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
//        c1 = new JComboBox(course);
//        c1.setBackground(Color.WHITE);
//        c1.setBounds(600,400,150,30);
//        id15.add(c2);
//
//        lab=new JLabel("Branch");
//        lab.setBounds(400,400,150,30);
//        lab.setFont(new Font("serif",Font.BOLD,20));
//        id15.add(lab);
//
//        String branch[] = {"Computer Scince","Electrons","Electrical","Mechanical","Civil"};
//        c1 = new JComboBox(branch);
//        c1.setBackground(Color.WHITE);
//        c1.setBounds(600,400,150,30);
//        id15.add(c2);
//
//        b = new JButton("Submit");
//        b.setBackground(Color.BLACK);
//        b.setForeground(Color.WHITE);
//        b.setBounds(250,550,150,40);
//        id15.add(b);
//
//        b1=new JButton("Cancel");
//        b1.setBackground(Color.BLACK);
//        b1.setForeground(Color.WHITE);
//        b1.setBounds(450,550,150,40);
//        id15.add(b1);
//
//        b.addActionListener(this);
//        b1.addActionListener(this);
//
//        f.setVisible(true);
//        f.setSize(900,700);
//        f.setLocation(400,150);
//
//    }
//
//    public void actionPerformed(ActionEvent ae){
//
//        String a = t1.getText();
//        String bb = t2.getText();
//        String c = t3.getText();
//        String d = t4.getText();
//        String e = t5.getText();
//        String ff = t6.getText();
//        String g = t7.getText();
//        String h = t8.getText();
//        String i = t9.getText();
//        String j = t10.getText();
//        String k = t11.getText();
//        String l = (String)c1.getSelectedItem();
//        String m = (String) c2.getSelectedItem();
//
//        if(ae.getSource() == b){
//            try{
//                conn cc = new conn();
//                String q = "insert into teacher values ('"+a+"','"+bb+"','"+c+"' ,'"+d+"', '"+e+"', '"+ff+"', '"+g+"' ,'"+h+"' ,'"+i+"' ,'"+j+"' ,'"+k+"' ,'"+l+"' ,'"+m+"' " ;
//                cc.s.executeUpdate(q);
//                JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
//                f.setVisible(false);
//
//            } catch(Exception ee){
//                System.out.println("The error is:"+ee);
//
//            }
//
//        }else if(ae.getSource() == b1){
//            f.setVisible(false);
//            new Project().setVisible(true);
//        }
//    }
//
//    public static void main(String [] arg) {
//        new AddTeacher().f.setVisible(true);
//    }
//}
//
//
//

package university.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class AddTeacher extends JFrame implements ActionListener {

    JLabel idLabel, nameLabel, fatherLabel, ageLabel, dobLabel, addressLabel, phoneLabel, emailLabel, xLabel, xiiLabel, empIdLabel, courseLabel, branchLabel;
    JTextField nameField, fatherField, ageField, dobField, addressField, phoneField, emailField, xField, xiiField, empIdField;
    JButton submitBtn, cancelBtn;
    JComboBox<String> courseBox, branchBox;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first  = Math.abs(first4);

    public AddTeacher() {
        setTitle("Add Teacher");
        setSize(900, 700);
        setLocation(400, 150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Labels + Fields
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 100, 150, 30);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(200, 100, 150, 30);
        add(nameField);

        fatherLabel = new JLabel("Father's Name");
        fatherLabel.setBounds(400, 100, 150, 30);
        add(fatherLabel);
        fatherField = new JTextField();
        fatherField.setBounds(600, 100, 150, 30);
        add(fatherField);

        ageLabel = new JLabel("Age");
        ageLabel.setBounds(50, 150, 150, 30);
        add(ageLabel);
        ageField = new JTextField();
        ageField.setBounds(200, 150, 150, 30);
        add(ageField);

        dobLabel = new JLabel("DOB (dd/mm/yyyy)");
        dobLabel.setBounds(400, 150, 200, 30);
        add(dobLabel);
        dobField = new JTextField();
        dobField.setBounds(600, 150, 150, 30);
        add(dobField);

        addressLabel = new JLabel("Address");
        addressLabel.setBounds(50, 200, 150, 30);
        add(addressLabel);
        addressField = new JTextField();
        addressField.setBounds(200, 200, 150, 30);
        add(addressField);

        phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(400, 200, 150, 30);
        add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(600, 200, 150, 30);
        add(phoneField);

        emailLabel = new JLabel("Email Id");
        emailLabel.setBounds(50, 250, 150, 30);
        add(emailLabel);
        emailField = new JTextField();
        emailField.setBounds(200, 250, 150, 30);
        add(emailField);

        xLabel = new JLabel("Class X (%)");
        xLabel.setBounds(400, 250, 150, 30);
        add(xLabel);
        xField = new JTextField();
        xField.setBounds(600, 250, 150, 30);
        add(xField);

        xiiLabel = new JLabel("Class XII (%)");
        xiiLabel.setBounds(50, 300, 150, 30);
        add(xiiLabel);
        xiiField = new JTextField();
        xiiField.setBounds(200, 300, 150, 30);
        add(xiiField);

        empIdLabel = new JLabel("Employee ID");
        empIdLabel.setBounds(400, 300, 150, 30);
        add(empIdLabel);
        empIdField = new JTextField("1533" + first);
        empIdField.setBounds(600, 300, 150, 30);
        empIdField.setEditable(false);
        add(empIdField);

        courseLabel = new JLabel("Course");
        courseLabel.setBounds(50, 350, 150, 30);
        add(courseLabel);
        String[] courses = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(200, 350, 150, 30);
        add(courseBox);

        branchLabel = new JLabel("Branch");
        branchLabel.setBounds(400, 350, 150, 30);
        add(branchLabel);
        String[] branches = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        branchBox = new JComboBox<>(branches);
        branchBox.setBounds(600, 350, 150, 30);
        add(branchBox);

        // Buttons
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(250, 500, 150, 40);
        submitBtn.addActionListener(this);
        add(submitBtn);

        cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(450, 500, 150, 40);
        cancelBtn.addActionListener(this);
        add(cancelBtn);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submitBtn){
            try {
                String a = nameField.getText();
                String bb = fatherField.getText();
                String c = ageField.getText();
                String d = dobField.getText();
                String e = addressField.getText();
                String ff = phoneField.getText();
                String g = emailField.getText();
                String h = xField.getText();
                String i = xiiField.getText();
                String k = empIdField.getText();
                String l = (String)courseBox.getSelectedItem();
                String m = (String)branchBox.getSelectedItem();

                conn cc = new conn();
                String q = "insert into teacher(name,father,age,dob,address,phone,email,classX,classXII,emp_id,course,branch) " +
                        "values ('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+k+"','"+l+"','"+m+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Teacher Details Inserted Successfully");
                this.setVisible(false);

            } catch(Exception ee) {
                System.out.println("The error is: "+ee);
            }
        } else if(ae.getSource() == cancelBtn) {
            this.setVisible(false);
            new Project().setVisible(true);
        }
    }

    public static void main(String [] arg) {
        new AddTeacher();
    }
}
