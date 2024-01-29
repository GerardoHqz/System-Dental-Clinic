<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/body_part_1.jsp"%>
<form class="dentist" action="SvDentist" method="POST">
    <div class="form-group row mx-3">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="dni"
                   placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="name"
                   placeholder="First Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="lastname"
                   placeholder="Last Name">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="telephone"
                   placeholder="Telephone">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="direction"
                   placeholder="Direction">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="birthday"
                   placeholder="Birthday">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="specialty"
                   placeholder="Specialty">
        </div>
        
        -<!-- Logic users -->
        
    </div> 
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Register Dentist
    </button>
</form>

<%@include file="Components/body_part_2.jsp" %>
