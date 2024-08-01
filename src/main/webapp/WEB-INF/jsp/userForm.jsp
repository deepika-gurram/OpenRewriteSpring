<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>User Form</title>
</head>
<body>
	<h1>${user.id == null ? 'New User' : 'Edit User'}</h1>
	<form action="${pageContext.request.contextPath}/users" method="post">
		<input type="hidden" name="id" value="${user.id}" /> <label
			for="name">Name:</label> <input type="text" id="name" name="name"
			value="${user.name}" required /> <br /> <label for="email">Email:</label>
		<input type="email" id="email" name="email" value="${user.email}"
			required /> <br />
		<button type="submit">Save</button>
	</form>
	<a href="${pageContext.request.contextPath}/users">Back to List</a>
</body>