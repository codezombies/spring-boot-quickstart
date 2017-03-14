<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>Test</head>
	<body>
		<h1>DATE FROM SERVER: ${date}</h1>
		<h2>List of Users</h2>
		
		<ul>
		<c:forEach var="user" items="${users}">
			<li>(${user.id}) ${user.name }</li>		
		</c:forEach>
		</ul>
						
	</body>
</html>