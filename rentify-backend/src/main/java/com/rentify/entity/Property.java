package com.rentify.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "properties")
public class Property {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "place", nullable = false)
    private String place;
	@Column(name = "area", nullable = false)
    private String area;
	@Column(name = "bedrooms", nullable = false)
    private int bedrooms;
	@Column(name = "bathrooms", nullable = false)
    private int bathrooms;
	@Column(name = "nearbyHospitals", nullable = false)
    private String nearbyHospitals;
	@Column(name = "nearbyColleges", nullable = false)
    private String nearbyColleges;
	@Column(name = "sellerId", nullable = false)
    private Long sellerId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public String getNearbyHospitals() {
		return nearbyHospitals;
	}
	public void setNearbyHospitals(String nearbyHospitals) {
		this.nearbyHospitals = nearbyHospitals;
	}
	public String getNearbyColleges() {
		return nearbyColleges;
	}
	public void setNearbyColleges(String nearbyColleges) {
		this.nearbyColleges = nearbyColleges;
	}
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
    
    

}
