<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<ul class="nav nav-tabs">
	<li class="nav-item"><a id="" class="nav-link"
		aria-current="page" href="/package/packages">Packages</a></li>
	<li class="nav-item"><a id="" class="nav-link"
		aria-current="page" href="/packagepayment/report">Payment Reports</a></li>	
	<li class="nav-item"><a id="" class="nav-link"
		aria-current="page" href="/package/allreport">All Package Reports</a></li>
</ul>

<div class="pd-ltr-20 xs-pd-20-10" id="printInvoice">
    
    <div class="btn-group btn-group-lg">
	                    <button onclick="printInvoice1('printInvoice')" class="btn btn-secondary" alignment-adjust: central">PDF</button>
	                    <button onclick="printInvoice1('printInvoice')" class="btn btn-success" alignment-adjust: central"> Print</button>
                	</div>
    
        <div class="invoice-wrap">
            <div class="invoice-box">
                <div class="invoice-header">
                    <div class="logo text-center">
                        <img src="resources/emran1.jpg" alt="">
                    </div>
                </div>
                <h3 class="text-center mb-30 weight-600" style="color: green;">Holiday - Hotel Management System </h3>
                
                <h4 class="text-center mb-30 weight-600">INVOICE</h4>
               
                <div class="row pb-30">
                    <div class="col-md-6">

                        <p class="font-14 mb-5">Date Issued: <strong class="weight-600"> ${pp.invoiceDate}</strong></p>
                        <p class="font-14 mb-5">Date Issued: <strong class="weight-600"> ${pp.packageCode}</strong></p>
                        <p class="font-14 mb-5">Package Payment Code: <strong class="weight-600"> ${pp.packagePaymentCode}</strong> </p>
                        <p class="font-14 mb-5">CheckIn Date: <strong class="weight-600"> ${pp.checkInDate}</strong></p>
                        <p class="font-14 mb-5">CheckOut Date: <strong class="weight-600"> ${pp.checkOutDate}</strong></p>
                        
                    </div>
                    <div class="col-md-6">
                        <div class="text-right">

                            <p class="font-14 mb-5">Invoice No: <strong class="weight-600"> ${pp.id}</strong></p>
                            <p class="font-14 mb-5">Cell-Info:<strong class="weight-600"> 02-992299</strong></p>
                            <p class="font-14 mb-5">Email:<strong class="weight-600">  emran2022@gmail.com</strong></p>
                            <p class="font-14 mb-5">Address:<strong class="weight-600">  196/3,Palton,Dhaka.</strong></p>
                       </div>
                    </div>
                </div>
                <div class="invoice-desc pb-30">
                    <div class="invoice-desc-head clearfix">
                        <div class="invoice-sub">Description</div>
                        
                        <div class="invoice-subtotal">Amount</div>
                    </div>
                    <div class="invoice-desc-body">
                        <ul>
                            <li class="clearfix">
                                <div class="invoice-sub">Room Charge</div>
                                <div class="invoice-subtotal"><span class="weight-600">${pp.roomPrice}</span></div>
                            </li>
                            <li class="clearfix">
                                <div class="invoice-sub">Food Charge</div>
                                <div class="invoice-subtotal"><span class="weight-600">${pp.foodPrice}</span></div>
                            </li>
                            <li class="clearfix">
                                <div class="invoice-sub">Guide Charge</div>
                                <div class="invoice-subtotal"><span class="weight-600">${pp.guideFee}</span></div>
                            </li>
                            <li class="clearfix">
                                <div class="invoice-sub">Tour Cost</div>
                                <div class="invoice-subtotal"><span class="weight-600">${pp.tourCost}</span></div>
                            </li>
                        </ul>
                    </div>
                    <div class="invoice-desc-footer">
                        <div class="invoice-desc-head clearfix">
                           
                            <div class="invoice-sub">Personal Info</div>
                            <div class="invoice-rate">Bill Info</div>
                            <div class="invoice-subtotal">Total: </div>
                        </div>
                        <div class="invoice-desc-body">
                            <ul>
                                <li class="clearfix">
                                    <div class="invoice-sub">
                                        <p class="font-14 mb-5">Name: <strong class="weight-600">${pp.firstName}</strong></p>
                                        <p class="font-14 mb-5">Address: <strong class="weight-600">${pp.city}</strong></p>
                                        <p class="font-14 mb-5">Account No: <strong class="weight-600">${pp.cartNo}</strong></p>
                                        <p class="font-14 mb-5">Bank Name: <strong class="weight-600">${pp.bankName}</strong></p>
                                    </div>
                                    <div class="id" style="">
                                        <div class="invoice-rate font-20 weight-600">  
                                            <p class="font-14"><strong class="weight-600">Sales Amount:</strong></p>
                                            <p class="font-14"><strong class="weight-600">Discount:(-)</strong></p>
                                            <p class="font-14"><strong class="weight-600">Total : </strong></p>
                                            <p class="font-14"><strong class="weight-600"></strong>Vat :(+)</p>
                                        </div>
                                        <div class="invoice-rate font-20 weight-600">
                                            <p class="font-14"><strong class="weight-600">${pp.total}</strong></p>
                                            <p class="font-14"><strong class="weight-600">${pp.discount} %</strong></p>
                                            <p class="font-14"><strong class="weight-600">${pp.netTotal}</strong></p>
                                            <p class="font-14"><strong class="weight-600">${pp.vat} %</strong></p>
                                        </div>

                                        <div class="invoice-subtotal"><span class="weight-600 text-danger">${pp.grandTotal} /=</span></div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                
                    <h4 class="text-center pb-20" style="color: green;">Thank You!!</h4>
                    
                    
            </div>
        </div>
    </div>   
<!-- </div> -->

<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    function printInvoice1(a) {
        var backup = document.body.innerHTML;
        var divContent = document.getElementById(a).innerHTML;
        document.body.innerHTML = divContent;
        window.print();
        document.body.innerHTML = backup;
    }

</script>