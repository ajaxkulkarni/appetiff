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
                    	<a href="checkRegistration.htm?format=<%=MealFormat.QUICK %>">
                        	<img alt="" src="<c:url value = "${resources}/img/quick.svg"/>" class = "meal_format">
                         	<p class = "universal_link">Click for One time Order</p>
                         </a>
                         	One time order is the on demand delivery of the tiffin.
                         	Test the waters first, and then choose the vendor you like for daily dabba.
                    </div> 
                    <div class="col-md-5 quick">
                         <a href="checkRegistration.htm?format=<%=MealFormat.SCHEDULED %>">
                          	<img alt="" src="<c:url value = "${resources}/img/scheduled.svg"/>" class = "meal_format">
                          	<p class = "universal_link">Click to schedule a tiffin</p>
                         </a>
                         This way, you choose to receive this tiffin daily, for lunch or for dinner, or both.
                    </div> 
                </div>
        </div>
</div>
<%@include file="footer.jsp" %>
</body>   
</html>