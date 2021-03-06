<%@page import="com.rns.tiffeat.web.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title></title>        
<link rel="stylesheet" href="css/stylesheet.css"> 
<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>    
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        
     <% if(Constants.ASSETS_ROOT == "/resources" ) { %> 
    <link href="<c:url value = "/resources/css/animate.css"/>" rel="stylesheet">  
    <link href="<c:url value = "/resources/css/signup.css"/>" rel="stylesheet">  
    <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>   
    <%}else { %>
     <link href="<c:url value = "../../resources/assets/css/animate.css"/>" rel="stylesheet">  
    <link href="<c:url value = "../../resources/assets/css/signup.css"/>" rel="stylesheet">  
    <script src="<c:url value="../../resources/assets/js/jquery.min.js"/>"></script>
    <%} %>   
      
    </head>
    <body class="drawer drawer-left">
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
    <br />
    <br />
    

        <form action="editVendor" method="post" enctype="multipart/form-data">
        <div class="container">
        <div class="wow bounceInUp">
            <div class="main">
                <div class="row sub">
                     <h4>Sign Up Form</h4>
                </div>
                <div class="row sub">
                    <div class="col-md-6">
                        <p>User Name: </p>
                    </div>
                    <div class="col-md-6">
                        <input type="text" name="name" value="${vendor.name}" class="form-control" required>
                    </div>
                </div>
                <div class="row sub">
                    <div class="col-md-6">
                        <p>Email: </p>
                    </div>
                    <div class="col-md-6">
                        <input type="text" name="email" value="${vendor.email}" class="form-control" required>
                    </div>
                </div>
                <div class="row sub">
                    <div class="col-md-6">
                        <p>Mobile no.: </p>
                    </div>
                    <div class="col-md-6">
                        <input type="text" name="phone" value="${vendor.phone}" class="form-control" required>
                    </div>
                </div>
                <div class="row sub">
                    <div class="col-md-6">
                        <p>Address: </p>
                    </div>
                    <div class="col-md-6">
                        <textarea class="form-control" name="address" cols="10" rows="5" maxlength="200" required>${vendor.address}</textarea>
                    </div>
                </div>
                <div class="row sub">
                    <div class="col-md-6">
                        <p>Image: </p>
                    </div>
                    <div class="col-md-6">
                    	<input type="file" name="image"/>
                    </div>
                </div>
                ${result}
                <div class="row sub">
                    <input type="submit" name="" class="submit_button" value="Sign Up!">
                </div>
            </div>
         </div>
            </div>
        </form>
        
	<script src="<c:url value="/resources/js/wow.min.js"/>"></script>     
    <script src="<c:url value="/resources/js/custom.js"/>"></script>   
    </body>
</html>