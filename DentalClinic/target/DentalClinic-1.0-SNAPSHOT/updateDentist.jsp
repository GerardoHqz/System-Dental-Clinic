<%@page import="logic.Dentist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/body_part_1.jsp"%>
<% Dentist dentist = (Dentist)request.getSession().getAttribute("update"); %>

<form class="dentist" action="SvUpdateDentist" method="POST">
    <div class="form-group row mx-3">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="dni"
                   placeholder="DNI" value="<%= dentist.getDni() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="name"
                   placeholder="First Name" value="<%= dentist.getName() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="lastname"
                   placeholder="Last Name" value="<%= dentist.getLastname() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="telephone"
                   placeholder="Telephone" value="<%= dentist.getTelephone() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="direction"
                   placeholder="Direction" value="<%= dentist.getDirection() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="birthday"
                   placeholder="Birthday" value="<%= dentist.getBirthday() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="specialty"
                   placeholder="Specialty" value="<%= dentist.getSpeciality() %>">
        </div>
    </div> 
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Update Dentist
    </button>
</form>

<%@include file="Components/body_part_2.jsp" %>
