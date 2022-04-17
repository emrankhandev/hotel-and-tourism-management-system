<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/room/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2"><h4>Edit Room</h4></div>
		<form action="/room/update" method="POST">
		  <div class="form-row mt-3">
		  	<%-- <div class="form-group col-md-6">
			    	<label>Hotel Name<span class="text-danger">*</span></label> 
			    	<select class="form-control" id="hotelname" name="hotelName">
			    		 <c:forEach items="${data.hotels}" var="c">
			    			<option value="${c.code}">${c.name}</option>
			    		</c:forEach> 
			    	</select>
			  	</div> --%>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Room Number<span class="text-danger"> *</span></label> 
		      <input type="text" id="roomCode" name="roomCode" placeholder="Room Number" class="form-control" value="${data.room.roomCode}"> 
		    </div>
		    <input class="form-control" id="id" name="id"  type="hidden">
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Room Type<span class="text-danger"> *</span></label> 
	          <input type="text" id="roomType" name="roomType" placeholder="Room Type" class="form-control" value="${data.room.roomType}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Room Price<span class="text-danger"> *</span></label> 
	          <input type="text" id="price" name="price" placeholder="Room Price" class="form-control" value="${data.room.price}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Room Info<span class="text-danger"> *</span></label> 
	          <input type="text" id="roomInfo" name="roomInfo" placeholder="Room Info" class="form-control" value="${data.room.roomInfo}"> 
		    </div>
		    <%-- <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Room Status<span class="text-danger"> *</span></label>
		      <input type="text" id="status" name="status" placeholder="Room Status" class="form-control" value="${data.room.status}">
		    </div> --%>
		    <div class="form-group col-sm-6">
		    <label class="form-control-label px-3">Save</label>
               <button type="submit" class="btn btn-block btn-primary">Save</button> 
           </div>
		  </div>
		  
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />