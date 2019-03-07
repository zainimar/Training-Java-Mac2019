<%@page import="models.Projects_model"%>
<%@page import="controllers.Projects"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../include/header.jsp" %>

<div><h2><strong>SENARAI PROJEK-PROJEK</strong></h2></div>

<table class="table table-bordered table-hover ">
    <tr>
        <td>BIL</td>
        <td>TAJUK</td>
        <td>KETERANGAN</td>
        <td>TINDAKAN</td>
    </tr>
    
    <%
        ArrayList list = (ArrayList)request.getAttribute("list");
        for(int i=0; i<list.size(); i++){
            Projects_model pro = (Projects_model) list.get(i);
        
    %>
   
    <tr>
        <td><%= i+1 %></td>
        <td><%= pro.getTitle() %></td>
        <td><%= pro.getDescription() %></td>
        <td>
            <a href="/ManagementSystem/projects?id=<%= pro.getId()%>&action=edit" class="btn btn-success btn-sm">Edit</a>
            <a href="/ManagementSystem/projects?id=<%= pro.getId()%>&action=del" class="btn btn-danger btn-sm">Delete</a>
        </td>
    </tr>
    
    <% } %>
    
</table>




<%@include file="../include/footer.jsp" %>