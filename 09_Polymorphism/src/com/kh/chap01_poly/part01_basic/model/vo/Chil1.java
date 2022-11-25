package com.kh.chap01_poly.part01_basic.model.vo;

public class Chil1 extends Parent{

	private int z;

	public Chil1() {
		super();
	}

	public Chil1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Chil1 [z=" + z + ", toString()=" + super.toString() + "]";
	}

	public void printChild1() {
		System.out.println("첫번째 자식에서 호출됨");
	}
	
	@Override
	public void print() {
		System.out.println("첫번째 자식");
	}
}
