<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/hotel/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2"><h4>Edit Hotel</h4></div>
		<form action="/hotel/update" method="POST">
		  <div class="form-row mt-3">
		    <div class="form-group col-md-6">
		      <label>Hotel Code<span class="text-danger"> *</span></label> 
		      <input type="text" id="hotelcode" name="code" placeholder="Hotel Code" class="form-control" value="${c.code}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Hotel Name<span class="text-danger"> *</span></label> 
	          <input type="text" id="hotelname" name="name" placeholder="Hotel Name" class="form-control" value="${c.name}"> 
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="form-control-label px-3">Hotel Location</label> 
			<textarea class="form-control" id="hotellocation" name="location" rows="1" class="form-control">${c.location}</textarea>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button type="submit" class="btn btn-block btn-primary">Save</button> 
           </div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />