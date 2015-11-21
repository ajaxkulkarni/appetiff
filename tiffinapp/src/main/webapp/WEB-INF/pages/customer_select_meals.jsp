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

      <div class="container order_details_div">
        <h4 class="order_details_heading">${vendor.name} offers:</h4>
        <c:forEach items="${vendor.meals}" var="meal">
        <div class="order_details_card">
            <div class="row">
            <form action="selectMealFormat" method="post">
            	<input type="hidden" name="title" value="${meal.title}"/>
                <input type="hidden" name="id" value="${meal.id}"/>
               	<input type="hidden" name="description" value="${meal.description}"/>
                <input type="hidden" name="price" value="${meal.price}"/>
                <div class="col-md-4">
                    <img src="getMealImage.htm?mealId=${meal.id}" alt="no-image" class="img-responsive order_card_img" />
                </div>
                <div class="col-md-6">
                    <h3 class="order_details_title">${meal.title}</h3>
                    <h4 class="order_details_sub_title">${meal.description}</h4>
                    <h4 class="order_details_sub_title">Rs. ${meal.price}</h4>
                    <label class="label_served">served : 1000+</label>
                    <div class="submit_order">
                        <button type="submit" class="btn order_button">ORDER</button>
                    </div>
                </div>
            </form>
            </div>
        </div>
        </c:forEach>
    </div>
      
      <%-- <div class="container1">
          <h2 class="header_title">${vendor.email}:</h2>
          <c:forEach items="${vendor.meals}" var="meal">
            <div class="row list1">
                <div class="col-md-4">
                    <img src="img/img.ico" alt="no-image" class="order_img"/>
                </div>
                <div class="col-md-7">
                    <h3 class="header_sub_title">${meal.title}</h3>
                    <h4 class="header_sub_heading">${meal.description}</h4>
                    <h4 class="header_sub_heading">${meal.price}</h4>
                    <label class="label_served">served : </label>
                    <div class="submit_order">
                    <form action="selectMealFormat" method="post">
                    	<input type="hidden" name="title" value="${meal.title}"/>
                    	<input type="hidden" name="id" value="${meal.id}"/>
                    	<input type="hidden" name="description" value="${meal.description}"/>
                    	<input type="hidden" name="price" value="${meal.price}"/>
                    	<input type="hidden" name="pinCode" value="${pinCode}"/>
                      <button class="order1" type="submit">
                        ORDER
                      </button>
                      </form>
                    </div>
                </div>
             </div>
           </c:forEach>
      </div> --%>
      
  <%@include file="footer.jsp" %>
  
</body>
</html>