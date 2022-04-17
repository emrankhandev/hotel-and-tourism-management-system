<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/tourmanager/common.jsp" />

<div class="text-center mt-4 mb-4"><h4>Tour Manager Details</h4></div>
<table id="tmTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
        		<th>Id</th>
        		<th>Code</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>City</th>
                <th>DoB</th>
                <th>NID</th>
                <th>Joining Date</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${tm}" var="c">
                <tr>
                	<td>${c.id}</td>
                	<td>${c.code}</td>
                    <td>${c.firstName}</td>
                    <td>${c.lastName}</td>
                    <td>${c.email}</td>
                    <td>${c.phone}</td>
                    <td>${c.city}</td>
                    <td>${c.dob}</td>
                    <td>${c.nid}</td>
                    <td>${c.jDate}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/tourmanager/edit/${c.id}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/tourmanager/delete/${c.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#tmTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>