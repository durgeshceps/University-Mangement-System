
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class FeeStructure extends JFrame{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m12;


    public FeeStructure() {
        setSize(1700, 800);
        setLocation(100, 100);
        setLayout(null);

        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif", Font.ITALIC, 56));
        i1.setBounds(600, 10, 400, 70);
        add(i1);


        l1 = new JLabel("Course");
        l1.setBounds(80, 100, 100, 40);
        l2.setFont(new Font("serif", Font.BOLD, 26));
        add(l1);

        l2 = new JLabel("Btech");
        l2.setBounds(280, 100, 100, 40);
        l2.setFont(new Font("serif", Font.BOLD, 26));
        add(l2);

        l3 = new JLabel("BCA");
        l3.setBounds(400, 100, 100, 40);
        l3.setFont(new Font("serif", Font.BOLD, 26));
        add(l3);

        l4 = new JLabel("BBA");
        l4.setBounds(680, 100, 100, 40);
        l4.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb5);

        bb5 = new JLabel("25000");
        bb5.setBounds(680, 240, 150, 40);
        bb5.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb5);

        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(680, 240, 150, 40);
        bb6.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb6);


        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(680, 310, 150, 40);
        bb7.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb7);

        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(680, 380, 150, 40);
        bb8.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb8);


        bb13 = new JLabel("Rs 25000");
        bb13.setBounds(680, 450, 150, 40);
        bb13.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb13);

        bb14 = new JLabel("Rs 25000");
        bb14.setBounds(680, 520, 150, 40);
        bb14.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb14);

        l5 = new JLabel("Bsc");
        l5.setBounds(880, 100, 100, 40);
        l5.setFont(new Font("serif", Font.PLAIN, 26));
        add(l5);

        bb9 = new JLabel("Rs 18000");
        bb9.setBounds(880, 170, 150, 40);
        bb9.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb9);

        bb10 = new JLabel("18000");
        bb10.setBounds(880, 310, 150, 40);
        bb10.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb10);

        bb11 = new JLabel("18000");
        bb11.setBounds(880, 310, 150, 40);
        bb11.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb11);

        bb12 = new JLabel("18000");
        bb12.setBounds(880, 310, 150, 40);
        bb12.setFont(new Font("serif", Font.PLAIN, 26));


        bb15 = new JLabel("18000");
        bb15.setBounds(880, 310, 150, 40);
        bb15.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb15);


        bb16 = new JLabel("18000");
        bb16.setBounds(880, 310, 150, 40);
        bb16.setFont(new Font("serif", Font.PLAIN, 26));
        add(bb16);


        l6 = new JLabel("Mba");
        l6.setBounds(1000, 100, 100, 40);
        l6.setFont(new Font("serif", Font.PLAIN, 26));
        add(l6);

        m1 = new JLabel("18000");
        m1.setBounds(880, 310, 150, 40);
        m1.setFont(new Font("serif", Font.PLAIN, 26));
        add(m1);

        m2 = new JLabel("18000");
        m2.setBounds(1000, 310, 150, 40);
        m2.setFont(new Font("serif", Font.PLAIN, 26));
        add(m2);

        m3 = new JLabel("18000");
        m3.setBounds(1000, 310, 150, 40);
        m3.setFont(new Font("serif", Font.PLAIN, 26));
        add(m3);

        m4 = new JLabel("18000");
        m4.setBounds(1000, 310, 150, 40);
        m4.setFont(new Font("serif", Font.PLAIN, 26));
        add(m4);

        l7 = new JLabel("MCA");
        l7.setBounds(1280, 100, 100, 40);
        l7.setFont(new Font("serif", Font.PLAIN, 26));
        add(l7);

        m5 = new JLabel("55000");
        m5.setBounds(1200, 170, 150, 40);
        m5.setFont(new Font("serif", Font.PLAIN, 26));
        add(m5);

        m6 = new JLabel("55000");
        m6.setBounds(1280, 310, 150, 40);
        m6.setFont(new Font("serif", Font.PLAIN, 26));
        add(m6);


        m7 = new JLabel("55000");
        m7.setBounds(1280, 310, 150, 40);
        m7.setFont(new Font("serif", Font.PLAIN, 26));
        add(m7);

        m8 = new JLabel("55000");
        m8.setBounds(1280, 310, 150, 40);
        m8.setFont(new Font("serif", Font.PLAIN, 26));
        add(m8);


    }
    public static void main(String[] args){
        new FeeStructure();




    }
}