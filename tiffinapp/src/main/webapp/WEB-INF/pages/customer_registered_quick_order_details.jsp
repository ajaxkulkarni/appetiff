<%@page import="com.rns.tiffeat.web.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>TiffEat Payment Details</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
  <script type="text/javascript">
    
    function showModal() {
    	var radios = document.getElementsByName('mealType');
		var mealType;
		for (var i = 0, length = radios.length; i < length; i++) {
		    if (radios[i].checked) {
		        mealType = radios[i].value;
		        break;
		    }
		}
		$("#modalMealType").text("Meal Type :" +mealType);
		$("#payment_Modal").modal('show');
		return false;
    }
    
   </script>
  <%--  <script type="text/javascript" src="<c:url value="/resources/js/backfix.min.js"/>"></script> --%>
	<!-- <script type="text/javascript">
	bajb_backdetect.OnBack = function()
	{
		alert('You clicked it!');
		window.location.href = "http://www.stackoverflow.com"
	}
	
	/* function gotourl() {
		window.location.href = "http://www.stackoverflow.com";
	} */
	
	</script> -->
</head>
<body >

<%@include file="header.jsp" %>

	<div class="container payment_details_div">
        <h4 class="payment_details_heading">Just one step away!</h4>
        <div class="payment_details_card">
        <c:if test="${result != 'OK' && result!=null }">
			<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<!-- <strong>Danger!</strong> -->${result}
			</div>
		  </c:if>
		  <fmt:formatDate pattern="yyyy-MM-dd" value="${customerOrder.date}" var="orderDate" />
          Order For : ${orderDate} <br/>
          Meal : ${customerOrder.meal.title}
            <div class="row">
                <div class="col-md-6">
                    <form action="quickOrder" id = "quickOrderForm" method="post" onsubmit="return showModal()">
                    	<input type="hidden" name="customer.id" value="${customerOrder.customer.id}"/>
                    	<input type="hidden" name="meal.price" value="${customerOrder.meal.price}"/>
                    	<input type="hidden" name="meal.price" value="${customerOrder.meal.title}"/>
                        <input class="form-control" type="text" readonly="readonly"  id="name1" name="customer.name" value="${customerOrder.customer.name}" placeholder="What's your name?" required="required" maxlength="50" />
                        <input class="form-control" type="text" maxlength="15" pattern="^(\+?\d{1,4}[\s-])?(?!0+\s+,?$)\d{10}\s*,?$" id="mobile_no" name="customer.phone" value="${customerOrder.customer.phone}" placeholder="MOBILE NUMBER" required="required"/>
                      	<input class="form-control" type="text" readonly="readonly" id="email_id" name="customer.email" placeholder="EMAIL ID" value="${customerOrder.customer.email}"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" maxlength="30" required="required"/>
                  		Area : ${customerOrder.area} <br/>
                  		Price : ${customerOrder.meal.price}
                    	<textarea class="form-control" type="text" rows= "3" id="address" name="address"  text="${customerOrder.customer.previousOrders[0].address}" placeholder="ADDRESS" maxlength=150 minlength=10 required>${customerOrder.address}</textarea>
                      	<c:forEach var="type" items="${mealType}">
 					 		<label class="radio option_radio">
                      		<input type="radio" id="option-1" class="" name="mealType" value="${type}" required="required"/>
                      		<span class="">${type}</span>
                    		</label>
			      		</c:forEach>
                  		<input type="hidden" name="meal.id" value="${customerOrder.meal.id}"/>
                  		<input type="hidden" name="meal.id" value="${customerOrder.meal.title}"/>
                  		<input type="hidden" name="area" value="${customerOrder.area}"/>
                        <label class="checkbox chbox1">
                            <input type="checkbox" value="agree" required>I agree to <a href = "terms.htm" class="universal_link">terms and conditions</a>
                        </label>
                        <button class="btn order_button" type="submit">Order</button>
                    </form>
                </div>
                <div class="col-md-6">
                    <img src="<c:url value="/resources/img/Payment-Methods-Icons.jpg"/>" class="img-responsive payment_method_icon" alt="payment_method_icon">
                	
                </div>
            </div>

        </div>

    </div>
    
    <div class="modal fade" id="payment_Modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel"> Order Details</h4>
              </div>
              <div class="modal-body">
                  <div class="row">
                      <div class="col-md-6">
                          <h6 class="order_label1">Meal : ${customerOrder.meal.title}</h6>
                          <h6 class="order_label1">Order For: ${orderDate}</h6>
                          <h6 class="order_label1"><div id= "modalMealType"></div></h6>
                          <h6 class="order_label1">Area: ${customerOrder.area}</h6>
                          <h6 class="order_label1">Price:${customerOrder.meal.price}</h6>
                      </div>
                      <div class="col-md-6">
                  		<img src="getMealImage.htm?mealId=${customerOrder.meal.id}" alt="no_image" class="order_img1 img-responsive">
                      </div>
                 
            
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal"> Cancel </button>
                  <button type="button" class="btn btn-primary" onclick="proceed()">Proceed</button>
              </div>
            </div>
          </div>
        </div>
        </div>

    <!--        End of Order Details div-->
    <script type="text/javascript">
    
    function proceed() {
    	
    	document.getElementById("quickOrderForm").submit();
    }
    
	</script>
	        
  <%@include file="footer.jsp" %>
      
  </body>
</html>