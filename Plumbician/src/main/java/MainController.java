import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainController")
public class MainController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String profession = request.getParameter("profession");
        String option = request.getParameter("option");

        if (profession != null) {
            if (profession.equals("electrician")) {
                request.getRequestDispatcher("ElectricianForm.jsp").forward(request, response);
            } else if (profession.equals("plumber")) {
                request.getRequestDispatcher("PlumberForm.jsp").forward(request, response);
            }
        } else if (option != null) {
            if (option.equals("member")) {
                request.getRequestDispatcher("MembershipRegistration.jsp").forward(request, response);
            } else if (option.equals("professional")) {
                request.getRequestDispatcher("ProfessionalRegistration.jsp").forward(request, response);
            }
        } else {            
            response.sendRedirect("MainScreenView.jsp");
        }
    }
}
