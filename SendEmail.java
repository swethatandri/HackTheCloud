import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
// import javax.activation.*;

public class SendEmail 
{
    // In the final version, we need to delete main method because DBConnect will call the class
    public static void main(String[] args)
    {
        //////////Trial Session
        String to = "aleesfca@gmail.com";
        String from = "aleesfca@gmail.com";
        String host = "localhost";
        String message = "here you go";
        //////////////////////
        Send(to, from, host, message);
    }
    public static void Send(String to, String from, String host, String message)
    {
        Properties prop = System.getProperties();
        prop.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(prop);
        try{
            MimeMessage mess = new MimeMessage(session);
            mess.setFrom(new InternetAddress(from));
            mess.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mess.setSubject("Your Mental Advice!");
            mess.setText("Example Message");
            Transport.send(mess);
            System.out.println("Sent message successfully....");
        }
        catch (MessagingException mex)
        {
            mex.printStackTrace();
        }
    }
}
