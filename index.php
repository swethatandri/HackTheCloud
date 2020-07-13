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

    
    <h1 class = "title" > Contribute to the Database! </h1> </section>

    <section class = "repository">

      <div class = "form">

       <form name = "update" action = "update.php" method = "POST">

   

     <div class = "header2">
       <h2 class = "white"> Are you a medical professional who wants to contribute to the database?

       </h2>
       </div>  


      <div class = "question">

       <label for = "category" class = "white" > Category </label> 

      </div>


      <div class = "answer"> 

        <textarea id = "category" name = "category" rows = "1" > </textarea> 

      </div>


      <div class = "question">

       <label for = "advice" class = "white"> Advice </label> 

      </div>

      <div class = "answer"> 

       <textarea cols = "120" id = "advice" name = "advice" rows = "5" > </textarea> 

     </div>

    <input type = "submit" name = "send" value = "Submit"> 


  </div> 


  </form> 

    

 </div>


    </section>

  </body>


</html>