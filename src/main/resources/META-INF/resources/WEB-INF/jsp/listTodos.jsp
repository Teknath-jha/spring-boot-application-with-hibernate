<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>

	<head>
		<title>List todos</title>
	</head>
	
	<body>
		 <div>Welcome ${name}....</div>
		 <hr>
		 <h1>Your Todos  </h1>
		 <table>
		 	<thead>
		 		<tr>
		 			<th>id</th>
			 		<th>description</th>
			 		<th>Target Date</th>
			 		<th>Is Completed?</th>
		 		</tr>
		 	</thead>
			 <tbody>
				 <c:forEach items="${todos}" var="todo">
				 		<tr>
				 				<td>${todo.id }</td>
				 				<td>${todo.description }</td>
				 				<td>${todo.targetDate }</td>
				 				<td>${todo.done }</td>
				 		</tr>
				 </c:forEach>
			 </tbody>
		 </table>
	</body>

</html>