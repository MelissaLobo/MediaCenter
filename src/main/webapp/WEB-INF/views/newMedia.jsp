<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
<jsp:include page="template.jsp"/>go
 <jsp:include page="busca.jsp"/>
 
   <div class="container">
  
	 <h1>Nova Midia:</h1> 
		
		<form:form  class="form-signin" action="/createMedia" method="POST" commandName="media">
			<h2 class="form-signin-heading" enctype="multipart/form-data">Nova Midia</h2>
		<div>
			<label>Nome do Arquivo:</label>
			<input type="text" class="form-control" name="nameFile"> 
			<form:errors path="nameFile"/> 
		</div>
		<div>
			<label>Arquivo:</label>
			<input type="file" class="form-control" name="file">
			<form:errors path="file"/> 
	   </div>
	   <div>
			<label>Tag:</label>
			<input type="text" class="form-control" name="tag">
	   </div>
		
<%-- 		<c:forEach items= "${category}" var="category"> --%>
			<div>
				<label>Categoria</label>
				<input type="text" class="form-control" name="category">
				<form:errors path="category"/> 
			</div>
	<br>
			
		<div id="actions" class="row">
    		<div class="col-md-12">
    		  <button type="submit" class="btn btn-primary" value="Create Media">Salvar</button>
    		  <a href="/" class="btn btn-default">Cancelar</a>
    		</div>
 		 </div>
		</form:form>
	</div>
  
</body>

</html>