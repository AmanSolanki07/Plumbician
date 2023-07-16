<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Screen</title>
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

.profession-buttons {
	display: flex;
	justify-content: center;
	margin-bottom: 20px;
}

.profession-buttons button {
	margin: 0 10px;
	padding: 10px 20px;
	font-size: 16px;
	background-color: #007bff;
	color: #ffffff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.profession-buttons button:hover {
	background-color: #0056b3;
}

.option-buttons {
	display: flex;
	justify-content: center;
}

.option-buttons button {
	margin: 0 10px;
	padding: 10px 20px;
	font-size: 16px;
	background-color: #28a745;
	color: #ffffff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.option-buttons button:hover {
	background-color: #1e7e34;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome to the Daily Needs Service Provider</h1>

		<div class="profession-buttons">
			<form action="MainController" method="post">
				<button type="submit" name="profession" value="electrician">Electrician</button>
				<button type="submit" name="profession" value="plumber">Plumber</button>
			</form>
		</div>

		<div class="option-buttons">
			<form action="MainController" method="post">
				<button type="submit" name="option" value="member">Become a
					Member</button>
				<button type="submit" name="option" value="professional">Join
					as a Professional</button>
			</form>
		</div>
	</div>
</body>
</html>
