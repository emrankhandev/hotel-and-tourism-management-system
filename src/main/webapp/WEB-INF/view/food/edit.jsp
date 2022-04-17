<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/food/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2"><h4>Edit Food</h4></div>
		<form action="/food/update" method="POST">
		  <div class="form-row mt-3">
		  	<div class="form-group col-md-6">
		      <label>Food Code<span class="text-danger"> *</span></label> 
		      <input type="text" id="foodcode" name="code" placeholder="Food Code" class="form-control" value="${c.code}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Food Type<span class="text-danger"> *</span></label> 
		      <input type="text" id="foodType" name="type" placeholder="Food Type" class="form-control" value="${c.type}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Food Price<span class="text-danger"> *</span></label> 
	          <input type="text" id="foodPrice" name="price" placeholder="Food Price" class="form-control" value="${c.price}"> 
		    </div>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button type="submit" class="btn btn-block btn-primary">Save</button> 
           </div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />