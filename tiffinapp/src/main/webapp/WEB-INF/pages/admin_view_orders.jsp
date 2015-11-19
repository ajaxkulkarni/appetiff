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
<link href="<c:url value = "/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/tablesort.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<!-- Custom CSS -->
<link href="<c:url value = "/resources/css/freelancer.css"/>"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">
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

<div class="hscroll">
<title>Today's orders</title>
</head>
<body id="page-top" class="index">

	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		 <div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<div class="col-lg-12">
				<a class="navbar-brand" href="#page-top">tiffEat</a>
			</div>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->

	</div>
	<!-- /.container-fluid --> </nav>


	<br />
	<br />
	<br />
	<br />
	<br />
	<div class="row">

		<div class="col-md-4">
			<form action="orders.htm">
			<div class="wrapper1">
<div class="col-lg-12">
<a href = "admin.htm?vendorEmail=${vendor.email}">Back</a>

</div>
</div>
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
						
						<td class="table-sort" style="padding: 0 18px"><strong>ID</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Name</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Email</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Phone</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Area</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Address</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Order
								date</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Order
								format</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Order
								price</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Meal
								title</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Meal
								code</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Vendor</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Order
								time</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Payment
								Type</strong></td>

						<td class="table-sort" style="padding: 0 35px"><strong>Order
								status</td>

					</tr>
					
					<c:forEach items="${orders}" var="order">
						<c:if test="${status == null || status == order.status}">
					
							<tr>
							
								<div class="table-sort">
								<td style="padding: 0 18px">${order.id}</td>

								<td style="padding: 0 35px">${order.customer.name}</td>

								<td style="padding: 0 35px">${order.customer.email}</td>

								<td style="padding: 0 35px">${order.customer.phone}</td>

								<td style="padding: 0 35px">${order.area}</td>

								<td style="padding: 0 35px">${order.address}</td>

								<td style="padding: 0 35px"><fmt:formatDate
										value="${order.date}" pattern="yyyy-MM-dd" /></td>

								<td style="padding: 0 35px">${order.mealFormat}</td>

								<td style="padding: 0 35px">${order.meal.price}</td>

								<td style="padding: 0 35px">${order.meal.title}</td>

								<td style="padding: 0 35px">${order.meal.id}</td>

								<td style="padding: 0 35px">${order.meal.vendor.name}</td>

								<td style="padding: 0 35px">${order.mealType}</td>

								<td style="padding: 0 35px">${order.paymentType}</td>

								<td style="padding: 0 35px">${order.status}</td>
								</div>
								<c:if
									test="${order.meal.status == 'DISPATCH' && order.status == 'ORDERED'}">
									<td><input type="checkbox" name="orders"
										value="${order.id}" />Deliver</td>
								</c:if>
								<c:if test="${order.status == 'ORDERED'}">
									<%-- <form action="cancelCustomerOrder" method="post"> --%>
									<%-- <input type="hidden" name="id" value="${order.id}"/> --%>
									<td><input type="button" value="Cancel"
										onclick="cancel(${order.id})"></td>
									<%-- </form> --%>
								</c:if>
							</tr>
						</c:if>
					</c:forEach>
					</div>
				</table>
				<div class="row">
				<div class="deliver_report">
				<input type="submit" value="Deliver Tiffins"/>
			
		</form>
			
			<form action="downloadExcel" method="post">
				<input type="hidden" name="status" value="${status}" /> <input
					type="submit" value="Generate report" />
				</form>
		</div>
		</div>
		</div>
		${result}
	</div>



<script type="text/javascript"
		src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script src="http://yandex.st/highlightjs/7.3/highlight.min.js"></script>
	<script type="text/javascript"
		src="<c:url value = "/resources/js/tablesort.js"/>"></script>
	<script type="text/javascript">
            // For Demo Purposes
            $(function () {
                $('table.table-sort').tablesort();
                hljs.initHighlightingOnLoad(); // Syntax Hilighting
            });
        </script>
       
</body>
</html>