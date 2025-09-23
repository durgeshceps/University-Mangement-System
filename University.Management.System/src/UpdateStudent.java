package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener {

    JTextField tfId, tfName, tfEmail, tfPhone, tfCourse, tfBranch;
    JButton searchBtn, updateBtn;
    Connection conn;

    UpdateStudent() {
        super("Update Student Details");
        setSize(600, 400);
        setLocation(400, 200);
        setLayout(new GridLayout(8, 2, 10, 10));

        // Labels and TextFields
        add(new JLabel("Student ID:"));
        tfId = new JTextField();
        add(tfId);

        add(new JLabel("Name:"));
        tfName = new JTextField();
        add(tfName);

        add(new JLabel("Email:"));
        tfEmail = new JTextField();
        add(tfEmail);

        add(new JLabel("Phone:"));
        tfPhone = new JTextField();
        add(tfPhone);

        add(new JLabel("Course:"));
        tfCourse = new JTextField();
        add(tfCourse);

        add(new JLabel("Branch:"));
        tfBranch = new JTextField();
        add(tfBranch);

        searchBtn = new JButton("Search");
        updateBtn = new JButton("Update");

        add(searchBtn);
        add(updateBtn);

        searchBtn.addActionListener(this);
        updateBtn.addActionListener(this);

        connectDB();

        setVisible(true);
    }

    void connectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:university.db");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Connection Failed: " + e);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == searchBtn) {
            try {
                int id = Integer.parseInt(tfId.getText());
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id=?");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    tfName.setText(rs.getString("name"));
                    tfEmail.setText(rs.getString("email"));
                    tfPhone.setText(rs.getString("phone"));
                    tfCourse.setText(rs.getString("course"));
                    tfBranch.setText(rs.getString("branch"));
                } else {
                    JOptionPane.showMessageDialog(this, "Student not found!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e);
            }
        }

        if (ae.getSource() == updateBtn) {
            try {
                int id = Integer.parseInt(tfId.getText());
                String name = tfName.getText();
                String email = tfEmail.getText();
                String phone = tfPhone.getText();
                String course = tfCourse.getText();
                String branch = tfBranch.getText();

                PreparedStatement ps = conn.prepareStatement(
                        "UPDATE students SET name=?, email=?, phone=?, course=?, branch=? WHERE id=?"
                );
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, phone);
                ps.setString(4, course);
                ps.setString(5, branch);
                ps.setInt(6, id);

                int updated = ps.executeUpdate();
                if (updated > 0) {
                    JOptionPane.showMessageDialog(this, "Student updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e);
            }
        }
    }

    public static void main(String[] args) {
        new UpdateStudent();
    }
}
