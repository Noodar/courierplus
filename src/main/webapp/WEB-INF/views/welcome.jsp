<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Code For The Future</title>
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/default.css">
  <link rel="shortcut icon" href="https://cdn-a.sonyentertainmentnetwork.com/grc/images/favicons/liquid/favicon.ico" />
  <style>
	body {
	    background-color: #1084C6;
	}
  </style>
</head>
<body>

  <section>
        <img src="<%= request.getContextPath() %>/resources/pics/code_for_the_future.jpg" width="200" height="200"/><br>
  </section>
  
  <h2 align="center">Live Classes</h2>
  
  <section class="circular">
  	<table>
  		<tr>
  			<td>Class Name                      1</td>
  			<td>
  				<img src="<%= request.getContextPath() %>/resources/pics/prof_man1.jpg" width="100" height="100"/>
			</td>
		</tr>
		<tr>
  			<td>Class Name                      2</td>
  			<td>
  				<img src="<%= request.getContextPath() %>/resources/pics/prof_man2.jpg" width="100" height="100"/>
			</td>
		</tr>
		<tr>
  			<td>Class Name</td>
  			<td>
  				<img src="<%= request.getContextPath() %>/resources/pics/prof_woman1.jpg" width="100" height="100"/>
			</td>
		</tr>
  	</table>
  </section>
  
  <h2 align="center">Upcoming Classes</h2>
</body>
</html>