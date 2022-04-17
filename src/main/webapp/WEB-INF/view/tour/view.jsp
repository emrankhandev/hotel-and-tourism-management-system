<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/tour/common.jsp" />

<div class="text-center mt-4 mb-4"><h4>Tour Guide fee Information</h4></div>
<table id="tourTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
            	<th>Tour Code</th>
                <th>Tour Guide Fee</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${tours}" var="c">
                <tr>
                	<td>${c.code}</td>
                    <td>${c.fee}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/tour/edit/${c.code}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/tour/delete/${c.code}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#tourTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>