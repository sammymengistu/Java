<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Show Dojo</title>
	
  </head>
  <body>
  	<div class="all">
  		<div class="header">
	  		<h3><c:out value="${dojo.name}"/> Ninjas</h3>
	  		<a href="/ninjas/new">Add Ninja</a> || <a href="/">Back</a> 
  		</div>
  		<div class="body">
  			<table>
  				<tr>
  					<th>First Name</th>
  					<th>Last Name</th>
  					<th>Age</th>
  				</tr>
  				<c:forEach items="${ninjas}" var="ninja">
			    		<tr>    
			    			<td><c:out value="${ninja.first_name}"/></td>
			    			<td><c:out value="${ninja.last_name}"/></td>
			    			<td><c:out value="${ninja.age}"/></td>
			    		</tr>
				</c:forEach>
  			</table>
  		</div>
  	</div>
  </body>
</html>