

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

