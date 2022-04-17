<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/hotel/common.jsp" />

<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
		<div class="text-center mt-4 mb-4"><h4>Add Hotel</h4></div>
		<form action="/hotel/save" method="POST">
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <input type="text" id="hotelcode" name="code" placeholder="Hotel Code" class="form-control"> 
		    </div>
		    <div class="form-group col-md-6">
	          <input type="text" id="hotelname" name="name" placeholder="Hotel Name" class="form-control"> 
		    </div>
		  </div>
		  <div class="form-group">
			<textarea class="form-control" id="hotellocation" name="location" rows="1" placeholder="Hotel Location" class="form-control"></textarea>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button id="b" type="submit" class="btn btn-block btn-primary">Add Hotel</button> 
           </div>
		</form>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />