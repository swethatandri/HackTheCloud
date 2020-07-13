package database_console;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect
{
    public String message = "";
    public static void Connect(String variable, String receiving)
    {
        String final host = "smtp.gmail.com";
        String final uName = "root";
        String final uPass = ""; 
        List<String> sentences = new ArrayList<String>();
        Connection con = DriverManager.getConnection("smtp.gmail.com", "root", ""); 
        ///Check the column and table names
        String query = "SELECT Category, Statement from MedicalTable LIKE variable";
        Statement state = yourconnection.createStatement();
        try
        {
            ResultSet result = state.executeQuery(query);
            while(result.next())
            {
                if(result.getString(1).equals(variable))
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
        SendEmail newEmail = new SendEmail();
        newEmail.Send(receiving, "aleesfca@gmail.com", "smtp.gmail.com", message); 
    }
}
