package com.biz.method.vo;

public class GradeVO {

	private String strNum;
	private String strName;
	private int intKor;
	private int intEng;
	private int intMath;
	
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + ", intEng=" + intEng
				+ ", intMath=" + intMath + ", getStrNum()=" + getStrNum() + ", getStrName()=" + getStrName()
				+ ", getIntKor()=" + getIntKor() + ", getIntEng()=" + getIntEng() + ", getIntMath()=" + getIntMath()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
