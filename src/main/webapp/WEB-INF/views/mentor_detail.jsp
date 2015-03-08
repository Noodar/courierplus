<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<style>
		body {
		    background-color: #0098D1;
		}
		li {
			background-color: #FFFFFF;
			border-top-right-radius: 5px;
    		border-bottom-right-radius: 5px;
    		border-top-left-radius: 5px;
    		border-bottom-left-radius: 5px;      
		}
	</style>
	
	
	<title>Home</title>
	
</head>
<body>
	<a href="<%=request.getContextPath()%>/home" target="_self">
		<img src="<%=request.getContextPath()%>/resources/pics/code_for_the_future_logo.jpg" width="600" height="200" />
	</a>

	<ul class="nav nav-pills">
		<li role="presentation"><a href="#">About Us</a></li>
		<li role="presentation"><a href="#">My Subscriptions</a></li>
		<li role="presentation"><a href="<%=request.getContextPath()%>/classes">Classes</a></li>
		<li role="presentation" class="active"><a href="<%=request.getContextPath()%>/mentors">Mentors</a></li>
		<li role="presentation"><a href="#">Sign Up/Login</a></li>
		<li role="presentation"><a href="#">Donate</a></li>
	</ul>

	<br/>
	<br/>
	<br/>
	<img src="<%= request.getContextPath() %>/resources/pics/mentor_profile.jpg" align="middle" width="600" height="1000"/>
</body>
</html>