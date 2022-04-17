<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/room/common.jsp" />

<div class="text-center mt-4 mb-4"><h4>Rooms</h4></div>
<table id="roomTable" class="table table-striped table-bordered" style="width:100%;">
         <thead>
            <tr>
                <th>Hotel Code</th>
                <th>Hotel Name</th>
                <th>Room Number</th>
                <th>Room Type</th>
                <th>Room Price</th>
                <th>Room Description</th>
                <th>Room Status</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${rooms}" var="c">
                <tr>
                    <td>${c.hotelCode}</td>
                    <td>${c.hotelName}</td>
                    <td>${c.roomCode}</td>
                    <td>${c.roomType}</td>
                    <td>${c.price}</td>
                    <td>${c.roomInfo}</td>
                    <td>
                    	<c:choose>
                    	<c:when test="${c.status == 1}">
	                    	Available
                    	</c:when>
                    	<c:otherwise>
                    		 Booked
                    	</c:otherwise>
                    </c:choose>
                    </td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/room/edit/${c.roomCode}">Edit</a>
                        <a class="btn btn-danger" role="button" href="/room/delete/${c.roomCode}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#roomTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>