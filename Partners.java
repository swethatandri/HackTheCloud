//Curently this is just for the page where user inputs email and category
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/category")
public class Servlet extends HttpServlet 
{
    protected void doPOST(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        System.out.println("First");
        String Email = request.getParameter("address");
        String Category = request.getParameter("category");
        System.out.println("Problem before connect?");
        DBConnect connect = new DBConnect ();
        System.out.println("Class problem?");
        connect.Connect(Category, Email);
    }
 
}
