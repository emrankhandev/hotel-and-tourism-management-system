<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/pack/common.jsp" />

<div class="text-center mt-4 mb-4"><h4>Package Details</h4></div>
<table id="foodTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
            	<th>Package Code</th>
                <th>Hotel Name</th>
                <th>Room Number</th>
                <th>Tour Info</th>
                <th>Tour Cost</th>
                <th>Room Price</th>
                <th>Food Cost</th>
                <th>Guide Cost</th>
                <th>Total Cost</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pOne}" var="c">
                <tr>
                	<td>${c.packageCode}</td>
                	<td>${c.hotelName}</td>
                	<td>${c.roomNumber}</td>
                    <td>${c.tourInfo}</td>
                    <td>${c.tourCost}</td>
                    <td>${c.roomPrice}</td>                  
                    <td>${c.foodFee}</td>
                    <td>${c.guideFee}</td>
                    <td>${c.grandTotal}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/pack/edit/${c.packageCode}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/pack/delete/${c.packageCode}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#foodTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>