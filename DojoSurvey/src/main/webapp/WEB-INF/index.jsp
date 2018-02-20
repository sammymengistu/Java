<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Dojo Survey</title>

	</head>
	<body>
		<div class="container">
			<form method="POST" action="/process">
			<h3>Dojo Survey</h3>
			<label>
			<p>Your Name:</p>
			<input type="text" name="name" placeholder="Name here...">
			</label><br>
			<label>
			<p>Location:</p>
			<select name="location">
				<option value="Mountain View, CA">Mountain View, CA</option>
				<option value="San Francisco, CA">San Francisco, CA</option>
				<option value="Seattle, WA">Seattle, WA</option>
				<option value="Chicago, IL">Chicago, IL</option>
				<option value="New York, NY">New York, NY</option>
				<option value="Washington, DC">Washington, DC</option>
			</select>
			</label><br>
			<label>
			<p>Favourite Language:</p>
			<select name="lang">
				<option value="Python">Python</option>
				<option value="HTML">HTML</option>
				<option value="C++">C++</option>
				<option value="JavaScript">JavaScript</option>
				<option value="Java">Java</option>
				<option value="Ruby">Ruby</option>
				<option value="Other">Other</option>
			</select>
			</label><br>
			<label>
			<p>Comment (optional):</p>
			<textarea name="comment" placeholder="Comment here..."></textarea>
			</label><br>
			<button type="submit">Submit</button>
			</form>
		</div>
	</body>
</html>
