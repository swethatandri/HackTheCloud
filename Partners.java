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
        String Email = request.getParameter("address");
        String Category = request.getParameter("category");
        DBConnect connect = new DBConnect ();
        connect.Connect(Category, Email);
    }
 
}
