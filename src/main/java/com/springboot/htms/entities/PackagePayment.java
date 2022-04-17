package com.springboot.htms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "packagepayment")
@Table(name = "packagepayment")
public class PackagePayment {

	@Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
	
	@Column(name = "packagepaymentcode")
	private String packagePaymentCode;
	
	@Column(name = "packagecode")
	private String packageCode;
	
	@Column(name = "checkindate")
	private String checkInDate;
    
    @Column(name = "checkoutdate")
	private String checkOutDate;
    
    @Column(name = "roomprice")
	private Double roomPrice;
    
    @Column(name = "roomnumber")
	private String roomNumber;
	
	@Column(name = "foodprice")
	private Double foodPrice;
	
	@Column(name = "guidefee")
	private Double guideFee;
	
	@Column(name = "tourcost")
	private Double tourCost;
	
	@Column(name = "discount")
	private Double discount;
	
	@Column(name = "vat")
	private Double vat;
	
	@Column(name = "total")
	private Double total;
	
	@Column(name = "invoicedate")
    private String invoiceDate;
	
	@Column(name = "nettotal")
    private Double netTotal;
    
	@Column(name = "grandtotal")
    private Double grandTotal;
    
    @Column(name = "carttype")
    private String cartType;
    
    @Column(name = "bankname")
    private String bankName;
    
    @Column(name = "expiredate")
    private String expireDate;
    
    @Column(name = "cartno")
    private String cartNo;
    
    @Column(name = "cvvno")
    private String cvvNo;
    
    @Column(name = "firstname")
    private String firstName;
    
    @Column(name = "lastname")
    private String lastName;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "nid")
    private String nid;
    
    @Column(name = "paymentstatus")
    private String paymentStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackagePaymentCode() {
		return packagePaymentCode;
	}

	public void setPackagePaymentCode(String packagePaymentCode) {
		this.packagePaymentCode = packagePaymentCode;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(Double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Double getGuideFee() {
		return guideFee;
	}

	public void setGuideFee(Double guideFee) {
		this.guideFee = guideFee;
	}	
	
	public Double getTourCost() {
		return tourCost;
	}

	public void setTourCost(Double tourCost) {
		this.tourCost = tourCost;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getVat() {
		return vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Double getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(Double netTotal) {
		this.netTotal = netTotal;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public String getCartType() {
		return cartType;
	}

	public void setCartType(String cartType) {
		this.cartType = cartType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getCartNo() {
		return cartNo;
	}

	public void setCartNo(String cartNo) {
		this.cartNo = cartNo;
	}

	public String getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(String cvvNo) {
		this.cvvNo = cvvNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
    
    
}
