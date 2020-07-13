<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <title>repl.it</title>
    <link href="category.css" rel="stylesheet" type="text/css" />
  </head>
  <body>

    <section class = "header"> 

    <div class = "navbar">
        <a href = "index.html"> Home </a>
        <a href = "#"> | </a>
        <a href = "about.html">About</a>
        <a href = "#"> | </a>
        <a href = "category.php"> Get Advice from the Medical Community! </a>
        <a href = "#"> | </a>
        <a href = "index.php"> Contribute to the Database</a>

      
      </div>
      
    <h1 class = "title" > Get Advice from the Medical Community! </h1>   
  
  
  </section>

    <section class = "repository">

      <div class = "form">

       <form name = "email" action = "email.php" method = "POST">


     <div class = "header2">
       <h2 class = "white"> Want tips from other medical professionals delivered straight to your email?

       </h2>
       </div>  


      <div class = "question">

       <label for = "email" class = "white"> Email Address </label> 

      </div>


      <div class = "answer"> 

        <textarea id = "email" name = "email" rows = "1" > </textarea> 

      </div>


      <div class = "question">

       <label for = "category" class = "white"> Category </label> 

      </div>

      <div class = "answer"> 

       <textarea id = "category" name = "category" rows = "1" > </textarea> 

     </div>

    <input type = "submit" name = "send" value = "Submit"> 


  </div> 


  </form> 

    

 </div>


    </section>

  </body>


</html>
