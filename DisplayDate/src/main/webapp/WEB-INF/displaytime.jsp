
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Display Time</title>
	
	</head>
	<body>
		<div class="container">
			<fieldset>
			<legend>Time</legend>
			<c:set var = "now" value = "${time}" />
			<p>The time is: <fmt:formatDate pattern = "hh:mm a" value = "${now}" /></p>
			<a href="/">Back</a>
			</fieldset>
		</div>
	</body>
</html>