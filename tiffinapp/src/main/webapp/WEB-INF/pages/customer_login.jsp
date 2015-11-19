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
    </head>
    <body>
    
    <%@include file="header.jsp" %>
    
    <div class="container-fluid">
        <div class="row">
                <div class="col-md-8 col-md-offset-2 login_box">
                    <h4 class="login_form_title">Login Form</h4>
                    <div class="col-md-6 login_form_card">
                        <form role="form" action="customerLogin" method="post">
                            <label for="username">Username</label>
                            <input type="email" class="form-control" id="username" name="email">
                              <label for="password">Password</label>
                            <input type="password" class="form-control" id="password" name="password">
                               <div class="checkbox">
                                  <label>
                                      <input type="checkbox" name="remember" id="remember"> Remember login
                                  </label>
                                  <p class="">(if this is a private computer)</p>
                                  <c:if test="${result != null }">
									<div class="alert alert-danger">
									<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
									<!-- <strong>Danger!</strong> -->${result}
									</div>
								   </c:if>
                              <button type="submit" class="btn btn-success btn-block">Login</button>
                              <a href="" class="btn btn-default btn-block">Forgot Password</a>
                              </div>
					</form>
                    </div>   
                    <div class="col-md-6 register_card">
                    <p>Register now for <span class="text-success">FREE</span></p>
                      <ul class="list-unstyled reg_list">
                          <li><span class="fa fa-check text-success"></span> See all your orders</li>
                          <li><span class="fa fa-check text-success"></span> Fast re-order</li>
                          <li><span class="fa fa-check text-success"></span> Save your favorites</li>
                          <li><span class="fa fa-check text-success"></span> Fast checkout</li>
                      </ul>
                      <p><a href="registerCustomer.htm" class="btn btn-info btn-block">Register Now</a></p>
                    </div>  
                </div>
        </div>
</div>
    
    
    <%-- <form action="" method="post" name="">
     <div class="container">
        <div class="main wow bounceInUp">
            <div class="col-md-6 image">
                <img src="img/tiffin-box-250x250.jpg">
            </div>
            
            <div class="col-md-6 login">
                <h4>Sign in</h4>
                <form action="customerLogin" method="post">
                <div class="sub">
                   <input type="email" name="email"  maxlength="30" placeholder="User Name" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" class="form-control" required/>
                </div>
                <div class="sub">
                    <input type="text" name="password" placeholder="Password" class="form-control" required="required" title="Password has 8-20 characters, having at least one uppercase char, at least on lowercase char, at least one number, and one special char">
                </div>
                <div class="submitdiv">
                    <input type="submit" name="" class="form-control subbutton">
                </div>
                <div class="text">
                    <p>Click Here For<a href="signup.html">SignUp</a></p>
                </div>
                </form>
                 <div class="sub">
<!--                    <img src="img/images.jpg" class="google_sign_in" alt="Login With Google" title="Login With gmail">-->
                     <span class="gmail_login"><img src="img/images.jpg" class="google_sign_in" alt="Login With Google" title="Login With gmail"><a href="">Login With Google</a></span>
                </div>
            </div>
        </div>
    </div> --%>
        <%@include file="footer.jsp" %>
        
    </body>
</html>