import java.sql.Connection;

public class LoginSystem {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("     SECURE LOGIN SYSTEM");
        System.out.println("==================================");

        Connection con = DBConnection.getConnection();

        if (con != null) {
            System.out.println("Database Connected Successfully!");
            System.out.println("System Ready...");
        } else {
            System.out.println("Database Connection Failed!");
        }
    }
}
