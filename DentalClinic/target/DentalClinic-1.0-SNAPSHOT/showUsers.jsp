<%@page import="logic.Users"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/header.jsp" %>
<%@include file="Components/body_part_1.jsp"%>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">See Users</h1>
    <p class="mb-4">See all users registered in the system <a target="_blank"
                                                                   href="https://datatables.net">official DataTables documentation</a>.</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">See Users</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Username</th>
                            <th>Role</th>
                            <th style="width:210px">Action</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Username</th>
                            <th>Role</th>
                            <th style="width: 210px">Delete</th>
                        </tr>
                    </tfoot>
                    
                    <% 
                        List<Users> list_users = (List)request.getSession().getAttribute("users");   
                    %>
                    
                    <tbody>
                        <%for (Users us: list_users){ %>
                            <tr>
                                <td><%= us.getId_user() %></td>
                                <td><%= us.getUsername() %></td>
                                <td><%= us.getRol() %></td>
                            
                                <td style="display: flex; width:230px;">
                                    <form name="delete" action="SvDeleteUser" method="POST">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right:5px;">
                                            <i class="fas fa-trash-alt"></i> Delete
                                        </button>
                                        <input type="hidden" name="id" value="<%= us.getId_user() %>">
                                    </form>
                                    <form name="update" action="SvUpdateUser" method="GET">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px;">
                                            <i class="fas fa-pencil-alt"></i> Update
                                        </button>
                                        <input type="hidden" name="id" value="<%= us.getId_user() %>">
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
