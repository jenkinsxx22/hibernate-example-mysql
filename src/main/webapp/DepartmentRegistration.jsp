<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department Registration</title>
<%@include file="headerstyles.jsp" %>
</head>
<body>

<%@include file="headermenu.jsp" %>


<div class="container col-md-8 col-md-offset-3" style="overflow: auto">
  <h1>Department Registration Form</h1>
  
<form action="<%=request.getContextPath()%>/AddDepartment" method="post">

<div class="form-group">
<label>Name</label>
<input type="text" class="form-control" id="deptname" placeholder="Department Name" name="deptname"/>
</div>

<div class="form-group">
<label>Location</label>
<input type="text" class="form-control" id="deptloc" placeholder="Department Location" name="deptloc"/>
</div>

<div class="form-group">
<label>Status</label>
<input type="text" class="form-control" id="deptstatus" placeholder="Department Status" name="deptstatus"/>
</div>

<input type="submit" value="Save" class="btn btn-primary"/>
</form>

</div>
</body>
</html>