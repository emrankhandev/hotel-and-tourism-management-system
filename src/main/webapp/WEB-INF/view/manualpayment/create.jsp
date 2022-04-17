<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/food/common.jsp" />

<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
		<div class="text-center mt-4 mb-4"><h4>Add Food</h4></div>
		<form action="/food/save" method="POST">
		  <div class="form-row">
		  	<div class="form-group col-md-6">
		      <input type="text" id="foodcode" name="code" placeholder="Food Code" class="form-control"> 
		    </div>
		    <div class="form-group col-md-6">
	          <input type="text" id="foodType" name="type" placeholder="Food Type" class="form-control"> 
		    </div> 		    
		    <div class="form-group col-md-6">
	          <input type="text" id="foodPrice" name="price" placeholder="Food Price" class="form-control"> 
		    </div>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button type="submit" class="btn btn-block btn-primary">Add Food</button> 
           </div>
           
		</form>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />