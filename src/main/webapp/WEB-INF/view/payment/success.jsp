<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<ul class="nav nav-tabs">
	<li class="nav-item"><a id="room-create" class="nav-link"
		aria-current="page" href="/bookingroom/create">Create Booking</a></li>
	<li class="nav-item"><a id="room-status" class="nav-link"
		aria-current="page" href="/bookingroom/roomstatus">Booked Rooms</a></li>	
	<li class="nav-item"><a id="room-home" class="nav-link"
		aria-current="page" href="/bookingroom/available">Available Rooms</a></li>
	<li class="nav-item"><a id="room-home" class="nav-link"
		aria-current="page" href="/payment/report">Payment Reports</a></li>
</ul>

	<div class="row mt-4">
	     <div class="text-center mt-7" style="margin-left: 380px">
		       <img src="/resources/assets/3.gif" alt="Master Card"/>		    
	     </div>
	</div>
<hr>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />
