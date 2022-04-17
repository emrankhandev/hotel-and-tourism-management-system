package com.springboot.htms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "package")
@Table(name = "package")
public class PackageOne {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "packagecode")
	private String packageCode;
	
	@Column(name = "hotelname")
	private String hotelName;
	
	@Column(name = "roomnumber")
	private String roomNumber;
	
	@Column(name = "roominfo")
	private String roomInfo;
	
	@Column(name = "roomtype")
	private String roomType;
	
	@Column(name = "roomstatus")
	private String roomStatus;

	@Column(name = "checkindate")
	private String checkInDate;
	
	@Column(name = "checkoutdate")
	private String checkOutDate;
	
	@Column(name = "tourcode")
	private String tourCode;
	
	@Column(name = "tourinfo")
	private String tourInfo;

	@Column(name = "roomprice")
	private Double roomPrice;
	
	@Column(name = "foodfee")
	private Double foodFee;
	
	@Column(name = "tourcost")
	private Double tourCost;
	
	@Column(name = "guidefee")
	private Double guideFee;
	
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
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
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

	

	public String getTourCode() {
		return tourCode;
	}

	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
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

	public String getTourInfo() {
		return tourInfo;
	}

	public void setTourInfo(String tourInfo) {
		this.tourInfo = tourInfo;
	}

	public Double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Double getFoodFee() {
		return foodFee;
	}

	public void setFoodFee(Double foodFee) {
		this.foodFee = foodFee;
	}

	public Double getTourCost() {
		return tourCost;
	}

	public void setTourCost(Double tourCost) {
		this.tourCost = tourCost;
	}

	public Double getGuideFee() {
		return guideFee;
	}

	public void setGuideFee(Double guideFee) {
		this.guideFee = guideFee;
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
	
	
}
