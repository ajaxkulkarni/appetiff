<%@page import="com.rns.tiffeat.web.bo.domain.MealFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML>
<html>
<head>
  <title>TiffEat</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<%@include file="header.jsp" %>

<div class="container">
          
        <div class="main">
                <div class="row">
                    <div class="col-md-5 quick">
                         <%-- <a href="checkRegistration.htm?mealId=${customerOrder.meal.id}&pinCode=${customerOrder.area}&format=<%=MealFormat.QUICK %>" class="qorder"></a>
                          --%><a href="checkRegistration.htm?format=<%=MealFormat.QUICK %>" class="qorder"></a>
                          <p>Click for Quick Order</p>
                    </div> 
                    <div class="col-md-5 schedule">
                         <%-- <a href="checkRegistration.htm?mealId=${customerOrder.meal.id}&pinCode=${customerOrder.area}&format=<%=MealFormat.SCHEDULED %>" class="sorder"></a>
                          --%><a href="checkRegistration.htm?format=<%=MealFormat.SCHEDULED %>" class="sorder"></a>
                          <p>Click for Schedule Order</p>
                    </div> 
                </div>
        </div>
</div>

<%@include file="footer.jsp" %>

</body>   
</html>