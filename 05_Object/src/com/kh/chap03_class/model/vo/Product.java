package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언 구문에 사용 가능한 접근제한자 : public, default
	// public으로 다른 패키지에서 접근가능
	// default로 설정한 경우 같은 패키지안에서만 접근 가능. / 다른 패키지에서 접근 불가
	
	// 상품명, 상품가격, 브랜드
	private String pName;
	private int price;
	private String brand = "애플";
	
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
//	public void information() {
//		System.out.println(pName + price + brand);
//	}	
	
	public String information() {	
		return "상품명 : " + pName + ", 가격 : " + price+ ", 브랜드 : "+ brand;
	}
}