<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp"/>
<jsp:include page="/WEB-INF/view/bookingroom/common.jsp"/>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
		<div class="col-md-9 offset-2" style="margin-top: 10px">
			<div class="text-center col-md-6 offset-2"><h4>Edit Room</h4></div>
				<form action="/room/update" method="POST">
				  <div class="form-row mt-3">
				    <div class="form-group col-md-6">
				      <label class="form-control-label px-3">Room Number<span class="text-danger"> *</span></label> 
				      <input type="text" id="roomCode" name="roomCode" placeholder="Room Number" class="form-control" value="${data.room.roomCode}"> 
				    </div>
				    <div class="form-group col-md-6">
				      <label class="form-control-label px-3">Room Status<span class="text-danger"> *</span></label>
				      <input type="text" id="status" name="status" placeholder="Room Status" class="form-control" value="${data.room.status}">
				    </div>
				    <div class="form-group col-sm-6"> 
		               <button type="submit" class="btn btn-block btn-primary">Save</button> 
		           </div>
				  </div>		  
				</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />