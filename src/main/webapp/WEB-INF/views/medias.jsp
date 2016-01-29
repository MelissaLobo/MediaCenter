<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Medias</title>
</head>
<body>
<jsp:include page="template.jsp"/>
<jsp:include page="busca.jsp"/>


	<div>
		<c:forEach items="${medias}" var="medias">
		<div>
		<label>Medias</label>
		<input type="text" name="medias">
		</div></c:forEach>
	</div>
	
	<h1>Lista de Midias</h1>
	<table>
		<tr>
			<td>Nome do Arquivo</td>
			<td>Arquivo</td>
			<td>Categoria</td>
			<td>Tag</td>
		</tr>
		<c:forEach items="${medias}" var="medias">
		<tr>
			<td>${media.nameFile}</td>
			<td>${media.file}</td>
			<td>${media.category}</td>
			<td>${media.tag}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>