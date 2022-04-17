<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/place/common.jsp" />

<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
		<div class="text-center mt-4 mb-4"><h4>Add Tour Place</h4></div>
		<form action="/place/save" method="POST">
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <input type="text" id="placeCode" name="code" placeholder="Place Code" class="form-control"> 
		    </div>
		    <div class="form-group col-md-6"><input class="form-control" name="image" id="formFileSm" type="file"></div>
		    <div class="form-group col-md-6">
	          <input type="text" id="tourCost" name="cost" placeholder="Tour Cost" class="form-control"> 
		    </div>
		    <div class="form-group col-md-6">
		      <input type="text" id="descrip" name="descrip" placeholder="Place Description" class="form-control"> 
		    </div>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button id="b" type="submit" class="btn btn-block btn-primary">Add Tour Place</button> 
           </div>
		</form>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />