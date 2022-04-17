<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/hotel/common.jsp" />

<div class="text-center mt-4 mb-4"><h4>Hotels</h4></div>
<table id="hotelTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
                <th>Hotel Code</th>
                <th>Hotel Name</th>
                <th>Location</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${hotels}" var="c">
                <tr>
                    <td>${c.code}</td>
                    <td>${c.name}</td>
                    <td>${c.location}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/hotel/edit/${c.code}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/hotel/delete/${c.code}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#hotelTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>