<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:ui="http://java.sun.com/jsf/facelets">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="template.html" rel="stylesheet">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina de Cadastro de Midia</title>
</head>
<body>
<jsp:include page="template.jsp"/>
 <jsp:include page="busca.jsp"/>
 
   <div class="container">
  
	 <h1>Nova Midia:</h1> 
		<form id="teste" class="form-signin" action="/createMedia" method="POST">
	
		<div>
			<label>Nome do Arquivo:</label> 
			<input type="text" name="nameFile"> 
		</div>
		<div>
			<label>Arquivo:</label><input type="file" name="file">
	   </div>
		<div>
			<label>TAG:</label>
			<input type="text" name="tag">
		</div>
		<div>
			<label>Categoria:</label>
			<input type="text" name="category">
		</div>
		<c:forEach items= "" var="tag">TAG</c:forEach>
		
		<div id="actions" class="row">
    		<div class="col-md-12">
    		  <button type="submit" class="btn btn-primary" value="Create Media">Salvar</button>
    		  <a href="/" class="btn btn-default">Cancelar</a>
    		</div>
 		 </div>
		</form>
	</div>
  
 
  
</body>

</html>