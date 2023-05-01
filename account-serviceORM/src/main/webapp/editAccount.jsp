<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

 <header style="background-color: yellow;height: 32px;">
 </header>
 
  <div class="container">
	<br/>  	<br/>
  	<img src="https://s3.amazonaws.com/uww.assets/site/out_of_school_time/partners/partners/corporate/bank-of-america.png" style="height: 200px;">
  	<h1>Update Your Data in Database!</h1>
  	  <hr/>
  		<div style="width: 50%">
  		
  	<form action="updateAccount" method="post">
  			
  		     <input type="hidden" name="accountId"  class="form-control" value ="${accountDTO.accountId}" readonly="readonly">
  		     <label>Name :</label> 
  		     <input type="text" name="name"  class="form-control" value ="${accountDTO.name}" >
  		     
  		      <label>Type :</label> 
  		     <select  name="type"  class="form-control">
  		           <option>Saving Account</option>
  		           <option>Checking Account</option>
  		           <option>Credit Account</option>
  		     </select>
  		      <label>Email :</label> 
  		     <input type="email" name="email"  class="form-control" value ="${accountDTO.email}">
  		      <label>Description :</label> 
  		     <input type="text" name="description"  class="form-control"value ="${accountDTO.description}">
  		     
  		      <label>Balance :</label> 
  		     <input type="number" name="balance"  class="form-control"value ="${accountDTO.balance}">
  		     <br/>
  		     <button type="submit"  class="btn btn-primary">Update Account</button>
  		     <button type="reset" class="btn btn-primary"> Clear Form</button>
  		     <!-- <a href = "showAccounts"><button type ="button" class = "btn btn-danger" >Show Data from Database</button></a> -->
  		     </form>
  		</div> 
  </div>
 
</body>
</html>