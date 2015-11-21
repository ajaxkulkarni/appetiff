<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>TiffEat</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
    <body>
    
    <%@include file="header.jsp" %>
    <div class="container order_summary_details_div">
    	Balance : ${customer.balance}
    	<form action="addMoneyToWallet.htm" method="get">
        	<input type="submit" value="ADD TO WALLET" class="btn order_button"/>
        </form>
		<c:forEach items="${customer.scheduledOrder}" var="order">
        <h4 class="order_summary_heading">You have scheduled to receive ${order.mealType} tiffin from ${order.meal.vendor.name} Tiffins.</h4>
				<div class="order_details_card">
					<div class="row">
					<div class="col-md-6">
						<img alt="no_image" src="getMealImage.htm?mealId=${order.meal.id}" class="img-responsive tiffin_box_img1">
					</div>
					<c:choose>
                	<c:when test="${order.status == 'NA'}">
                		Today's order ${order.meal.title} for ${order.mealType} is not available.
                	</c:when>
                	<c:when test="${order.status == 'PAYABLE'}">
                		You won't receive today's ${order.mealType} meal.
                		<c:if test="${customer.balance < order.meal.price}">
                		You are low on cash.Please <a href = "addMoneyToWallet.htm">add some money</a> into your wallet to continue ${order.meal.title} meal.
                		</c:if>
                	</c:when>
                	<c:when test="${order.status == 'CANCELLED'}">
                		Today's order ${order.meal.title} for ${order.mealType} has been cancelled.
                	</c:when>
                	<c:when test="${order.status == 'DELIVERED'}">
                		Today's order ${order.meal.title} for ${order.mealType} has been delivered. Please rate us!
                	</c:when>
                	<c:when test="${order.content!=null}">
                    <div class="col-md-6">
                    	<h4 class="today">Today's menu of ${order.meal.title} Tiffin is:</h4>
									<table class="table table-bordered menu_list_table">
										<tr>
												<td>Sabji :</td>
												<td>${order.content.mainItem}</td>
											</tr>
											<tr>
												<td>Chapati/Roti :</td>
												<td>${order.content.subItem1}</td>
											</tr>
											<tr>
												<td>Rice/Dal :</td>
												<td>${order.content.subItem2}</td>
											</tr>
											<tr>
												<td>Salad :</td>
												<td>${order.content.subItem3}</td>
											</tr>
											<tr>
												<td>Extra :</td>
												<td>${order.content.subItem4}</td>
											</tr>
									</table>
								</div>
								<div class="col-md-6">
									<c:if test="${result != null }">
									<div class="alert alert-danger">
										<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
										<!-- <strong>Danger!</strong> -->${result}
									</div>
		  							</c:if>
									<h3 class="order_details_title">Your meal is ${order.meal.status}</h3>
									<c:choose>
							<c:when test="${order.meal.status == 'PREPARE'}">
								<form action="cancelOrder" method="post" commandName="customerOrder" onsubmit="return confirmCancel()">
									<input type="hidden" name="id" value="${order.id}"/> 
									<input type="submit" value="CANCEL THIS MEAL" class="btn order_button">
								</form>
								<br/>
								<form action="changeMeal" method="post">
									<input type="hidden" name="id" value="${order.id}"/> 
									<input type="hidden" name="mealType" value="${order.mealType}"/>
									<input type="hidden" name="meal.id" value="${order.meal.id}"/>
									<input type="hidden" name="mealFormat" value="${order.mealFormat}"/>
									<input type="hidden" name="area" value="${order.area}"/>
									<input type="submit" value="CHANGE THIS MEAL" class="btn order_button">
								</form>
							</c:when>
							<c:otherwise>
								<h4 class="header_sub_title">You can't change this meal now.</h4>
							</c:otherwise>
							</c:choose>
							</div>
							</c:when>
							<c:otherwise>
                    			<h4 class="today">Menu of ${order.meal.title} for ${order.mealType} is yet to be updated..</h4>
                    		</c:otherwise>
						</c:choose>
					</div>
					<div class="order_bottom_div">
                <p class="order_bottom_label">Scheduled from:<span> <fmt:formatDate pattern="yyyy-MM-dd" value="${order.date}" /></span></p>
                <p class="order_bottom_label">Tiffins remaining:${customer.noOfTiffinsRemaining }<span></span></p>
             
               <!--  <button class="btn edit_order_button">Edit</button>
                <button class="btn cancel_button">Cancel</button> -->
            </div>
				</div>
		</c:forEach>
         <c:if test="${fn:length(customer.scheduledOrder) == 1 &&  customer.scheduledOrder[0].mealType == 'LUNCH'}">
         	<form action="addScheduledOrder" method="post">
            	<input type="hidden" name="mealType" value="${customer.scheduledOrder[0].mealType}"/>
            	<input type="hidden" name="area" value="${customer.scheduledOrder[0].area}">
            	<input type="submit" value="ADD DINNER" class="btn order_button"/>
            </form>
         </c:if>
         <c:if test="${fn:length(customer.scheduledOrder) == 1 &&  customer.scheduledOrder[0].mealType == 'DINNER'}">
            <form action="addScheduledOrder" method="post">
            	<input type="hidden" name="mealType" value="${customer.scheduledOrder[0].mealType}"/>
            	<input type="hidden" name="area" value="${customer.scheduledOrder[0].area}">
            	<input type="submit" value="ADD LUNCH" class="btn order_button"/>
            </form>
         </c:if>
	</div>
        
        <script>
	function confirmCancel() {
    	var r = confirm("Are you sure you want to cancel this meal?");
    	return r;
	}
	</script>
        
        <%@include file="footer.jsp" %>
        
    </body>
</html>