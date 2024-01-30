<%@page import="logic.Dentist"%>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/body_part_1.jsp"%>
<% Dentist dentist = (Dentist)request.getSession().getAttribute("update"); 

   Date birthdayDate = dentist.getBirthday();
   
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd", java.util.Locale.US);

   String formattedBirthday = sdf.format(birthdayDate);
%>

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
            <input type="text" class="form-control form-control-user" name="birthday" id="datepicker"
                   placeholder="Birthday" value="<%= formattedBirthday %>">
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
