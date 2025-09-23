//starting part
package university.management.system;
import java.sql.*;


public class conn {
        Connection c;
        Statement s;
    public  conn() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
                s = c.createStatement();
            System.out.println("Connection established Succesfully");

            } catch (Exception e) {
                System.out.println(" Connection failed" +e);
            }

        }
        public static void main(String [] args){
        new conn();

    }
}

