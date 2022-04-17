<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/pack/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
		<div class="text-center mt-4 mb-4"><h4>Add Package</h4></div>
		<form action="/pack/save" method="POST">
		  <div class="form-row">
		  	<div class="form-group col-md-4">
		  	<label>Package Code<span class="text-danger"> *</span></label>
		      <input type="text" id="packCode" name="packageCode" placeholder="" class="form-control"> 
		    </div>
		    <div class="form-group col-md-4">
		    	<label>Select Hotel<span class="text-danger"> *</span></label> 
		    	<select class="form-control" id="hotelName" name="hotelName">
		    		<c:forEach items="${map.hotels}" var="c">
		    			<option>${c.name}</option>
		    		</c:forEach>
		    	</select>
		    	<input type="hidden" name="hotelName" id="hotelName">
		  	</div>		    
		    <div class="form-group col-md-4">
		    	<label>Select Room<span class="text-danger"> *</span></label>
		    	<select class="form-control" id="roomCode" name="roomNumber">
		    		<c:forEach items="${map.rooms}" var="c">
		    			<option>${c.roomCode}</option>
		    		</c:forEach>
		    	</select>
		    	<input type="hidden" name="roomCode" id="roomCode">
		  	</div>	
		  </div>
		  <div class="form-row">
		  	<div class="form-group col-md-4">
		  	<label>Room Info<span class="text-danger"> *</span></label>
		      <input type="text" id="roomInfo" name="roomInfo" placeholder="" class="form-control"> 
		    </div>
		    <div class="form-group col-md-4">
		    <label>Room Type<span class="text-danger"> *</span></label>
	          <input type="text" id="roomType" name="roomType" placeholder="" class="form-control"> 
		    </div> 		    
		    <div class="form-group col-md-4">
		    <label>Room Price<span class="text-danger"> *</span></label>
	          <input type="text" id="roomPrice" name="roomPrice" placeholder="" class="form-control"> 
		    </div>
		  </div>
		  <div class="form-row">
		  	<div class="form-group col-md-4">
		    	<label>Select Tour Code<span class="text-danger"> *</span></label>
		    	<select class="form-control" id="code" name="code">
		    		<c:forEach items="${map.places}" var="c">
		    			<option>${c.code}</option>
		    		</c:forEach>
		    	</select>
		    	<input type="hidden" name="hotelName" id="hotelName">
		  	</div>
		    <div class="form-group col-md-4">
		    <label>Tour Cost<span class="text-danger"> *</span></label>
	          <input type="text" id="tourCost" name="tourCost" placeholder="" class="form-control"> 
		    </div> 		    
		    <div class="form-group col-md-4">
		    <label>Tour Description<span class="text-danger"> *</span></label>
	          <input type="text" id="tourDescrip" name="tourDescrip" placeholder="" class="form-control"> 
		    </div>
		  </div>
		  <div class="form-row">
		  	<div class="form-group col-md-4">
              <label for="in">Check In:<span class="text-danger"> *</span></label> 
              <input class="form-control" id="arr" name="arrivalDate" placeholder=""  type="date"> 
            </div>
		    <div class="form-group col-md-4">
		    <label for="in">Check Out:<span class="text-danger"> *</span></label> 
	          <input type="date" id="dep" name="departureDate" placeholder="" class="form-control"> 
		    </div>
		    <div class="form-group col-md-4">               
                    <label for="in">Room Status:</label> 
                    <select class="form-control" name="roomStatus">
                        <option value="">Available</option>
                        <option value="">Booked</option>
                    </select>               
            </div>
		  </div>
		  <div class="form-row">
		  	<div class="form-group col-md-4">
		  	<label>Guide Fee</label>
		      <input type="text" id="guideFee" name="guideFee" placeholder="optional" class="form-control"> 
		    </div>
		    <div class="form-group col-md-4">
		    <label>Food</label>
	          <input type="text" id="food" name="food" placeholder="optional" class="form-control"> 
		    </div>
		    <div class="col-md-4">
                   <div class="form-group">
                       <label>Discount:</label>
                       <input class="form-control" id="discount" name="discount" placeholder="discount(%)"  type="text">
                   </div>
               </div>
		  </div>	  
           <div class="row">        	
               <div class="col-md-4">
                   <div class="form-group">
                       <label>Vat:</label>
                       <input class="form-control" id="vat" name="vat" placeholder="VAT(%)" type="text">
                   </div>
               </div>                            
           </div>
		  <div class="form-row">
		  	<div class="form-check">
			  	<input class="form-check-input" type="checkbox" value="" id="guideItem">
			  	<label class="form-check-label" for="flexCheckDefault">Guide Fee</label>
			</div>	    
		  </div>
		  <div class="form-row">
		  	<div class="form-check">
			  	<input class="form-check-input" type="checkbox" value="" id="foodItem">
			  	<label class="form-check-label" for="flexCheckDefault">Food</label>
			</div>	    
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button type="submit" class="btn btn-block btn-primary">Add Package</button> 
           </div>
           
		</form>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>

var rooms = ${rooms};
var places = ${places};

updateRoom();
updatePlace();
$("#roomCode").on("change", function(){
	updateRoom();
})
$("#code").on("change", function(){
	updatePlace();
})

function updateRoom(){
	for(i=0; i<rooms.length; i++){
		if(rooms[i].roomCode == $("#roomCode :selected").val()){	
			$("#roomType").val(rooms[i].roomType);
			$("#roomInfo").val(rooms[i].roomInfo);
			$("#roomPrice").val(rooms[i].price);
		}
	}
}
function updatePlace(){
	for(i=0; i<places.length; i++){
		if(places[i].code == $("#code :selected").val()){	
			$("#tourCost").val(places[i].cost);
			$("#tourDescrip").val(places[i].descrip);
		}
	}
}

$("#foodItem").on("click", function(){
	if($("#foodItem").prop("checked")){
			
		    $.ajax({
				 type: "GET",
				 url: "/food/viewfood",
				 success: function(data, status){
					
				 	$("#food").val("");
				 	$("#food").val(data[0].price);
				 }
			});

		}else{
			
			
		}
	})
	
$("#guideItem").on("click", function(){
	if($("#guideItem").prop("checked")){
		
	    $.ajax({
			 type: "GET",
			 url: "/tour/view",
			 success: function(data, status){
				 
			 	$("#guideFee").val("");
			 	$("#guideFee").val(data[0].price);
			 }
		});

	}else{
		
		
	}
})
</script>