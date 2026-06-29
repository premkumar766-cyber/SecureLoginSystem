import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register {

    public static boolean registerUser(String username, String email, String password) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(username, email, password) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Registration Successful!");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
