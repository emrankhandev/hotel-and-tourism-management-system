<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/place/common.jsp" />

<div class="text-center mt-4 mb-4"><h4>Tour Places</h4></div>
<table id="placeTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
                <th>Place Code</th>
                <th>Place Image</th>
                <th>Tour Cost</th>
                <th>Tour Description</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${places}" var="c">
                <tr>
                    <td>${c.code}</td>
                    <td>${c.image}</td>
                    <td>${c.cost}</td>
                    <td>${c.descrip}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/place/edit/${c.code}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/place/delete/${c.code}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#placeTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>