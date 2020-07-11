import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail 
{
    public static void Send(String to, String from, String host, String message)
    {
        Properties prop = System.getProperties();
        prop.setProperty("mail.smtp.host", host)
        Sessions session = Session.getDefaultInstance(prop);
        //////////Trial Session
        to = "aleesfca@gmail.com";
        from = "allee2@s.sfusd.edu";
        host = "localhost";
        //////////////////////
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(t0));
            message.setSubject("Your Mental Advice!");
            message.setText("Example Message");
            Transport.send(message);
            System.out.println("Sent message successfully....");
        }
        catch (MessagingExcpetion mex)
        {
            mex.printStackTrace();
        }
    }
}
