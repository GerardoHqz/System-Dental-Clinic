<%@page import="logic.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/body_part_1.jsp"%>

<% Users user = (Users)request.getSession().getAttribute("update"); %>
<form class="user" action="SvUpdateUser" method="POST">
    <div class="form-group col mx-3">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="username"
                   placeholder="Username" value="<%= user.getUsername()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" name="password"
                   placeholder="Password" value="<%= user.getPassword()%>" >
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="role"
                   placeholder="Role" value="<%= user.getRol()%>">
        </div>
        
        -<!-- Logic users -->
        
    </div> 
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Update User
    </button>
</form>

<%@include file="Components/body_part_2.jsp" %>
