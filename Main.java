import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="root";
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.print("Database connected");
    }
}
