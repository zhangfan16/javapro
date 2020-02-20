package xzy.ify.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by zf188 on 2020/2/20.
 */
public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbl?useUnicode = true&characterEncoding = utf8";
        String username = "root";
        String password = "root";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into student(name,age,gender)VALUES('豹',3,1)");
            int i = pstmt.executeUpdate();
            System.out.println(i);
            } catch (SQLException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt!= null)
                pstmt.close();
                if (con!= null);
                con.close();
                } catch (SQLException e) {
                    e.printStackTrace();

            }
        }
    }
}
