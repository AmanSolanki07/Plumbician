import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/BookingInfo";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Mikunakano123";

    public boolean storeBookingDetails(Booking booking) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String query = "INSERT INTO bookings (name, phone_number, address, profession_type, problem_details, status) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setString(1, booking.getName());
                statement.setString(2, booking.getPhoneNumber());
                statement.setString(3, booking.getAddress());
                statement.setString(4, booking.getProfessionType());
                statement.setString(5, booking.getProblemDetails());
                statement.setString(6, booking.getStatus());

                int rowsAffected = statement.executeUpdate();

                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
