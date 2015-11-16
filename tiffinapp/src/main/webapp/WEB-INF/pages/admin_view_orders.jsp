<%@page import="com.rns.tiffeat.web.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <!-- Custom CSS -->
    
    <% if(Constants.ASSETS_ROOT == "/resources" ) { %>
 	<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/freelancer.css"/>" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css"/>">
	 <link rel="stylesheet" type="text/css" href="css/tablesort.css">
	<% }else{ %>
	<link href="<c:url value="../../resources/assets/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="../../resources/assets/css/freelancer.css"/>" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="../../resources/assets/css/styles.css"/>">
	<%} %>

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
	<script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript">
    function cancel(orderId) {
        $.ajax({
        	type : "POST",
            url : 'cancelCustomerOrder',
            data: "order=" + orderId,
            success : function(data) {
                //$('#result').html(data);
                alert("Here:" +data);
            },
            error: function(e){
            	alert('Error in canceling!' + e);
        	}
        });
    }
</script>


<title>Today's orders</title>
</head>
<body id="page-top" class="index">

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
	<br />
	<br />
	<br />
 <div class="row">

		<div class="col-md-4">
			<form action="orders.htm">
			<select name="status" class="form-control option_dropdown">
				<c:forEach items="${orderStatus}" var="status">
					<option value="${status}">${status}</option>
				</c:forEach>
			</select>
			<button type="submit" value="Filter">Filter</button>
			</form>
		</div>

		<div class="col-lg-12">
		<form action="delilverTiffins" method="post">
		<table class="table-sort table-sort-search" border="1">
			<tr>
				<td class="table-sort">ID</td>
				<td class="table-sort">Name</td>
				<td class="table-sort">Email</td>
				<td class="table-sort">Phone</td>
				<td class="table-sort">Area</td>
				<td class="table-sort">Address</td>
				<td class="table-sort">Order date</td>
				<td class="table-sort">Order format</td>
				<td class="table-sort">Order price</td>
				<td class="table-sort">Meal title</td>
				<td class="table-sort">Meal code</td>
				<td class="table-sort">Vendor</td>
				<td class="table-sort">Order time</td>
				<td class="table-sort">Payment Type</td>
				<td class="table-sort">Order status</td>
			</tr>
			<c:forEach items="${orders}" var="order">
			<c:if test="${status == null || status == order.status}">
			<tr>
				<td>${order.id}</td>
				<td>${order.customer.name}</td>
				<td>${order.customer.email}</td>
				<td>${order.customer.phone}</td>
				<td>${order.area}</td>
				<td>${order.address}</td>
				<td><fmt:formatDate value="${order.date}" pattern="yyyy-MM-dd"/></td>
				<td>${order.mealFormat}</td>
				<td>${order.meal.price}</td>
				<td>${order.meal.title}</td>
				<td>${order.meal.id}</td>
				<td>${order.meal.vendor.name}</td>
				<td>${order.mealType}</td>
				<td>${order.paymentType}</td>
				<td>${order.status}</td>
				<c:if test="${order.meal.status == 'DISPATCH' && order.status == 'ORDERED'}">
				<td><input type="checkbox" name="orders" value="${order.id}"/>Deliver</td>
				</c:if>
				<c:if test="${order.status == 'ORDERED'}">
				<%-- <form action="cancelCustomerOrder" method="post"> --%>
					<%-- <input type="hidden" name="id" value="${order.id}"/> --%>
					<td><input type = "button" value="Cancel" onclick="cancel(${order.id})"></td>
				<%-- </form> --%>
				</c:if>
			</tr>
			</c:if>
			</c:forEach>
		</table>
		<input type="submit" value="Deliver Tiffins"/>
	</form>
	<form action="downloadExcel" method="post">
		<input type="hidden" name="status" value="${status}"/>
		<input type="submit" value="Generate report"/>
	</form>
	</div>
	${result}
	</div>
	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
	<script src="http://yandex.st/highlightjs/7.3/highlight.min.js"></script> 
	
	<% if(Constants.ASSETS_ROOT == "/resources" ) { %>
	<script type="text/javascript" src="<c:url value = "/resources/js/tablesort.js"/>"></script> 
	<%}else { %>
	<script type="text/javascript" src="<c:url value = "../../resources/assets/js/tablesort.js"/>"></script>
	<%} %>
	
	<script type="text/javascript">
            // For Demo Purposes
            $(function () {
                $('table.table-sort').tablesort();
                hljs.initHighlightingOnLoad(); // Syntax Hilighting
            });
        </script>
</body>
</html>