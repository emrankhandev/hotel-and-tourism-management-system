<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html class="no-js">
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Packageotp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	<meta name="author" content="FREEHTML5.CO" />

  
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="/resources/assets2/css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="/resources/assets2/css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="/resources/assets2/css/bootstrap.css">
	<!-- Superfish -->
	<link rel="stylesheet" href="/resources/assets2/css/superfish.css">
	<!-- Magnific Popup -->
	<link rel="stylesheet" href="/resources/assets2/css/magnific-popup.css">
	<!-- Date Picker -->
	<link rel="stylesheet" href="/resources/assets2/css/bootstrap-datepicker.min.css">
	<!-- CS Select -->
	<link rel="stylesheet" href="/resources/assets2/css/cs-select.css">
	<link rel="stylesheet" href="/resources/assets2/css/cs-skin-border.css">
	
	<link rel="stylesheet" href="/resources/assets2/css/style.css">


	<script src="/resources/assets2/js/modernizr-2.6.2.min.js"></script>
	

	</head>
	<body>
		<div id="fh5co-wrapper">
		<div id="fh5co-page">

		<header id="fh5co-header-section" class="sticky-banner">
			<div class="container">
				<div class="nav-header">
					<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>
					<h1 id="fh5co-logo"><a href="/"><i class="icon-airplane"></i>Holiday</a></h1>
					<!-- START #fh5co-menu-wrap -->
					<nav id="fh5co-menu-wrap" role="navigation">
						<ul class="sf-menu" id="fh5co-primary-menu">
							<li><a href="/landding">Home</a></li>
							<li><a href="#fh5co2-tours">Packages</a></li>
							<li><a href="/admindashboard">Login</a></li>
							<li><a href="/landdiing">Contact</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</header>

		<!-- end:header-top -->
	
		<div class="fh5co-hero">
			<div class="fh5co-cover" data-stellar-background-ratio="0.5" style="background-image: url(/resources/assets2/images/res.jpg);">
				<div class="desc">
					<div class="container">
						<div class="row">
							<div class="col-md-9">
								
								<div id="invoice_code_div" class="col-md-12" style="margin-left:260px">
								<h3 style="color: black; font-weight: bold" class="text-center">Search Invoice With Your Mobile Number</h3>
									<input type="text" name="temail" id="temail" style="color:black; margin-left:260px"/> 
									<input type="button" value="Search" class="btn btn-primary" id="btnInvoice"/>
								</div>
								<div id="otp_div" class="col-md-6" style="margin-left:260px">
									<input type="text" name="otp" id="otp" style="color:black; margin-left:260px"/> 
									<input type="button" value="Enter OTP" class="btn btn-primary" id="btnOtp" style="margin-left:260px"/> <br>
									
								</div>
								<div id="invoice_div" style="margin-left:260px">
									<a href="/user/packageinvoice" id="uInvoice" style="color: white; margin-left:260px ; font-weight: bold">Print your Invoice</a>
									
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	<!-- Footer -->
		<footer>
			<div id="footer">
				<div class="container">
					<div class="row row-bottom-padded-md">
						<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
							<h3>About Travel</h3>
							<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
						</div>
						<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
							<h3>Top Flights Routes</h3>
							<ul>
								<li><a href="#">Manila flights</a></li>
								<li><a href="#">Dubai flights</a></li>
								<li><a href="#">Bangkok flights</a></li>
								<li><a href="#">Tokyo Flight</a></li>
								<li><a href="#">New York Flights</a></li>
							</ul>
						</div>
						<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
							<h3>Top Hotels</h3>
							<ul>
								<li><a href="#">Boracay Hotel</a></li>
								<li><a href="#">Dubai Hotel</a></li>
								<li><a href="#">Singapore Hotel</a></li>
								<li><a href="#">Manila Hotel</a></li>
							</ul>
						</div>
						<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
							<h3>Interest</h3>
							<ul>
								<li><a href="#">Beaches</a></li>
								<li><a href="#">Family Travel</a></li>
								<li><a href="#">Budget Travel</a></li>
								<li><a href="#">Food &amp; Drink</a></li>
								<li><a href="#">Honeymoon and Romance</a></li>
							</ul>
						</div>
						<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
							<h3>Best Places</h3>
							<ul>
								<li><a href="#">Boracay Beach</a></li>
								<li><a href="#">Dubai</a></li>
								<li><a href="#">Singapore</a></li>
								<li><a href="#">Hongkong</a></li>
							</ul>
						</div>
						<div class="col-md-2 col-sm-2 col-xs-12 fh5co-footer-link">
							<h3>Affordable</h3>
							<ul>
								<li><a href="#">Food &amp; Drink</a></li>
								<li><a href="#">Fare Flights</a></li>
							</ul>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6 col-md-offset-3 text-center">
							<p class="fh5co-social-icons">
								<a href="#"><i class="icon-twitter2"></i></a>
								<a href="#"><i class="icon-facebook2"></i></a>
								<a href="#"><i class="icon-instagram"></i></a>
								<a href="#"><i class="icon-dribbble2"></i></a>
								<a href="#"><i class="icon-youtube"></i></a>
							</p>
							<p>Copyright 2016 Free Html5 <a href="#">Module</a>. All Rights Reserved. <br>Made with <i class="icon-heart3"></i> by <a href="http://freehtml5.co/" target="_blank">Freehtml5.co</a> / Demo Images: <a href="https://unsplash.com/" target="_blank">Unsplash</a></p>
						</div>
					</div>
				</div>
			</div>
		</footer>

	</div>
	</div>

	<script src="/resources/assets2/js/jquery.min.js"></script>
	<script src="/resources/assets2/js/jquery.easing.1.3.js"></script>->
	<script src="/resources/assets2/js/bootstrap.min.js"></script>
	<script src="/resources/assets2/js/jquery.waypoints.min.js"></script>
	<script src="/resources/assets2/js/sticky.js"></script>
	<script src="/resources/assets2/js/jquery.stellar.min.js"></script>
	<script src="/resources/assets2/js/hoverIntent.js"></script>
	<script src="/resources/assets2/js/superfish.js"></script>
	<script src="/resources/assets2/js/jquery.magnific-popup.min.js"></script>
	<script src="/resources/assets2/js/magnific-popup-options.js"></script>
	<script src="/resources/assets2/js/bootstrap-datepicker.min.js"></script>
	<script src="/resources/assets2/js/classie.js"></script>
	<script src="/resources/assets2/js/selectFx.js"></script>
	<script src="/resources/assets2/js/main.js"></script>
	
	<script>
	
		$("#otp_div").hide();
		$("#invoice_div").hide();
		$("#btnInvoice").click(function(){
			$("#invoice_code_div").hide();
			$("#otp_div").show();
		});
		$("#btnOtp").click(function(){
			if($("#otp").val() == "123"){
				$("#otp_div").hide();
				$("#invoice_div").show();
				
				
				$.ajax({
					type : "POST",
					url : "/home/book/invoice/usersearch",
					data : {temail : $("#temail").val()},
					success : function(data, status) {
							
							
					}
		
				});
			}else{
				alert("Wrong OTP");
			}
		})
		
	</script>
	</body>
</html>

