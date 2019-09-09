<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html lang="en">
    <head>
        <style type="text/css">
            <%@ include file="/css/shopstyle.css" %>
        </style>
        <style type="text/css">
            <%@ include file="/css/loginstyle.css" %>
        </style>
    </head>
    <body class="background"> 
    <c:set var = "role" value = "${roles}"/>
        <ul>         
	        <li>  
                <a href="#">Home</a>
            </li>
            <li style="float:right">
                <a href="<%= request.getContextPath() %>/logout">Logout</a>
            </li>         
        </ul>     
        <h1 class="glow">Home Page</h1> 
        <sec:authorize ifAnyGranted="ROLE_USER">
        <div class="container">
            <a href="<%= request.getContextPath() %>/displayRole">
            <img src="resources/image/roleimage.png" alt="Avatar" class="image" style="width:100">   
            </a>          
            <div class="middle">
            <div class="text">Role</div>
            </div>
        </div>
        <div class="container">
            <a href="<%= request.getContextPath() %>/displayUser">
            <img src="resources/image/userimage.png" alt="Avatar" class="image" style="width:100">   
            </a>          
            <div class="middle">
            <div class="text">User</div>
            </div>
        </div>
        </sec:authorize>
        <div class="container">
            <a href="<%= request.getContextPath() %>/displayProduct">
            <img src="resources/image/productimage.png" alt="Avatar" class="image" style="width:100">   
            </a>          
            <div class="middle">
            <div class="text">Product</div>
            </div>
        </div>
        <div class="container">
            <a href="<%= request.getContextPath() %>/displayCart">
            <img src="resources/image/cartimage.png" alt="Avatar" class="image" style="width:100">   
            </a>          
            <div class="middle">
            <div class="text">Cart</div>
            </div>
        </div>
        <div class="container">
            <a href="<%= request.getContextPath() %>/displayOrder">
            <img src="resources/image/orderimage.png" alt="Avatar" class="image" style="width:100">   
            </a>          
            <div class="middle">
            <div class="text">Order</div>
            </div>
        </div>
    </body>
</html>




















