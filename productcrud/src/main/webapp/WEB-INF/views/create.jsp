<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>create page</title>
</head>
<body>

<h1>Create Page</h1>
<form action="success" method='POST'>
<div>
<label>Name</label>
<input type="text" placeholder="Enter name" name="name"/>
</div>
<div>
<label>Description</label>
<input type="text" placeholder="Enter description" name="description"/>
</div>
<div>
<label>Price</label>
<input type="text" placeholder="Enter price" name="price"/>
</div>
<div>
<button type="submit">create</button>
</div>
</form>
</body>
</html>