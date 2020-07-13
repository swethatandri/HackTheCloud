
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Authenticator;
import javax.mail.Message;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;
import javax.mail.PasswordAuthentication;

public class SendEmail {
    // In the final version, we need to delete main method because DBConnect will
    // call the class
    public static void Send(String to, String from, String host, String message) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        // Session session = Session.getDefaultInstance(prop);
        //////////// Trying
        props.setProperty("mail.transport.protocol", "smtp");

        props.setProperty("mail.smtp. host", "smtp.gmail.com");

        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");

        props.put("mail.debug", "true");

        props.put("mail.smtp.socketFactory.port", "465");

        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        props.put("mail.smtp.socketFactory.fallback", "false");
        //System.out.println("got to password authentication");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("aleesfca@gmail.com", "a58877aaa");
        }
        });
           ///////////////////////////////////////
        try{
            Message mess = new MimeMessage(session);
            //////////////
            session.setDebug(true);
            Transport transport = session.getTransport();
            //System.out.println("Are we there");
            InternetAddress addressTo=new InternetAddress(to);  
            InternetAddress addressFrom= new InternetAddress(from);
            //System.out.println("bad");
           mess.setRecipient(Message.RecipientType.TO,addressTo); 
           //////////////////
           //transport.connect();
            //System.out.println("2b or not 1b");
            //mess.setFrom(new InternetAddress(from));
            //mess.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mess.setFrom(addressFrom);
            mess.addRecipient(Message.RecipientType.TO, addressTo);
            mess.setSubject("Your Mental Advice!");
            mess.setText(message);
            //System.out.println("this far???");
            Transport.send(mess);
            //System.out.println("Sent message successfully....");
            transport.close();
        }
        catch (MessagingException mex)
        {
            throw new RuntimeException(mex);
        }
    }
}

class GJMailAuthenticator extends javax.mail.Authenticator
{
    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication("aleesfca@gmail.com", "a58877aaa");
    }
}
