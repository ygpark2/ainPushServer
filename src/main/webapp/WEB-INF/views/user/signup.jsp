<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
	<link rel="stylesheet" type="text/css" media="screen" href="resources/css/style.css"/>
	<title>Sign Up</title>
</head>

<body>
	<p class="message">${message}</p>
	<form class="signup-form" action="<c:url value="/user/signup"/>" method="post" >
		<fieldset>
			<legend>Sign Up</legend>
			
			<p>
				<label for="firstName">First Name</label>:
				<input id="firstName" name="firstName" size="20" maxlength="50" type="text"/>
			</p>

			<p>
				<label for="lastName">Last Name</label>:
				<input id="lastName" name="lastName" size="20" maxlength="50" type="text"/>
			</p>

			<p>
				<label for="email">email</label>:
				<input id="email" name="email" size="20" maxlength="150" type="text"/>
			</p>

			<p>
				<label for="username">username</label>:
				<input id="username" name="username" size="20" maxlength="100" type="text"/>
			</p>

			<p>
				<label for="password">Password</label>:
				<input id="password" name="password" size="20" maxlength="50" type="password"/>
			</p>
			
			<p><input type="submit" value="Signup"/></p>
		</fieldset>
	</form>

</body>
</html>