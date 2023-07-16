<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Plumber Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
}

.container {
	max-width: 600px;
	margin: 0 auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
	margin-top: 0;
}

form {
	margin-top: 20px;
}

label {
	display: block;
	margin-bottom: 5px;
}

input[type="text"], textarea {
	width: 100%;
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"], input[type="button"] {
	padding: 10px 20px;
	font-size: 16px;
	background-color: #007bff;
	color: #ffffff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type="submit"]:hover, input[type="button"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Plumber Form</h1>

		<form action="BookingControllerServlet" method="post">
			<input type="hidden" name="profession" value="plumber"> <label
				for="problemDetails">Problem Details:</label>
			<textarea id="problemDetails" name="problemDetails" rows="5"
				cols="50" required></textarea>

			<label for="name">Name:</label> <input type="text" id="name"
				name="name" required> <label for="address">Address:</label>
			<input type="text" id="address" name="address" required> <label
				for="phoneNumber">Phone Number:</label> <input type="text"
				id="phoneNumber" name="phoneNumber" required>

			<!-- Additional fields and details as needed -->

			<input type="submit" value="Book Plumber"> <input
				type="button" value="Cancel"
				onclick="window.location.href='MainScreenView.jsp'">
		</form>
	</div>
</body>
</html>
