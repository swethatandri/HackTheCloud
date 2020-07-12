import java.sql.*;

//This Class inputs user information into SPL Database
//Need to replace the link in parentheses to correspond to the HTTP page
@WebServlet("/partners.php")
public class Servlet2 extends HttpServlet 
{
    protected void doPOST(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        //replace the getParameter variables
        String category = request.getParameter("address");
        String statement= request.getParameter("category");
        try
        {
            // Ask or find out the database url
            String url = "";
            //In a previous program, I replace url with "local host" but another tutorial says to use url. 
            //It is preferable to use url IF WE CAN FIND IT
            Connection conn = DriveManager.getConnection(url, "root", "");
            Statement stat = conn.createStatement();
            stat.executeUpdate("INSERT INTO MedicalTable " + "VALUES (category, statement)");
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
 
}
