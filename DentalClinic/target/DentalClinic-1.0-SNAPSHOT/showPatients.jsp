<%@page import="java.util.List"%>
<%@page import="logic.Pacient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/body_part_1.jsp"%>
<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">See Patients</h1>
    <p class="mb-4">See all patients registered in the system.</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">See patients</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>DNI</th>
                            <th>Name</th>
                            <th>Lastname</th>
                            <th>Telephone</th>
                            <th>Direction</th>birthday
                            <th>Birthday</th>
                            <th>Insurance</th>
                            <th>Blood type</th>
                            <th>Responsible</th>
                            <th style="width:210px">Action</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>DNI</th>
                            <th>Name</th>
                            <th>Lastname</th>
                            <th>Telephone</th>
                            <th>Direction</th>birthday
                            <th>Birthday</th>
                            <th>Insurance</th>
                            <th>Blood type</th>
                            <th>Responsible</th>
                            <th style="width: 210px">Delete</th>
                        </tr>
                    </tfoot>
                    <% 
                        List<Pacient> list_patients = (List)request.getSession().getAttribute("patients");   
                    %>
                    <tbody>
                        <%for (Pacient us: list_patients){ %>
                        <tr>
                            <td><%= us.getId_() %></td>
                            <td><%= us.getDni() %></td>
                            <td><%= us.getName() %></td>
                            <td><%= us.getLastname() %></td>
                            <td><%= us.getTelephone() %></td>
                            <td><%= us.getDirection() %></td>
                            <td><%= us.getBirthday() %></td>
                            <td><%= us.getSocial_security() %></td>
                            <td><%= us.getBlood_type() %></td>
                            <td><%= us.getResponsible() %></td>

                            <td style="display: flex; width:230px;">
                                <form name="delete" action="SvDeletePatient" method="POST">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right:5px;">
                                        <i class="fas fa-trash-alt"></i> Delete
                                    </button>
                                    <input type="hidden" name="id" value="<%= us.getId_() %>">
                                </form>
                                <form name="update" action="SvUpdatePacient" method="GET">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px;">
                                        <i class="fas fa-pencil-alt"></i> Update
                                    </button>
                                    <input type="hidden" name="id" value="<%= us.getId_() %>">
                                </form>
                            </td>
                        </tr>

                        <% } %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->


<%@include file="Components/body_part_2.jsp" %>
