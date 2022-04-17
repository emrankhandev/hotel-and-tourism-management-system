<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/room/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div" style="margin-left:300px">
		<div class="text-center mt-4 mb-4"><h4>Add Room</h4></div>
		<form action="/room/save" method="POST">
		<div class="form-row">
		    <div class="form-group col-md-6">
		    	<label>Select Hotel<span class="text-danger"> *</span></label> 
		    	<select class="form-control" id="hotelCode" name="hotelCode">
		    		<c:forEach items="${map.hotels}" var="c">
		    			<option value="${c.code}">${c.name}</option>
		    		</c:forEach>
		    	</select>
		    	<input type="hidden" name="hotelName" id="hotelName">
		  	</div>
		    <div class="form-group col-md-6">
		    	<label>Room Info<span class="text-danger"> *</span></label> 
		    	<select class="form-control" id="hotelCode" name="hotelCode">
		    		
		    	</select>
		    	<input type="hidden" name="hotelName" id="hotelName">
		  	</div>
		   
		  </div>
		  
		  <input class="form-control" id="id" name="id"  type="hidden">
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <input type="text" id="hotelcode" name="roomCode" placeholder="Room Number" class="form-control"> 
		    </div>
		    <div class="form-group col-md-6">
	          <select class="form-control mb-3" name="roomType" id="roomType">
                  <option value="AC/NON-AC">Room Type</option>
                  <option value="AC">AC</option>
                  <option value="NON-AC">NON-AC</option>
              </select> 
		    </div>
		    <div class="form-group col-md-6">
		      <input type="text" id="price" name="price" placeholder="Room Price" class="form-control"> 
		    </div>
		    <div class="form-group col-md-6">
	          <input type="text" id="roomInfo" name="roomInfo" placeholder="Room Description" class="form-control"> 
		    </div>
		    
		    <div class="form-group col-sm-6 "> 
               <button type="submit" class="btn btn-block btn-primary">Add Room</button> 
           </div>
		  </div>
		  
		</form>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />
<!-- <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script> -->
<script>
$("#hotelName").val($("#hotelCode").text());
$("#hotelCode").on("change", function(){
	$("#hotelName").val($("#hotelCode :selected").text());
})

</script>