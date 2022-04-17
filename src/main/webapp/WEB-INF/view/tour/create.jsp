<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/tour/common.jsp" />

<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
		<div class="text-center mt-4 mb-4"><h4>Add Fee Details</h4></div>
		<form action="/tour/save" method="POST">
		  <div class="form-row">
		  	<div class="form-group col-md-6">
		      <input type="text" id="tourcode" name="code" placeholder="Tour Code" class="form-control"> 
		    </div> 		    
		    <div class="form-group col-md-6">
	          <input type="text" id="tourPrice" name="fee" placeholder="Tour Fee" class="form-control"> 
		    </div>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button type="submit" class="btn btn-block btn-primary">Add</button> 
           </div>
           
		</form>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />