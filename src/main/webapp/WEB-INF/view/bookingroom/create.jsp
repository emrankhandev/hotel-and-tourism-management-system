<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/bookingroom/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="text-center mt-4"><h4>Booking Now</h4></div>
<form class="tab-wizard wizard-circle wizard vertical" action="/bookingroom/store" method="POST">
    <div class="container" id="div1">
       
                    <section>                    
                        <div class="row mt-4">                    	
                            <div class="col-md-6">
                                <div class="form-group">                               
                                    <label for="in">Hotel Name:</label> 
                                    <select class="form-control" id="hotelCode" name="hotelName">
							    		<c:forEach items="${map.hotels}" var="c">
							    			<option value="${c.code}">${c.name}</option>
							    		</c:forEach>
							    	</select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <div class="form-group">
                                    <label>Hotel Location:</label>
                                    <input class="form-control" id="hotelLocation" name="hotelLocation" type="text">                                   
                                </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">                     	
                            <div class="col-md-6">
                                <div class="form-group">                          
                                    <label for="in">Room Number:</label> 
                                    <select class="form-control" id="roomCode" name="roomCode">
							    		<c:forEach items="${map.rooms}" var="c">
							    			<option value="${c.roomCode}">${c.roomCode}</option>
							    		</c:forEach>
							    	</select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">                          
                                    <label for="status">Room Status:</label> 
                                    <select class="form-control" id="status" name="roomStatus">
							    	
							    		<option value="booked">Booked</option>
							    	</select>
                                </div>
                            </div>
                        </div>
                        <div class="row">                     	
                            <div class="col-md-6">
                                <div class="form-group">                          
                                    <label for="in">CkeckIn:</label> 
                                    <input type="date" id="checkIn" name="checkInDate" class="form-control">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">                          
                                    <label for="status">CheckOut:</label> 
                                    <input type="date" id="checkOut" name="checkOutDate" class="form-control"> 
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Room Info:</label>
                                    <input class="form-control" id="roomInfo" name="roomInfo" placeholder="Room Info" type="text"> 
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="in">Room Type</label> 
									<input class="form-control" id="roomType" name="roomType" placeholder="Room Type" type="text">
                                </div>
                            </div>
                        </div>
                        
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Room Price:</label>
                                    <input class="form-control" id="price" name="roomPrice" placeholder="Room Price" type="text">
                                </div>
                            </div>
                            <div class="form-row mt-5 ml-3">
							  	<div class="form-check">
								  	<input class="form-check-input" type="checkbox" id="foodItem">
								  	<label class="form-check-label" for="flexCheckDefault">Food</label>
								</div>	    
							 </div>
                        </div>
                        <div class="row">
                        	<div class="col-md-6">
                                <div class="form-group">
                                    <label>Food Price:</label>
                                    <input class="form-control" id="foodFee" name="foodPrice" placeholder="Food Price" type="text">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="in">Discount Price(%)</label> 
									<input class="form-control" id="discount" name="discount" placeholder="Discount" type="text">
                                </div>
                            </div>                                                 
                        </div>
                        <div class="row">
                        	<div class="col-md-6">
                                <div class="form-group">
                                    <label>Vat:</label>
                                    <input class="form-control" id="vat" name="vat" placeholder="vat" type="text">
                                </div>
                            </div>                                                 
                        </div>
                        <!-- invoice Date -->          
                        <input class="form-control" id="invoiceDate" name="invoiceDate" placeholder="Invoice Date"  type="hidden">
                        
                    </section>
                    <div class="form-group col-sm-6 ">
                    	<button type="submit" class="btn btn-primary" data-target="#exampleModalCenter" data-toggle="modal">Create</button>
                    	<button type="reset" class="btn btn-danger">Reset</button>
                    </div>
               </div>
</form>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>

var hotels = ${hotels};
var rooms = ${rooms};


updateLocation();
updateRoom();
$("#hotelCode").on("change", function(){
	updateLocation();
})
$("#roomCode").on("change", function(){
	updateRoom();
})
function updateLocation(){
	for(i=0; i<hotels.length; i++){
		if(hotels[i].code == $("#hotelCode").val()){
			$("#hotelLocation").val(hotels[i].location);
		}
	}
}
function updateRoom(){
	for(i=0; i<rooms.length; i++){
		if(rooms[i].roomCode == $("#roomCode :selected").val()){	
			$("#roomType").val(rooms[i].roomType);
			$("#roomInfo").val(rooms[i].roomInfo);
			$("#price").val(rooms[i].price);
		}
	}
}

$("#foodItem").on("click", function(){
if($("#foodItem").prop("checked")){
		
	    $.ajax({
			 type: "GET",
			 url: "/food/viewfood",
			 success: function(data, status){
				 console.log(data)
			 	$("#foodFee").val("");
			 	$("#foodFee").val(data[0].price);
			 }
		});

	}else{
		
		
	}
})
	
	
	

</script>