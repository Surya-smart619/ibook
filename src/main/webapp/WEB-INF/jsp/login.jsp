<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html lang="en">
    <head>
        <style type="text/css">
            <%@ include file="/css/loginstyle.css" %>
        </style>   
    </head>
    <body class="background">
    <center>
    <h1 class="glow">Online Shopping</h1>
    <c:if test="${param.auth eq 'failure'}">
          <div class="error">
              <font color="red">
              <c:out value="Username or password that you entered is invalid." />
              </font>
          </div>
    </c:if>
    <button class="open-button" onclick="openForm()">Lets Shop!</button>
    <div class="form-popup" id="myForm">
        <form:form action="j_spring_security_check" method="POST" class="form-container">
            <h1>Login</h1>
            <label for="userName"><b>User Name</b></label>
            <input type="text" placeholder="User Name" name="j_username" required>
            <label for="password"><b>Password</b></label>
            <input type="password" placeholder="User Password" name="j_password" required>
            <button type="submit" class="btn">Login</button>
            <button type="button" class="btn cancel" onclick="closeForm()">Cancel</button>
        </form:form>
    </div>
    </center>
    <script>
        function openForm() {
            document.getElementById("myForm").style.display = "block";
        }
        function closeForm() {
            document.getElementById("myForm").style.display = "none";
        }
    </script>
    </body>
</html>
