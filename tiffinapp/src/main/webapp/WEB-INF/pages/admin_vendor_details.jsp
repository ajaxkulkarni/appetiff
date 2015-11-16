<%@page import="com.rns.tiffeat.web.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<% if(Constants.ASSETS_ROOT == "/resources" ) { %>
 	<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="<c:url value="/resources/css/freelancer.css"/>" rel="stylesheet">
	<% }else{ %>
	<link href="<c:url value="../../resources/assets/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="../../resources/assets/css/freelancer.css"/>" rel="stylesheet">
	<%} %>
    
    
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Vendor Details</title>
</head>
<body id="page-top" class="index">

	<nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
				<div class="col-lg-12">
                <a class="navbar-brand" href="admin.htm">tiffEat</a>
				</div>
				<div class="username">
				<a href="editVendor.htm?vendor=${vendor.email}">${vendor.name}</a>
				</div>
        </div>
    </nav>

		
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		
	<div class="row">
<div class="wrapper">
<div class="col-lg-6">

    <a href = "addNewMeal.htm?vendorEmail=${vendor.email}">Add Meal</a>
	<a href="vendorOrders.htm"></a><button class="button">Orders</a></button>
	</div>
</div>
</div>

<br />
<br />
<br />	
	 
	 <div class="row">
	 	<c:forEach items="${vendor.meals}" var="meal">
        <div class="col-md-4">
		<div class="demo-card">
    	<div class="card">
        <img class="card-img-top" src="getMealImage.htm?mealId=${meal.id}">
        <div class="card-block">
            <h4 class="card-title">
			${meal.title}
			<a href="welcome.html">
			<img class="img-top" src="edit45.png"></a></h4>
			
			<div class="price">
			<h4>${meal.price}</h4>
			</div>
            <strong>${meal.content.mealType}</strong>
            <p class="card-text">${meal.description}</p>
            <div class="status">
			<strong>Status:${meal.status}</strong>
			 </div>
		</div>
		<br />
		<c:choose>
				<c:when test="${meal.status == 'DISPATCH' || meal.content == null}">
					<div class="card-block">
            			<a href="addDailyContent.htm?mealId=${meal.id}" class="btn btn-primary">Add Content</a>
        			</div>
				</c:when>
				<c:when test="${meal.status == 'PREPARE'}">
					<div class="card-block">
            			<a href="updateDailyContent.htm?contentId=${meal.content.id}" class="btn btn-primary">Edit Content</a>
						<a href="startCooking.htm?mealId=${meal.id}" class="btn btn-primary">Start Cooking</a>
        			</div>
				</c:when>
				<c:when test="${meal.status == 'COOKING'}">
					<div class="card-block">
            			<a href="startDispatch.htm?mealId=${meal.id}" class="btn btn-primary">Dispatch</a>
        			</div>
				</c:when>
				<c:otherwise>
					<div class="card-block">
            			<a href="addDailyContent.htm?mealId=${meal.id}" class="btn btn-primary">Add Content</a>
        			</div>
				</c:otherwise>
				</c:choose>
    	</div>
	</div>
	<a href="getMealOrders.htm?mealId=${meal.id}&type=${meal.content.mealType}">View Orders</a>
	<a href="editMeal.htm?mealId=${meal.id}">Edit Meal</a>
	</div>
	</c:forEach>
	</div>
	
</body>
</html>