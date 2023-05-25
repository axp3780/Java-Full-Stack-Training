<!DOCTYPE html>
<%@page import="com.cubic.SignupDTO"%>
<%@page import="com.cubic.DataStore"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  
  <style>
   	 table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

table, td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}



.btun {
  background-color: #e91025;
  border: none;
  color: white;
  padding: 12px 16px;
  font-size: 16px;
  cursor: pointer;
}

/* Darker background on mouse-over */
.btun:hover {
  background-color: #ab1826;
}

</style>
</head>
<body>


 
  <div class="container">
  	
  		<img style = height:200px src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGgf6Xeg8Kl3JmjYt14Si1c-EHUfzP6p2Zfw&usqp=CAU">
  	`<a href="signUp.html"><button type ="button" class = "btn btn-success">Sign Up with different data</button></a>
  	  <hr/>
  	  
  	 <h1 style="color:rgb(0, 0, 255);"> Data that has been stored: </h1> 
  	 
  	 
 
</div>

<table style ="width:100%" class  ="table table-bordered">
  <tr>
  	
  	
    <th>USERNAME</th>
    <th>PASSWORD</th>
    <th>EMAIL</th>
    <th>GENDER</th>
    <th>ACTION</th>
  </tr>
 	<tbody>
  <%
  List<SignupDTO> signupDTOs = DataStore.getSignupDTOs();

	  for (SignupDTO AccountDTO: signupDTOs){

  %>
   <tr>
    	<td><%=AccountDTO.getUsername()%></td>
  		<td><%=AccountDTO.getPassword()%></td>
  		<td><%=AccountDTO.getGender()%></td>
  		<td><%=AccountDTO.getEmail()%></td>
  		<td>
  		<a href = "deleteData?username=<%=AccountDTO.getUsername() %>">
  		 <button type ="button" class ="btun"><i class="fa fa-trash"></i></button>
  		 </a>
  		 </td>
  </tr>
   <%
  	 } 
	  %>
  </tbody>
</table>
</html>