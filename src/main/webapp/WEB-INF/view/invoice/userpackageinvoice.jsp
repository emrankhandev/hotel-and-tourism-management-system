<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link href="https://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css">
    <script src="https://kit.fontawesome.com/db1fa08668.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/resources/assets/css/style.css">
    <link rel="stylesheet" href="/resources/assets/css/plugins/all.css">
    <link rel="icon" href="/resources/assets/images/favicon.ico" type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="/resources/assets2/style.css">
	<style>
		.test{
		margin-left:250px;
		}
	</style>
	<script>
       window.dataLayer = window.dataLayer || [];
       function gtag() {
           dataLayer.push(arguments);
       }
       gtag('js', new Date());

       gtag('config', 'UA-119386393-1');
    </script>
</head>
<body>
<div class="pd-ltr-20 xs-pd-20-10" id="printInvoice">
    
    
    
        <div class="invoice-wrap">
            <div class="invoice-box">
                <div class="invoice-header">
                    <div class="logo text-center">
                        <img src="resources/emran1.jpg" alt="">
                    </div>
                </div>
                <h3 class="text-center mb-30 weight-600" style="color: green;">Emran - Hotel Management System </h3>
                
                <h4 class="text-center mb-30 weight-600">INVOICE</h4>
               
                <div class="row pb-30">
                    <div class="col-md-6">
                        <%-- <h5 class="mb-15">${t.place}</h5> --%>

                        <p class="font-14 mb-5">Date Issued: <strong class="weight-600"> 18-04-2022</strong></p>
                        <p class="font-14 mb-5">Mobile Number: <strong class="weight-600"> 01887089986</strong> </p>
                        <p class="font-14 mb-5">Room Number: <strong class="weight-600"> R-77</strong> </p>
                        <p class="font-14 mb-5">CheckIn Date: <strong class="weight-600"> 18-04-2022</strong></p>
                        <p class="font-14 mb-5">CheckOut Date: <strong class="weight-600"> 20-04-2022</strong></p>
                        <p class="font-14 mb-5">Package Code: <strong class="weight-600"> Diamond</strong></p>
                    </div>
                    <div class="col-md-6">
                        <div class="text-right">
                            <p class="font-14 mb-5">Invoice No: <strong class="weight-600">515</strong></p>
                            <p class="font-14 mb-5">More-Info:<strong class="weight-600">196/3,Palton,Dhaka.<br/> Hotline:02-992299</strong></p>
                            <p class="font-14 mb-5">Email:<strong class="weight-600">  emran2022@gmail.com</strong></p>
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
                                <div class="invoice-subtotal"><span class="weight-600">1500</span></div>
                            </li>
                            <li class="clearfix">
                                <div class="invoice-sub">Food Charge</div>
                                <div class="invoice-subtotal"><span class="weight-600">750</span></div>
                            </li>
                            <li class="clearfix">
                                <div class="invoice-sub">Guide Charge</div>
                                <div class="invoice-subtotal"><span class="weight-600">500</span></div>
                            </li>
                            <li class="clearfix">
                                <div class="invoice-sub">Tour Cost</div>
                                <div class="invoice-subtotal"><span class="weight-600">500</span></div>
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
                                        <p class="font-14 mb-5">Name: <strong class="weight-600">Emran Khan</strong></p>
                                        <p class="font-14 mb-5">Address: <strong class="weight-600">Paltan</strong></p>
                                        <p class="font-14 mb-5">Account No: <strong class="weight-600">2545454</strong></p>
                                        <p class="font-14 mb-5">Bank Name: <strong class="weight-600">Pubali Bank</strong></p>
                                    </div>
                                    <div class="id" style="">
                                        <div class="invoice-rate font-20 weight-600">  
                                            <p class="font-14"><strong class="weight-600">Sales Amount:</strong></p>
                                            <p class="font-14"><strong class="weight-600">Discount:(-)</strong></p>
                                            <p class="font-14"><strong class="weight-600">Total : </strong></p>
                                            <p class="font-14"><strong class="weight-600"></strong>Vat :(+)</p>
                                        </div>
                                        <div class="invoice-rate font-20 weight-600">
                                            <p class="font-14"><strong class="weight-600">12500</strong></p>
                                            <p class="font-14"><strong class="weight-600">10 %</strong></p>
                                            <p class="font-14"><strong class="weight-600">1100.93</strong></p>
                                            <p class="font-14"><strong class="weight-600">5 %</strong></p>
                                        </div>

                                        <div class="invoice-subtotal"><span class="weight-600 text-danger">10000.00 /=</span></div>
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
    <div class="btn-group btn-group-lg">
      <button onclick="printInvoice1('printInvoice')" class="btn btn-secondary" alignment-adjust: central">PDF</button>
      <button onclick="printInvoice1('printInvoice')" class="btn btn-success" alignment-adjust: central"> Print</button>
    </div>
    
    <script src="/resources/assets/js/plugins/jquery-3.6.0.min.js"></script>
 	<script src="/resources/assets/js/vendor-all.min.js"></script>
    <script src="/resources/assets/js/plugins/bootstrap.min.js"></script>
    <script src="/resources/assets/js/pcoded.min.js"></script>
    <script src="/resources/assets/js/plugins/apexcharts.min.js"></script>
    <script src="/resources/assets/js/pages/dashboard-main.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script>
    function printInvoice1(a) {
        var backup = document.body.innerHTML;
        var divContent = document.getElementById(a).innerHTML;
        document.body.innerHTML = divContent;
        window.print();
        document.body.innerHTML = backup;
    }

</script>
</body>
</html>