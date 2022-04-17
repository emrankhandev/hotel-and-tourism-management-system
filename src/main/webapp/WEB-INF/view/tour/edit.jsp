<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/tour/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2"><h4>Edit Tour</h4></div>
		<form action="/tour/update" method="POST">
		  <div class="form-row mt-3">
		  	<div class="form-group col-md-6">
		      <label>Tour Code<span class="text-danger"> *</span></label> 
		      <input type="text" id="code" name="code" placeholder="Tour Code" class="form-control" value="${c.code}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Tour Fee<span class="text-danger"> *</span></label> 
	          <input type="text" id="fee" name="fee" placeholder="Tour Fee" class="form-control" value="${c.fee}"> 
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