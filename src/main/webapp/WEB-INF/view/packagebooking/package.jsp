<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/packagebooking/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="text-center mt-4 mb-4"><h4>Book A Package</h4></div>
<table id="foodTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
            	<th>Package Code</th>
                <th>Hotel Name</th>
                <th>CheckIn Date</th>
                <th>CheckOut Date</th>
                <th>Room Charge</th>
                <th>Food Charge</th>
                <th>Guide Charge</th>
                <th>Tour Charge</th>
                <th>Total Cost</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pOne}" var="c">
                <tr>
                	<td>${c.packageCode}</td>
                	<td>${c.hotelName}</td>
                	<td>${c.checkInDate}</td>
                    <td>${c.checkOutDate}</td>
                    <td>${c.roomPrice}</td>
                    <td>${c.foodFee}</td>
                    <td>${c.guideFee}</td>
                    <td>${c.tourCost}</td>
                    <td>${c.grandTotal}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/package/edit/${c.packageCode}">Book Now</a>
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