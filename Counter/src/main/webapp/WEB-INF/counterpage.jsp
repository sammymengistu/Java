<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Display Date</title>

	</head>
	<body>
		<div class="container">
			<fieldset>
			<legend>Counter</legend>
			<% Integer count = (Integer) session.getAttribute("count"); %>
			<p>You've navigated to the home page <c:out value="${count}"/> times.</p>
			<a href="/reset">Reset</a><a href="/two">+2</a><a href="/">Back</a>
			</fieldset>
		</div>
	</body>
</html>