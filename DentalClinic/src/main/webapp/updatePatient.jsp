<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="logic.Pacient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/body_part_1.jsp"%>
<% Pacient patient = (Pacient) request.getSession().getAttribute("update");

   Date birthdayDate = patient.getBirthday();
   
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd", java.util.Locale.US);

   String formattedBirthday = sdf.format(birthdayDate);

%>

<form class="pacient" action="SvUpdatePacient" method="POST">
    <div class="form-group row mx-3">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="dni"
                   placeholder="DNI" value="<%= patient.getDni()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="name"
                   placeholder="First Name" value="<%= patient.getName()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="lastname"
                   placeholder="Last Name" value="<%= patient.getLastname()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="telephone"
                   placeholder="Telephone" value="<%= patient.getTelephone()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="direction"
                   placeholder="Direction" value="<%= patient.getDirection()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="birthday" id="datepicker"
                   placeholder="Birthday" value="<%= formattedBirthday %>">
        </div>
        <div class="col-sm-6 mb-3">
            <select class="form-control form-control-user" name="insurance">
                <option value="" <%= patient.getSocial_security() == null ? "selected" : ""%>>Do you have insurance?</option>
                <option value="yes" <%= Boolean.TRUE.equals(patient.getSocial_security()) ? "selected" : ""%>>Yes</option>
                <option value="no" <%= Boolean.FALSE.equals(patient.getSocial_security()) ? "selected" : ""%>>No</option>
            </select>
        </div>

        <div class="col-sm-6 mb-3">
            <select class="form-control form-control-user" name="bloodType">
                <option value="" selected>Choose blood type</option>
                <option value="A+" <%= "A+".equals(patient.getBlood_type()) ? "selected" : ""%>>A+</option>
                <option value="A-" <%= "A-".equals(patient.getBlood_type()) ? "selected" : ""%>>A-</option>
                <option value="B+" <%= "B+".equals(patient.getBlood_type()) ? "selected" : ""%>>B+</option>
                <option value="B-" <%= "B-".equals(patient.getBlood_type()) ? "selected" : ""%>>B-</option>
                <option value="AB+" <%= "AB+".equals(patient.getBlood_type()) ? "selected" : ""%>>AB+</option>
                <option value="AB-" <%= "AB-".equals(patient.getBlood_type()) ? "selected" : ""%>>AB-</option>
                <option value="O+" <%= "O+".equals(patient.getBlood_type()) ? "selected" : ""%>>O+</option>
                <option value="O-" <%= "O-".equals(patient.getBlood_type()) ? "selected" : ""%>>O-</option>
            </select>
        </div>
    </div> 
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Update Dentist
    </button>
</form>
<%@include file="Components/body_part_2.jsp" %>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script>
    $(document).ready(function () {
        $('#datepicker').datepicker({
            format: 'yyyy-mm-dd', 
            autoclose: true
        });
    });
</script>

