<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/packagebooking/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<form class="tab-wizard wizard-circle wizard vertical" action="/packagepayment/save" method="POST">
  <div class="container mt-5" id="div1">
    <section>
    <h3 class="text-center">Payment Details</h3>             
      <div class="row mt-4">                    	
          <div class="col-md-6">
              <div class="form-group">                               
                  <label for="in">Package Payment Code</label> 
                  <input class="form-control" id="pPcode" name="pPcode" type="text">  
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">                               
                  <label for="in">Package Code</label> 
                  <input class="form-control" id="pCode" name="pCode" type="text" value="${po.packageCode}">  
              </div>
          </div>
      </div>
      <div class="row">                    	
          <div class="col-md-6">
              <div class="form-group">                               
                  <label for="in">CheckIn Date</label> 
                  <input class="form-control" id="checkInDate" name="checkInDate" type="text" value="${po.checkInDate}">  
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">
                  <div class="form-group">
	                  <label>CheckOut Date</label>
	                  <input class="form-control" id="checkOutDate" name="checkoutDate" type="text" value="${po.checkOutDate}">                                   
              	</div>
              </div>
          </div>
      </div>
      <div class="row">                    	
          <div class="col-md-6">
              <div class="form-group">                               
                  <label for="in">Room Number</label> 
                  <input class="form-control" id="rNumber" name="rNumber" type="text" value="${po.roomNumber}">  
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">                               
                  <label for="in">Room Price</label> 
                  <input class="form-control" id="roomPrice" name="roomPrice" type="text" value="${po.roomPrice}">  
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">
                  <div class="form-group">
                  <label>Food Price</label>
                  <input class="form-control" id="fPrice" name="fPrice" type="text" value="${po.foodFee}">                                   
              </div>
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">
                  <div class="form-group">
                  <label>Tour Cost</label>
                  <input class="form-control" id="tCost" name="tourCost" type="text" value="${po.tourCost}">                                   
              </div>
              </div>
          </div>
      </div>
      <div class="row">                    	
          <div class="col-md-6">
              <div class="form-group">                               
                  <label for="in">Guide Fee</label> 
                  <input class="form-control" id="gFee" name="gFee" type="text" value="${po.guideFee}">  
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">
                  <div class="form-group">
                  <label>Discount</label>
                  <input class="form-control" id="discount" name="discount" type="text" value="${po.discount}">                                   
              </div>
              </div>
          </div>
      </div>
      <div class="row">                     	
          <div class="col-md-6">
              <div class="form-group">                          
                  <label for="in">Vat</label> 
                  <input class="form-control" id="vat" name="vat" type="text" value="${po.vat}">  
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">                          
                  <label for="status">Total Amount</label> 
                  <input class="form-control" id="total" name="total" type="text" value="${po.total}">  
              </div>
          </div>
      </div>
      <div class="row">                     	
          <div class="col-md-6">
              <div class="form-group">                          
                  <label for="in">Net Total</label> 
                  <input class="form-control" id="nTotal" name="netTotal" type="text" value="${po.netTotal}">  
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">                          
                  <label for="status">Grand Total</label> 
                  <input class="form-control" id="gtotal" name="grandTotal" type="text" value="${po.grandTotal}">  
              </div>
          </div>
      </div>
    </section>
	<section>
      <div class="row">
          <div class="col-md-6">
              <div class="form-group">
              <label for="in">First Name</label> 
                  <input type="text" class="form-control" name="firstName" >
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">
              <label for="in">Last Name</label> 
                  <input type="text" class="form-control" name="lastName" >
              </div>
          </div>
      </div>
      <div class="row">
          <div class="col-md-6">
              <div class="form-group">
              <label for="in">Email</label> 
                  <input type="email" class="form-control" name="email" >
              </div>
          </div>
          <div class="col-md-6">
              <div class="form-group">
              <label for="in">Nid</label> 
                  <input type="text" class="form-control" name="nid">
              </div>
          </div>
      </div>
      <div class="row">
          <div class="col-md-6">
              <div class="form-group">
              <label for="in">City</label> 
                  <input type="text" class="form-control" name="city" >
              </div>
          </div>
      </div>
      <!-- invoice Date -->
      <input class="form-control" id="invoiceDate" name="invoiceDate" placeholder="Invoice Date"  type="hidden">
      
     </section>
		                           
		   <br/>
		        <h1 style="font-weight: bold; color: #761c19" class="text-center">Card Information</h1>
		        <div class="row mt-4">
		           <div style="margin-left: 280px">
                        <img src="/resources/assets/card.jpg" alt="Master Card"/>
                        <img src="/resources/assets/images.png" alt="Master Card"/>
                    </div>
					</div><br/>                                                  
		                     <div class="row">
		                         <div class="col-md-6">
		                         <div class="form-group">
		                             <label>Cart Type:</label>
		                             <select class="form-control" name="cartType">
		                                 <option>Select Card</option>
		                                 <option value="Debit Card">Debit Card</option>
		                                 <option value="Credit Card">Credit Card</option>
		                                 <option value="Paypal">Paypal</option>
		                                 <option value="Payoner">Payoner</option>
		                             </select>
		                         </div>
		                         </div>
		                         <div class="col-md-6">
			                         <div class="form-group">
			                             <label>Expire Date:</label>
			                             <input class="form-control" name="expireDate" placeholder="expireDate"  type="date">
									</div>
		                         </div>
		                         <div class="col-md-6">
			                         <div class="form-group">
			                             <label>Bank Name:</label>
				                            <select class="form-control" name="bankName">
				                                <option>Select Bank</option>
				                                <option value="DBBL">DBBL</option>
				                                <option value="IBBL">IBBL</option>
				                                <option value="JAMUNA BANK">JAMUNA BANK</option>
				                                <option value="SONALI BANK">SONALI BANK</option>
				                                <option value="JANOTA BANK">JANOTA BANK</option>
				                                <option value="PUBALI BANK">PUBALI BANK</option>
				                                <option value="STANDARD CHARTERD">STANDARD CHARTERD</option>
				                                <option value="AB BANK">AB BANK</option>
				                                <option value="BASIC BANK">BASIC BANK</option>
				                                <option value="RUPALI BANK">RUPALI BANK</option>	
				                                <option value="BANK ASIA">BANK ASIA</option>
				                            </select>
									</div>
		                         </div>
		                         <div class="col-md-6">
		                         <div class="form-group">
		                             <label>Cart No:</label>
		                             <input class="form-control" name="cartNo" placeholder="Cart Number"  type="text">
								</div>
		                         </div>
		                         <div class="col-md-6">
		                         <div class="form-group">
		                             <label>CVV No:</label>
		                             <input class="form-control" name="cvvNo" placeholder="CVV Number" type="text">
								</div>
		                         </div>
		                     </div>
		  <div class="form-group col-sm-6 ">
		   	<button type="submit" class="btn btn-primary">Create</button>
		   	<button type="reset" class="btn btn-danger">Reset</button>
	     </div>
  </div>
</form>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />