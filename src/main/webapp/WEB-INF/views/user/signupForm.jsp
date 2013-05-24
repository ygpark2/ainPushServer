<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
	<link rel="stylesheet" type="text/css" media="screen" href="resources/css/style.css"/>
	<title>Sign Up</title>
</head>

<body>
	<p class="message">${message}</p>
	<form:form action="<c:url value="/user/signup"/>" method="POST" modelAttribute="ain_user" id="signup-form">
		<fieldset>
			<legend>Sign Up</legend>

			<p>
				<label for="firstName">First Name</label>:
				<form:input path="firstName" id="firstName" size="20" maxlength="50" style="width:80px"/>
                <form:errors path="firstName" cssClass="errors"/>
			</p>

			<p>
				<label for="lastName">Last Name</label>:
				<form:input path="lastName" id="lastName" size="20" maxlength="50" style="width:80px"/>
                <form:errors path="lastName" cssClass="errors"/>
			</p>

			<p>
				<label for="email">email</label>:
				<form:input path="email" id="email" size="20" maxlength="150" style="width:150px"/>
                <form:errors path="email" cssClass="errors"/>
			</p>

			<p>
				<label for="username">username</label>:
				<form:input path="username" id="email" size="20" maxlength="100" style="width:100px"/>
                <form:errors path="username" cssClass="errors"/>
			</p>

			<p>
				<label for="password">Password</label>:
				<form:password path="password" id="password" size="20" maxlength="50" style="width:60px"/>
                <form:errors path="password" cssClass="errors"/>
			</p>

			<p><input type="submit" value="Signup"/></p>
		</fieldset>
	</form:form>
</body>
</html>