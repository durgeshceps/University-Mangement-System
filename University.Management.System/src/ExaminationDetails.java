//
//import net.proteanit.sql.DbUtils;
//import university.management.system.conn;
//
//import javax.swing.*;
//import javax.swing.border.LineBorder;
//import javax.swing.border.TitledBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseListener;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class ExaminationDetails extends JFrame implements ActionListener {
//
//    private JPanel contentPane;
//    private JTable table;
//    private JTextField search;
//    private JButton b1,b2,b3;
//
//    public void Book() {
//        try{
//            conn con = new conn();
//            String sql = "Select * from Student";
//            PreparedStatement st = con.c.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//            rs.close();
//            st.close();
//            con.c.close();
//        } catch (Exception e ) {}
//
//    }
//
//    public ExaminationDetails() {
//
//        setBounds(350,200,930,475);
//        contentPane = new JPanel();
//        contentPane.setBackground(Color.WHITE);
//        setContentPane(contentPane);
//        contentPane.setLayout(null);
//
//        JScrollPane scrollPane = new JScrollPane();
//        scrollPane.setBounds(79,133,1080,282);
//        contentPane.add(scrollPane);
//
//        table = new JTable();
//        table.addMouseListener((MouseAdapter)   {
//            int row = table.getSelectedRow();
//            {
//                search.setText(table.getModel().getValueAt(row, 9).toString());
//            });
//
//
//          table.setBackground(new Color(240,248,255));
//          table.setForeground(Color.DARK_GRAY);
//          table.setFont(new Font("Trebuchet MS ", Font.BOLD,16));
//          scrollPane.setViewport(table);
//
//
//          b1 = new JButton("Result");
//          b1.addActionListener(this);
//          b1.setBorder(new LineBorder(new Color(255,20,147),2,true));
//          b1.setForeground(new Color(199,21,133));
//          b1.setFont(new Font("Trebuchet MS", Font.BOLD,18));
//          b1.setBounds(564,89,138,33);
//          contentPane.add(b1);
//
//
//          JLabel l1 = new JLabel("Check Result");
//          l1.setForeground(new Color(107,142,35));
//          l1.setFont((new Font("Trebuchet MS", Font.BOLD | Font.ITALIC,30)));
//          l1.setBounds(300,15,400,47);
//          contentPane.add(l1);
//
//          search = new JTextField();
//          search.setBackground(new Color(255,240,245));
//          search.setBorder(new LineBorder(new Color(255,105,180),2,true));
//          search.setForeground(new Color(47,79,79));
//          search.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,17));
//          search.setBounds(189,89,357,33);
//          contentPane.add(search);
//          search.setColumns(10);
//
//
//          JLabel l3 = new JLabel("Back");
//          l3.addMouseListener((MouseAdapter) {setVisible(false);});
//          l3.setForeground(Color.GRAY);
//          l3.setFont(new Font("Trebuchet MS", Font.BOLD,18));
//          l3.setBounds(97,89,72,33);
//          contentPane.add(13);
//
//          JPanel panel = new JPanel();
//          panel.setBorder(new TitledBorder(new LineBorder(new Color(0,128,128),3,true, "Book Titile",
//          TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,128,0)));
//          panel.setBounds(67,54,1100,368);
//          contentPane.add(panel);
//          panel.setBackground(Color.WHITE);
//          Book();
//          setSize(1200,500);
//
//        }
//
//
//        public void actionPerformed(ActionEvent ae){
//            try{
//                conn con = new conn();
//                if(ae.getSource() == b1){
//                    new Marks(search.getText()).setVisible(true);
//                    this.setVisible(false);
//                };
//            }
//            catch (Exception e){}
//        }
//    }
//        public static void main(String[] args) {
//            new ExaminationDetails().setVisible(true);
//
//    }
//
//
//
//
//}
//
//


package university.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExaminationDetails extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1;

    // Load student data into table
    public void loadStudents() {
        try {
            conn con = new conn();
            String sql = "SELECT * FROM student"; // ensure your table name is correct
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ExaminationDetails() {
        setBounds(350, 200, 1200, 500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Table scroll pane
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 1080, 282);
        contentPane.add(scrollPane);

        table = new JTable();
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);

        // Search field
        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

        // Labels
        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(new Color(107, 142, 35));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);

        JLabel l3 = new JLabel("Back");
        l3.setForeground(Color.GRAY);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l3.setBounds(97, 89, 72, 33);
        l3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        contentPane.add(l3);

        // Result button
        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
        b1.setForeground(new Color(199, 21, 133));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(564, 89, 138, 33);
        contentPane.add(b1);

        // Panel border
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true),
                "Student Records", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(67, 54, 1100, 368);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        loadStudents(); // Load table data
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new Marks(search.getText()).setVisible(true); // Make sure Marks class exists
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ExaminationDetails().setVisible(true);
    }
}
