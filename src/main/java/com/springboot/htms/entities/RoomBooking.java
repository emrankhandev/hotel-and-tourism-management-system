package com.springboot.htms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "room_booking")
@Table(name = "room_booking")
public class RoomBooking {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "hotelname")
	private String hotelName;
	
	@Column(name = "hotellocation")
	private String hotelLocation;
	
	@Column(name = "roomcode")
	private String roomCode;
	
	@Column(name = "roomstatus")
	private String roomStatus;
	
	@Column(name = "checkindate")
	private String checkInDate;
	
	@Column(name = "checkoutdate")
	private String checkOutDate;
	
	@Column(name = "roominfo")
	private String roomInfo;
	
	@Column(name = "roomtype")
	private String roomType;
	
	@Column(name = "roomprice")
	private Double roomPrice;
	
	@Column(name = "foodprice")
	private Double foodPrice;
	
	@Column(name = "discount")
	private Double discount;
	
	@Column(name = "vat")
	private Double vat;
	
	@Column(name = "total")
	private Double total;
	
	@Column(name = "grandtotal")
    private Double grandTotal;
	
    @Column(name = "tvat")
    private Double tVat;
    
    @Column(name = "nettotal")
    private Double netTotal;
    
    @Column(name = "tdiscount")
    private Double tDiscount;
    
    @Column(name = "invoicedate")
    private String invoiceDate;
    
    @Column(name = "payment_status")
    private int paymentStatus;
    
	public int getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Double gettVat() {
		return tVat;
	}
	public void settVat(Double tVat) {
		this.tVat = tVat;
	}
	public Double getNetTotal() {
		return netTotal;
	}
	public void setNetTotal(Double netTotal) {
		this.netTotal = netTotal;
	}
	public Double gettDiscount() {
		return tDiscount;
	}
	public void settDiscount(Double tDiscount) {
		this.tDiscount = tDiscount;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
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
	public String getRoomInfo() {
		return roomInfo;
	}
	public void setRoomInfo(String roomInfo) {
		this.roomInfo = roomInfo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public Double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(Double foodPrice) {
		this.foodPrice = foodPrice;
	}

}
