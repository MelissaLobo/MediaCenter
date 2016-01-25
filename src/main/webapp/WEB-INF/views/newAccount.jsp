<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina de cadastro de usuarios</title>

</head>
<body>
<jsp:include page="template.jsp"/>
<h1>Cadastro:</h1>
	<form id="teste" class="form-signin" action="/createAccount" method="POST">

		Nome: <input type="text" name="userName"> 
		<br>
		Email: <input type="text" name="email"> 
        <br>
		Senha: <input type="password" name="password">
		<br>
		Confirmar Senha: 
		<br>
		<input name="submit" type="submit" value="Create Account"
					class="login" />
	</form>
	
</body>
</html>