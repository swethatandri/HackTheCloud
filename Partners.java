//Curently this is just for the page where user inputs email and category
@WebServlet("/partners.php")
public class Partners extends HttpServlet 
{
    protected void doPOST(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String Email = request.getParameter("address");
        String Category = request.getParameter("category");
        DBConnect connect = new DBConnect ();
        connect.Connect(Category, Email);
    }
 
}
