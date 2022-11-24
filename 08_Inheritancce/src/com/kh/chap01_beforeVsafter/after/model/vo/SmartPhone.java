package com.kh.chap01_beforeVsafter.after.model.vo;

public class SmartPhone extends Product{

	private String mobileAgency;

	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String moblieAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = moblieAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgenct(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String information() {
		return super.information() + ", moblieAgency : " + mobileAgency;
	}
}
