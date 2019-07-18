<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
body {
	background-image:
		url(http://www.joburgchiropractor.co.za/images/background.jpg);
}
</style>

</head>
<body>
	<!-- if you want to create login page and register page together in one page ...you have to only change his name...that's it...-->
	<div class="container" style="margin-top: 5%;">
	
		<c:if test="${status}">
		<div class = "alert alert-info">
		<strong>${message}</strong>
		</div></c:if>

		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-md-4">

				<h1 class="text-center text-success">Register page</h1>
				<br />

				<div class="col-sm-12">


					<br />
					<div class="tab-content">
						<div id="home" class="tab-pane fade in active">

							<form action="regservlet" method="post">

								<div class="form-group">
									<label for="UserName">Name</label> <input type="text"
										class="form-control" id="name" tabindex="1" name="name"
										value="${newcustomer.name}">
								</div>

								<div class="form-group">
									<label for="email">Email address:</label> <input type="email"
										class="form-control" id="email" tabindex="2" name="email"
										value="${newcustomer.email_Address}">
								</div>

								<div class="form-group">
									<label for="pwd">Password:</label> <input type="password"
										class="form-control" id="pwd" name="pwd">
								</div>

								<div class="form-group">
									<label for="pwd">Confirm Password:</label> <input
										type="password" class="form-control" id="cpwd" name="cpwd">
								</div>
								<button type="submit" class="btn btn-default btn-lg">Submit</button>
								<button type="submit" class=" pull-right btn-link">
									<a href="viewDetails">View Details</a>
								</button>

							</form>
							<br /> <a href="#" class="pull-right btn btn-block btn-danger">
								Already Register ? </a>
						</div>

						<div id="menu1" class="tab-pane fade">

							<form action="#">

								<div class="form-group">
									<label for="UserName">UserName</label> <input type="text"
										class="form-control" id="email">
								</div>

								<div class="form-group">
									<label for="email">Email address:</label> <input type="email"
										class="form-control" id="email">
								</div>

								<div class="form-group">
									<label for="pwd">Password:</label> <input type="password"
										class="form-control" id="pwd">
								</div>

								<div class="form-group">
									<label for="pwd">Confirm Password:</label> <input
										type="password" class="form-control" id="pwd">
								</div>
								<button type="submit" class="btn btn-default">Submit</button>

								<button type="submit" class=" pull-right btn-link">
									<a href="www.google.com">Forget password</a>
								</button>

							</form>
							<br /> <a href="#" class="pull-right btn btn-block btn-success">
								Already Register ? </a>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- This design is created by manoj chauhan  -->
</body>
</html>
