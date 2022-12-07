 <%@page import="library.connection.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="library.admin.bean.Book"%>
<%@page import="java.util.List"%>
<%@page import=" library.admin.dao.BookDao"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="css/style.css" rel="stylesheet" type="text/css">
<style>
body{
	background-image: url('../images/lib.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}
</style>


</head>

<body>
  <script>
  function myfunction(id)
  {
	  if(confirm("are you sure u want to delete!"))
		  {
		  <%
		  System.out.print("myfun");
		  %>
		   document.location.href="DeletBookServlet?id="+id;
		   document.location.href="viewbook.jsp";
		  }
  }
  </script>
	<nav class="navbar navbar-light bg-dark justify-content-between">
		<a href="addnewbook.jsp" type="button" class="btn btn-outline-success">Add
			New Book</a>
			<a href="issuebook.jsp" type="button" class="btn btn-outline-success">Issue Book</a>

		<form class="form-inline" action="SearchBookServlet" method="get">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" name="q" aria-label="Search">
			<button class="btn btn-outline-success my-4 my-sm-2" type="submit">Search</button>
		</form>
		 <a href="adminfunction.jsp" class="btn btn-primary" style="text-align:center">Back</a>
	</nav>

	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<th scope="col">BookId</th>
				<th scope="col">BookName</th>
				<th scope="col">AuthorName</th>
				<th scope="col">Price</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>


				<!-- <th scope="col">IssueBook</th> -->
			</tr>
			<tr>
		</thead>

		<%
			BookDao bd = new BookDao();
			List<Book> list = bd.getAll();
			for (Book b : list) {
		%>
		<tr>
			<td><%=b.getId()%></td>
			<td><%=b.getName()%></td>
			<td><%=b.getAuthor()%></td>
			<td><%=b.getPrice()%></td>
			<td><a href="updatebookdetails.jsp">edit</a></td>
			
			<%-- <a class="btn btn-primary" href="DeletBookServlet?id=<%=b.getId()%>">Delete</a>
			 --%>
	<%-- <form action="DeletBookServlet" method="get"> <td><a href=" " onclick="myfunction(<%= b.getId()%>)">delete</a></td> --%>
	<form action="DeletBookServlet" method="get"> <td><a href="DeletBookServlet?id=<%=b.getId()%>">delete</a></td> 
	
	</form>		



		</tr>

		<%
			}
		%>
	


	</table>













	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<!-- <script > $(document).ready(function(){
			alert("document loaded")
		})</script> -->
	<script src="js/js.js" type="text/javascript">
		</body>
		</html>