<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>The Code</title>

  </head>
  <body>
  	<div class="all">
  		<h3>What is the code?</h3>
  		<% if(session.getAttribute("res") == "incorrect") { %>
  				<p class="red">You must train harder!</p>
  			<% } %>
  		<form method="POST" action="/process">
  			<input type="text" name="code"></input><br>
  			<button type="submit">Submit</button>
  		</form>
  	</div>
    
  </body>
</html>