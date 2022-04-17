<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/manualinvoice/common.jsp" />

<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="container">
    <div class="row">
        <div class="col-md-9">
        <h2 class="py-5" style="margin-left: 200px; text-align:center">Payment Info</h2>
            <div class="wizard-content">
                <form class="tab-wizard wizard-circle wizard vertical" style="margin-left: 200px"action="/payment/save" method="POST">                  
                    <div style="margin-left: 50px">
                        <img src="/resources/assets/card.jpg" alt="Master Card"/>
                        <img src="/resources/assets/images.png" alt="Master Card"/>
                    </div><br/>
                    <section class="mt-5">
                        <div class="form-group col-md-12">
                           
                            <select class="form-control" name="cartType">
                                <option>Select Card</option>
                                <option value="debit">Debit Card</option>
                                <option value="credit">Credit Card</option>
                                <option value="paypal">Paypal</option>
                                <option value="payoner">Payoner</option>
                            </select>
                        </div>
                        </section>
                        <section>
                        <div class="form-group col-md-12">
                          
                            <select class="form-control" name="bankName">
                                <option>Select Bank</option>
                                <option value="dbbl">DBBL</option>
                                <option value="ibbl">IBBL</option>
                                <option value="jamuna">JAMUNA BANK</option>
                                <option value="payoner">SONALI BANK</option>
                                <option value="jonata">JANOTA BANK</option>
                                <option value="pubali">PUBALI BANK</option>
                                <option value="standerd">STANDARD CHARTERD</option>
                                <option value="abBank">AB BANK</option>
                                <option value="basic">BASIC BANK</option>
                                <option value="rupali">RUPALI BANK</option>	
                                <option value="bankAsia">BANK ASIA</option>
                            </select>
                        </div>
                     </section>
                   <section>
                        <div class="form-group col-md-12">
                    
                            <select class="form-control" name="expireDate">
                                <option>Select Month</option>
                                <option>Jun</option>
                                <option>Feb</option>
                                <option>Mar</option>
                                <option>May</option>
                                <option>Jun</option>
                                <option>July</option>
                                <option>Aug</option>
                                <option>Sep</option>
                                <option>Oct</option>
                                <option>Nov</option>	
                                <option>Dec</option>
                            </select>
                        </div>
                        </section>
                     <section>
                        <div class="form-group col-md-12">
                         
                            <select class="form-control" name="expireYear">
                               <option>Select Year</option> <option>2015</option>
                                <option>2016</option><option>2017</option>
                                <option>2018</option><option>2019</option>
                                <option>2020</option> <option>2021</option>
                                <option>2022</option><option>2023</option>
                                <option>2024</option><option>2025</option>
                                <option>2029</option><option>2027</option>
                                <option>2028</option><option>2030</option>
                            </select>
                        </div>
                        </section>                          
                    <section>
                        
                            <div class="col-md-12">
                                <div class="form-group">
                                    
                                    <input class="form-control" id="cartNo" name="cartNo" placeholder="Cart Number"  type="text">
                                </div>
                            </div>
                        
                    </section>

                    <section>
                        
                            <div class="col-md-12">
                                <div class="form-group">
                                 
                                    <input class="form-control" id="caedno" name="cvvNo" placeholder="CVV Number"  type="text">
                                </div>
                            </div>
                      
                    </section>
                   
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <button type="reset" class="btn btn-danger">Reset</button>
                </form> 
            </div>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />