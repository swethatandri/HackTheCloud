import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calender;
 

//This Class inputs user information into SPL Database
//Need to replace the link in parentheses to correspond to the HTTP page
@WebServlet("/update")
public class Servlet2 extends HttpServlet 
{
    protected void doPOST(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String category = request.getParameter("address");
        String statement= request.getParameter("category");
        try
        {
            // Ask or find out the database url
            String url = "/update";
            //In a previous program, I replace url with "local host" but another tutorial says to use url. 
            //It is preferable to use url IF WE CAN FIND IT
            Connection conn = DriveManager.getConnection("/update", "root", "");
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
