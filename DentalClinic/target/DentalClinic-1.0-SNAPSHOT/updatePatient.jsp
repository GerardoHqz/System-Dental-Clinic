<%@page import="logic.Pacient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/body_part_1.jsp"%>
<% Pacient patient = (Pacient)request.getSession().getAttribute("update"); %>

<form class="pacient" action="SvUpdatePacient" method="POST">
    <div class="form-group row mx-3">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="dni"
                   placeholder="DNI" value="<%= patient.getDni() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="name"
                   placeholder="First Name" value="<%= patient.getName() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="lastname"
                   placeholder="Last Name" value="<%= patient.getLastname() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="telephone"
                   placeholder="Telephone" value="<%= patient.getTelephone() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="direction"
                   placeholder="Direction" value="<%= patient.getDirection() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="birthday"
                   placeholder="Birthday" value="<%= patient.getBirthday() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="insurance"
                   placeholder="Insurance" value="<%= patient.getSocial_security() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="bloodType"
                   placeholder="Blood Type" value="<%= patient.getBlood_type() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="responsible"
                   placeholder="Responsible" value="<%= patient.getResponsible() %>">
        </div>
    </div> 
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Update Dentist
    </button>
</form>

<%@include file="Components/body_part_2.jsp" %>

