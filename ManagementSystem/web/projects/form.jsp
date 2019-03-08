<%@page import="models.Projects_model"%>
<%@include file="../include/header.jsp" %>

<% 
Projects_model pro =(Projects_model) request.getAttribute("projects");
//set form 0 kalau object kosong
if (pro == null) {
    pro = new Projects_model();
}
%>

<legend>DAFTAR PROJEK</legend>
<div class="container">
    <form method="post" action="/ManagementSystem/projects">
        <input type="hidden" name="id" value="<%= pro.getId() %>">
        <div class="row"> 
            <div class="col-md-1">Tajuk </div>
            <div class="col-md-4"><input class="form-control" type="text" name="title" value="<%= pro.getTitle() %>"> </div>
        </div>
        <br>
        <div class="row">
            <div class="col-md-1">Keterangan </div>
            <div class="col-md-4"><textarea class="form-control" name="description"><%= pro.getDescription() %></textarea></div>
        </div>
        <br>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-4" align="center">
                <input class="btn btn-primary btn-sm" type="submit" value="Simpan"> 
                <a href="/ManagementSystem/projects" class="btn btn-primary btn-sm"> Back</a>
            </div>
        </div>

    </form>
</div>


<%@include file="../include/footer.jsp" %>
