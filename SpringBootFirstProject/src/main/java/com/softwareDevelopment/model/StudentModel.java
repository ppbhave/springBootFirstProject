package com.softwareDevelopment.model;

public class StudentModel {

	int sId;
	String sName;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "StudentModel [sId=" + sId + ", sName=" + sName + "]";
	}
	
}
