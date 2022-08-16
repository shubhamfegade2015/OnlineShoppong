<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./style.css">

    <!-- Bootstrap CSS -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/c26cd2166c.js"></script>
    <script src="login.js" ></script>



</head>
<body>

    <nav class="navbar navbar-expand-lg ">
        <div class="container">
          <a class="navbar-brand" href="index.html">Fashion</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav m-auto my-2 my-lg-0">
              <li class="nav-item">
                <a class="nav-link" href="#">Men's</a>
              </li>
              <li class="nav-item">
                <a class="nav-link " href="#"  >
                  Woman's 
                </a> 
              </li>

              <li class="nav-item">
                <a class="nav-link " href="#">Kid's</a>
              </li>


              <li class="nav-item">
                <a class="nav-link " href="#">Contact Us</a>
              </li>
            </ul>
            <form class="d-flex">
              <span><i class="far fa-heart"></i></span>
              <span><i class="fab fa-opencart px-3"></i></span>
              <span><i class="far fa-user"></i></span>
            </form>
          </div>
        </div>
      </nav>
<!--====================================================================-->

    <section class="main bg-light">
        <div class="container ">
            <div class="row pt-5">
                <div class="col-lg-8 pt-5">
                    <form class="box" action="/OnlineShopping/RegisterUser" method="post">
                        <h1>Register User</h1>
                        <br></br>
                        
                        <input type="text" name="uname" placeholder="Username" ><br></br>
                        <input type="password" name="upass" placeholder="Password" ><br></br>
						<input type="text" name="uemail" placeholder="Email" ><br></br>
						<input type="text" name="umob" placeholder="Mobile No." ><br></br>
                        <input type="submit" value="Sign Up" >
                        
                      </form>
                </div>
            </div>
        </div>
      </section>
    



</body>
</html>