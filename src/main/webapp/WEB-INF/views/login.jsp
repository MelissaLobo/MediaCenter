<!DOCTYPE html>
<html lang="en">
	<!--InformaÃ§Ãµes da Pagina -->
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Bootstrap Login Form</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		
		<link href="css/bootstrap.min.css" rel="stylesheet">
 		<link href="css/style.css" rel="stylesheet">

	</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		 <div class="container-fluid">
		  <div class="navbar-header">
		   <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
		    <span class="sr-only">Toggle navigation</span>
		    <span class="icon-bar"></span>
		    <span class="icon-bar"></span>
		    <span class="icon-bar"></span>
		   </button>
		   <a class="navbar-brand" href="#">Central de Midias em Algodoes Doce</a>
		  </div>
		  <div id="navbar" class="navbar-collapse collapse">
		   <ul class="nav navbar-nav navbar-right">
		    <li><a href="#">Início</a></li>
		    <li><a href="#">Opções</a></li>
		    <li><a href="#">Perfil</a></li>
		    <li><a href="#">Ajuda</a></li>
		   </ul>
		  </div>
		 </div>
	</nav>
  <div class="wrapper">
    <form class="form-signin">       
      <h2 class="form-signin-heading">Please login</h2>
      <input type="text" class="form-control" name="email" placeholder="Email Address"  />
      <input type="password" class="form-control" name="password" placeholder="Password" />      
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
    </form>
  </div>

	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>