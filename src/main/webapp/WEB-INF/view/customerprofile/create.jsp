<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/customerprofile/common.jsp" />

<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="container">
    <div class="row">
        <div class="col-md-9">        
            <div class="wizard-content">
             <h1 class="py-5" style="margin-top: 10px; text-align: center;">Create Tourist Personal Info</h1>
                <form class="tab-wizard wizard-circle wizard vertical" action="/profile/save" method="POST">                  
                    <section>
                        <div class="row ml-6">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label >First Name :</label>
                                    <input type="text" class="form-control" name="firstName">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label >Last Name :</label>
                                    <input type="text" class="form-control" name="lastName">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Email Address :</label>
                                    <input type="email" class="form-control" name="email">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Phone Number :</label>
                                    <input type="text" class="form-control" name="phone">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label> City :</label>
                                   <input type="text" class="form-control" name="city">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label >Date of Birth :</label>
                                    <input type="date" class="form-control " placeholder="Select Date" name="dob">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Nid :</label>
                                    <input type="text" class="form-control " placeholder="Nid" name="nid">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>User Name :</label>
                                    <input type="text" class="form-control " placeholder="User Name" name="userN">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Password :</label>
                                    <input type="text" class="form-control " placeholder="Password" name="pass">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Occupation :</label>
                                    <input type="text" class="form-control " placeholder="Password" name="pass">
                                </div>
                            </div>
                        </div>
                    </section>
                    <button type="submit" class="btn btn-success" style="height: auto;width: 810px; alignment-adjust: central   ">Create</button>

                </form>
            </div>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />