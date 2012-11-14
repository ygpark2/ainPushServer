<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE html>
<html>
<head>
    <title><decorator:title default="SiteMesh Integration"/></title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
	<link href="<c:out value="${pageContext.request.contextPath}"/>/ext/bootstrap/css/bootstrap.css" media="screen" rel="stylesheet" type="text/css" />
	<style type="text/css">
      body {
        padding-top: 20px;
        padding-bottom: 40px;
      }

      /* Custom container */
      .container-narrow {
        margin: 0 auto;
        max-width: 700px;
      }
      .container-narrow > hr {
        margin: 30px 0;
      }

      /* Main marketing message and sign up button */
      .jumbotron {
        margin: 60px 0;
        text-align: center;
      }
      .jumbotron h1 {
        font-size: 72px;
        line-height: 1;
      }
      .jumbotron .btn {
        font-size: 21px;
        padding: 14px 24px;
      }

      /* Supporting marketing content */
      .marketing {
        margin: 60px 0;
      }
      .marketing p + h4 {
        margin-top: 28px;
      }
    </style>
	<link href="<c:out value="${pageContext.request.contextPath}"/>/ext/bootstrap/css/bootstrap-responsive.css" media="screen" rel="stylesheet" type="text/css" />
	<script src="<c:out value="${pageContext.request.contextPath}"/>/ext/bootstrap/js/bootstrap.js" type="text/javascript"></script>
    <decorator:head/>
</head>
<body>

    <div class="container-narrow">

      <div class="masthead">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="<c:url value="/"/>">Home</a></li>
          <li><a href="<c:url value="/user/login"/>">Login</a></li>
          <li><a href="<c:url value="/user/signup"/>">Signup</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
        <h3 class="muted">ain Push Server</h3>
      </div>

      <hr>
		<decorator:body/>
      <hr>

      <div class="footer">
        <p>&copy; Company 2012</p>
      </div>

	</div>

</body>
</html>