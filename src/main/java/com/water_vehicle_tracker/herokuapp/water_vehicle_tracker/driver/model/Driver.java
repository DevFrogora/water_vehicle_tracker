package com.water_vehicle_tracker.herokuapp.water_vehicle_tracker.driver.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "driver")
public class Driver 
{
	
	private String name;
	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", isComing=" + isComing + "]";
	}
	private int age;
	private double latitude;
	private double longitude;
	private boolean isComing;
	
	public Driver(String name, int age, double latitude, double longitude, boolean isComing) {
		super();
		this.name = name;
		this.age = age;
		this.latitude = latitude;
		this.longitude = longitude;
		this.isComing = isComing;
	}


	public Driver() {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public boolean isComing() {
		return isComing;
	}
	public void setComing(boolean isComing) {
		this.isComing = isComing;
	}
	


}
