package ex;

import java.util.HashMap;
import java.util.Map;

public class StudentDTO {
	
	String studentNumber;
	String studentName;
	String studentMajor;
	String studentMoblie;
	public void stidentDTO() {
		
	}


	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentname() {
		return studentName;
	}
	public void setStudentname(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public String getStudentMoblie() {
		return studentMoblie;
	}
	public void setStudentMoblie(String studentMoblie) {
		this.studentMoblie = studentMoblie;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = studentNumber + "\t" + studentName + "\t" + studentMajor + "\t" +studentMoblie;
		return str;
	}
	
}
