package com.springboot.htms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "room")
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "roomCode")
	private String roomCode;
	
	@Column(name = "roomType")
	private String roomType;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "roomInfo")
	private String roomInfo;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "hotelCode")
	private String hotelCode;
	
	@Column(name = "hotelName")
	private String hotelName;
	
	
	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRoomInfo() {
		return roomInfo;
	}

	public void setRoomInfo(String roomInfo) {
		this.roomInfo = roomInfo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
}
