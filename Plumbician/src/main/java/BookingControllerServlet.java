import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookingControllerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/BookingInfo";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Mikunakano123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        String professionType = request.getParameter("professionType");

        // Store the booking details in the database
        boolean bookingSuccess = storeBookingDetails(name, phoneNumber, address, professionType);

        if (bookingSuccess) {
            // Redirect to the Booking Confirmation screen
            response.sendRedirect("BookingConfirmed.jsp");
        } else {
            // Handle booking failure
            response.getWriter().println("Booking failed. Please try again.");
        }
    }

    private boolean storeBookingDetails(String name, String phoneNumber, String address, String professionType) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String query = "INSERT INTO bookings (name, phone_number, address, profession_type) VALUES (?, ?, ?, ?)";

            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setString(1, name);
                statement.setString(2, phoneNumber);
                statement.setString(3, address);
                statement.setString(4, professionType);

                int rowsAffected = statement.executeUpdate();

                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
