package com.kh.chap01_beforeVsafter.before.moder.vo;

public class SmartPhone {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgenct;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgenct) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgenct = mobileAgenct;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMobileAgent() {
		return mobileAgenct;
	}

	public void setMobileAgent(String mobileAgent) {
		this.mobileAgenct = mobileAgenct;
	}
	
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", " + mobileAgenct;
	}
}
