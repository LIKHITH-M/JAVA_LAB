import java.sql.*;
public class program_b7 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root@123");
            System.out.println("Connection established sucessfully" + con);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into student (Name, USN, Sem) values ('Kiran','4VV21CS004',3)");
            ResultSet rs = stmt.executeQuery("select * from student");
            System.out.println("Name \tUSN \t\tSem");
            while (rs.next())
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
