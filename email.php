<?php

  use PHPMailer\PHPMailer\PHPMailer;
  use PHPMailer\PHPMailer\Exception;

  $servername = "localhost";
  $username = "root";
  $password = "";
  $dbname = "Medical";


  $conn = new mysqli($servername, $username, $password, $dbname);
  // Check connection
  if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
 }

 $textsend = "";


  require 'vendor/autoload.php';
    $email = $_POST['email'];
    $category = $_POST['category'];

    $query = "SELECT * FROM MedicalTable 
    WHERE Category ='{$category}';";

 
  $result = $conn->query($query);

if ($result->num_rows > 0) {
  // output data of each row
  while($row = $result->fetch_assoc()) {
    $textsend .=  $row["Sentence"]. "<br>";
  }
} else {
  echo "0 results";
}
$conn->close();

$mail = new PHPMailer;
       
    echo 'Created a new object';

    $mail->isSMTP();


    // $mail->SMTPDebug = 2;
    $mail->Host       = 'smtp.gmail.com;';    // Specify main SMTP server
    $mail->SMTPAuth   = true;               // Enable SMTP authentication
    $mail->Username   = 'swethat101@gmail.com';     // SMTP username
    $mail->Password   = 'Musicaria19';         // SMTP password
    $mail->SMTPSecure = 'ssl';              // Enable TLS encryption, 'ssl' also accepted
    $mail->Port       = 465;                // TCP port to connect to


    $mail->setFrom($_POST['email'], 'PsychBase.doc');           // Set sender of the mail
    $mail->addAddress('swethat101@gmail.com');           // Add a recipient


    $mail->isHTML(true);                                  
    $mail->Subject = 'PsychBase.doc Tips from Medical Community on ' . $category ;
    $mail->Body    = "<b> Here are some statements/resources from your category of choice: </b> " . $textsend;
    $mail->AltBody = 'Body in plain text for non-HTML mail clients';


    
    $sent = $mail->send();

    if($sent){  
      header("Location:thankyou.html");

      
  }else{
      echo 'Message could not be sent.';
      echo 'Mailer Error: ' . $mail->ErrorInfo;
      
      
  }




 












    
    

    
   
?>