package com.springboot.htms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "packageBooking")
@Table(name = "packageBooking")
public class PackageBooking {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
}
