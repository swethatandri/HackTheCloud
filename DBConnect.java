package database_console;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect
{
    public String message = "";
    public static void main(String[]args)
    {
        String final host = "localhost";
        String final uName = "";
        String final uPass = "a58877"; 
        List<String> sentences = new ArrayList<String>();
        Connection con = DriverManager.getConnection("localhost", "root", ""); 
        ///Check the column and table names
        String query = "SELECT Category, Statement from MedicalTable LIKE 'variable'";
        Statement state = yourconnection.createStatement();
        try
        {
            ResultSet result = state.executeQuery(query);
            while(result.next())
            {
                if(result.getString(1)== variable)
                sentences.add(result.getString(2));
            }
        }
        finally
        {
            state.close();
        }
       //Need to put all teh elemnts together into a message varaible to parse it into teh SendEmail class
       for (int i = 0; i < sentences.size(); i++)
       {
           message = message + sentences.get(i) + "\n";
       }
    }
    public static void Email(String receiving)
    {
        SendEmail newEmail = new SendEmail(receiving, "aleesfca@gmail.com", "localhost", message); 
    }
}
