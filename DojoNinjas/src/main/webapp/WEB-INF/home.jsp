<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Dojos and Ninjas</title>

  </head>
  <body>
  	<div class="all">
  		<h1>Welcome to Dojos and Ninjas!</h1>
  		<a href="/dojos/new">Create Dojo</a> || <a href="/ninjas/new">Create Ninjas</a>
  		<div class="everyone">
  			<h3>All Dojos</h3>
  			<c:forEach items="${dojos}" var="dojo">
  				<div class="dojo">
  					<a href="/dojos/${dojo.id}"><h4>▻ <c:out value="${dojo.name}"/></h4></a>
  				</div>
			</c:forEach>
  		</div>
  	</div>
  </body>
</html>