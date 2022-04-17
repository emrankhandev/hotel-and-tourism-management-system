<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <title>Hotel - Reservation</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="description" content="" />
    <meta name="keywords" content="">
    <meta name="author" content="Phoenixcoded" />
    <!-- datatable -->
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

<body class="">

	<div class="loader-bg">
		<div class="loader-track">
			<div class="loader-fill"></div>
		</div>
	</div>

	<!-- Sidebar -->
	<nav class="pcoded-navbar  ">
		<div class="navbar-wrapper  ">
			<div class="navbar-content scroll-div " >
				
				<div class="">
					<div class="main-menu-header">
						<img class="img-radius" src="/resources/emran1.jpg" alt="User-Profile-Image">
						<div class="user-details">
							<span>Emran Khan</span>
							<div id="more-details">Admin<i class="fa fa-chevron-down m-l-5"></i></div>
						</div>
					</div>
					<div class="collapse" id="nav-user-link">
						<ul class="list-unstyled">
							<li class="list-group-item"><a href="user-profile.html"><i class="feather icon-user m-r-5"></i>View Profile</a></li>
							<li class="list-group-item"><a href="#!"><i class="feather icon-settings m-r-5"></i>Settings</a></li>
							<li class="list-group-item"><a href="/"><i class="feather icon-log-out m-r-5"></i>Logout</a></li>
						</ul>
					</div>
				</div>
				
				<ul class="nav pcoded-inner-navbar ">
					
					<li class="nav-item">
					    <a href="/admindashboard" class="nav-link "><span class="pcoded-micon"><i class="feather icon-home"></i></span><span class="pcoded-mtext">Dashboard</span></a>
					</li>
                    <li class="nav-item pcoded-menu-caption">
						<label>Management</label>
					</li>
					<li class="nav-item">
					    <a href="/hotel/create" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-hotel"></i></span><span class="pcoded-mtext">Hotel Management</span></a>
					</li>
					<li class="nav-item">
					    <a href="/room/create" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-person-booth"></i></span><span class="pcoded-mtext">Room Management</span></a>
					</li>
					<li class="nav-item">
					    <a href="/pack/create" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-cubes"></i></span><span class="pcoded-mtext">Package Management</span></a>
					</li>
					<li class="nav-item">
					    <a href="/food/create" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-utensils"></i></span><span class="pcoded-mtext">Food Management</span></a>
					</li>
					<li class="nav-item">
					    <a href="/place/create" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-umbrella-beach"></i></span><span class="pcoded-mtext">Tour Management</span></a>
					</li>
					<li class="nav-item">
					    <a href="/tour/create" class="nav-link "><span class="pcoded-micon"><i class="fa-brands fa-watchman-monitoring"></i></span><span class="pcoded-mtext">Guide Management</span></a>
					</li>
                    <li class="nav-item pcoded-menu-caption">
						<label>Toursit Management</label>
					</li>
					<li class="nav-item">
					    <a href="/tourmanager/create" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-user-tie"></i></span><span class="pcoded-mtext">Tour Manager</span></a>
					</li>
					<li class="nav-item">
					    <a href="/profile/create" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-user-check"></i></span><span class="pcoded-mtext">Tourist Profile</span></a>
					</li>
                    <li class="nav-item pcoded-menu-caption">
						<label>Booking Management</label>
					</li>
					<li class="nav-item">
					    <a href="/bookingroom/create" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-book-medical"></i></span><span class="pcoded-mtext">Room Booking</span></a>
					</li>
					<li class="nav-item">
					    <a href="/package/packages" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-scroll-torah"></i></span><span class="pcoded-mtext">Package Booking</span></a>
					</li>
                    <li class="nav-item pcoded-menu-caption">
						<label>Payment & Invoice</label>
					</li>
					<li class="nav-item">
					    <a href="/profile/minvoice" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-credit-card"></i></span><span class="pcoded-mtext">Payment</span></a>
					</li>    
					<li class="nav-item">
					    <a href="" class="nav-link "><span class="pcoded-micon"><i class="fa-solid fa-file-invoice-dollar"></i></span><span class="pcoded-mtext">Invoice</span></a>
					</li>    
				</ul>	
			</div>
		</div>
	</nav>
	
	<header class="navbar pcoded-header navbar-expand-lg navbar-light header-dark">
		<div class="collapse navbar-collapse">
			<h3 style="margin-left: 800px; color: orange;">HOTEL <span style="color: white;">RESERVATION</span> SYSTEM</h3>	
		</div>	
	</header>


<div class="test">
	