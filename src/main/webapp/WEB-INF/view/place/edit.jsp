<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/hotel/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2"><h4>Edit Tour Data</h4></div>
		<form action="/place/update" method="POST">
		  <div class="form-row mt-3">
		    <div class="form-group col-md-6">
		      <label>Tour Code<span class="text-danger"> *</span></label> 
		      <input type="text" id="tourCode" name="code" placeholder="Tour Code" class="form-control" value="${p.code}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Image<span class="text-danger"> *</span></label>
		     <div class="mb-3">
		      <input class="form-control" name="image" id="formFileSm" type="file" value="${p.image}">
		     </div> 
		    </div>
		    <div class="form-group col-md-6">
		      <label>Tour Cost<span class="text-danger"> *</span></label> 
		      <input type="text" id="tourCost" name="cost" placeholder="Tour Cost" class="form-control" value="${p.cost}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label>Tour Description<span class="text-danger">*</span></label> 
		      <input type="text" id="tourDescrip" name="descrip" placeholder="Tour Description" class="form-control" value="${p.descrip}"> 
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