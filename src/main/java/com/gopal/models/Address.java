package com.gopal.models;

public class Address {

	private int houseNo;
	
	private String street;
	
	private String area;
	
	public Address(int houseNo, String street, String area) {
		this.houseNo = houseNo;
		this.street = street;
		this.area = area;
	}
	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", area=" + area + "]";
	}

}
