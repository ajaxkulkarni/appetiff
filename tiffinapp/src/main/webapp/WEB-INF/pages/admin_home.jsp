<%@page import="com.rns.tiffeat.web.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin | Home</title>
</head>
<body id="page-top" class="index">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
				<div class="col-lg-12">
                <a class="navbar-brand" href="#page-top">tiffEat</a>
				</div>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                   
                    <div class="intro-text">
                        <span class="name">Vendors</span>
                        
                    </div>
                </div>
            </div>
        </div>
    </header>
	<table class="table table-hover">
							
		<tr>
			<td><strong>ID</strong></td>
			<td><strong>Name</strong></td>
		    <td><strong>Address</strong></td>
			<td><strong>Phone_No</strong></td>
			<td><strong>Rating</strong></td>
		</tr>
		
		<c:forEach items="${vendors}" var="vendor">
			<tr>	
			<form action="vendorDetails" method="post">
			<td>${vendor.id}</td>
			<td>${vendor.name}</td>
    		<td>${vendor.address}</td>
			<td>${vendor.phone}</td>
			<td>${vendor.rating}</td>
			<input type="hidden" name="email" value="${vendor.email}"/>
			<td><!-- <a href="meals.html">View</a> --><input type="submit" value="View"/></td>
			</form>
    		</tr>
    	</c:forEach>
</table>

<div class="row">
<div class="wrapper">
<div class="col-lg-12">

    <a href="addVendor.htm"><button class="button">Add Vendor</button></a>
</div>
</div>
</div>

<br />
<br />
<br />
<a href = "allOrders.htm">View Orders</a>
<div class="row">
                <div class="col-md-4">
	<div class="demo-card">
    <div class="card">
        <div class="card-header">
            
        </div>
        
        <div class="card-block">
            <!-- <h4 class="card-title">
			Lunch</h4> -->
			
			<div class="mealtype">
			<h4>Quick Orders:${admin.quickOrderCount}</h4><br />
			<br />
			<h4>Schedule orders:${admin.scheduledOrderCount}</h4>
			</div>
            
            
			 </div>
			</div>
		
		</div>
</div>
<div class="col-md-4">
	<div class="demo-card">
    <div class="card">
        
        
        <div class="card-block">
            <!-- <h4 class="card-title">
			Dinner</h4> -->
			
			<div class="mealtype">
			<h4>Lunch Orders: ${fn:length(admin.lunchOrders)}</h4><br />
			<br />
			<h4>Dinner Orders:${fn:length(admin.dinnerOrders)}</h4>
			</div>
             </div>
			</div>
		</div>  
</div>
 					 
                                 
    <br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<div class="row">
	<div class="rns">
                    <div class="col-lg-12">
                      Design By <a href="http://www.resoneuronance.com/"><strong>Team Resoneuronance</strong></a>
                    </div>
                </div>
	</div>
	
	<footer>
	<div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                      Copyright &copy; 2015 tiffEat.com
                    </div>
                </div>
            </div>
        </div>
    </footer>

</html>