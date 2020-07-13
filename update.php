<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "Medical";

$category = $_POST['category'];
$sentence = $_POST['advice'];

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}



$sql = "INSERT INTO MedicalTable (Category, Sentence)
VALUES ('{$category}', '{$sentence}');";

if ($conn->multi_query($sql) === TRUE) {

  header("Location:thankyou2.html");
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>

