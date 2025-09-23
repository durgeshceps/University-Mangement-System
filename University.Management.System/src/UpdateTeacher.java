package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateTeacher extends JFrame implements ActionListener {

    JTextField tfId, tfName, tfEmail, tfPhone, tfSubject, tfDepartment;
    JButton searchBtn, updateBtn;
    Connection conn;

    UpdateTeacher() {
        super("Update Teacher Details");
        setSize(600, 400);
        setLocation(400, 200);
        setLayout(new GridLayout(8, 2, 10, 10));

        // Labels
        add(new JLabel("Teacher ID:"));
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

        add(new JLabel("Subject:"));
        tfSubject = new JTextField();
        add(tfSubject);

        add(new JLabel("Department:"));
        tfDepartment = new JTextField();
        add(tfDepartment);

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
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM teachers WHERE id=?");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    tfName.setText(rs.getString("name"));
                    tfEmail.setText(rs.getString("email"));
                    tfPhone.setText(rs.getString("phone"));
                    tfSubject.setText(rs.getString("subject"));
                    tfDepartment.setText(rs.getString("department"));
                } else {
                    JOptionPane.showMessageDialog(this, "Teacher not found!");
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
                String subject = tfSubject.getText();
                String department = tfDepartment.getText();

                PreparedStatement ps = conn.prepareStatement(
                        "UPDATE teachers SET name=?, email=?, phone=?, subject=?, department=? WHERE id=?"
                );
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, phone);
                ps.setString(4, subject);
                ps.setString(5, department);
                ps.setInt(6, id);

                int updated = ps.executeUpdate();
                if (updated > 0) {
                    JOptionPane.showMessageDialog(this, "Teacher updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e);
            }
        }
    }

    public static void main(String[] args) {
        new UpdateTeacher();
    }
}
