<!DOCTYPE html>
<html>
<head>
<title>Booking Confirmed</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 600px;
	margin: 0 auto;
	padding: 20px;
	background-color: #fff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
	color: #333;
}

p {
	margin: 10px 0;
}

.booking-details {
	margin-top: 20px;
	padding: 10px;
	background-color: #f9f9f9;
	border: 1px solid #ccc;
}

.booking-details p {
	margin: 5px 0;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Booking Confirmed</h1>
		<div class="booking-details">
			<p>
				<strong>Name:</strong>
				<%=request.getAttribute("name")%></p>
			<p>
				<strong>Phone Number:</strong>
				<%=request.getAttribute("phoneNumber")%></p>
			<p>
				<strong>Address:</strong>
				<%=request.getAttribute("address")%></p>
			<p>
				<strong>Profession Type:</strong>
				<%=request.getAttribute("professionType")%></p>
		</div>
	</div>
</body>
</html>
