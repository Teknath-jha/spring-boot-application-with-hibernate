<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>

	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
		<title>List todos</title>

	</head>
	
	<body>
	
	<div class="container">
		<div>Welcome ${name}....</div>
		 <hr>
		 <h1>Your Todos  </h1>
		 <table class="table">
		 	<thead>
		 		<tr>
		 			<th>id</th>
			 		<th>description</th>
			 		<th>Target Date</th>
			 		<th>Is Completed?</th>
			 		<th>Delete</th>
			 		<th>Edit</th>
		 		</tr>
		 	</thead>
			 <tbody>
				 <c:forEach items="${todos}" var="todo">
				 		<tr>
				 				<td>${todo.id }</td>
				 				<td>${todo.description }</td>
				 				<td>${todo.targetDate }</td>
				 				<td>${todo.done }</td>
				 				<td> <a href="delete-todo?id=${todo.id }" class="btn btn-danger">DELETE </a></td>
				 				<td> <a href="update-todo?id=${todo.id }" class="btn btn-warning">EDIT</a></td>
				 		</tr>
				 </c:forEach>
			 </tbody>
		 </table>
		 <a class="btn btn-success" href="add-todo">ADD Todo</a>
		 
	</div>
		 <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		 <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>

</html>