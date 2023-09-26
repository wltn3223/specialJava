package ch07.exam01;

import java.util.Objects;

public class Student {
	private String name;
	private String major;
	private int schoolNum;
	private double gradeAvg;
	
	
	public Student() {
		super();
	}


	public Student(String name, String major, int schoolNum, double gradeAvg) {
		super();
		this.name = name;
		this.major = major;
		this.schoolNum = schoolNum;
		this.gradeAvg = gradeAvg;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public int getSchoolNum() {
		return schoolNum;
	}


	public void setSchoolNum(int schoolNum) {
		this.schoolNum = schoolNum;
	}


	public double getGradeAvg() {
		return gradeAvg;
	}


	public void setGradeAvg(double gradeAvg) {
		this.gradeAvg = gradeAvg;
	}


	@Override
	public int hashCode() {
		return Objects.hash(gradeAvg, major, name, schoolNum);
	}


	@Override
	public boolean equals(Object obj) {
		Student student = new Student();
		if(obj instanceof Student) {
			student = (Student)obj;
		}
		else return false;
		
		return (this.gradeAvg == student.gradeAvg && this.major.equals(student.major) && this.name.equals(student.name)
				&& this.schoolNum == student.schoolNum);
	}


	@Override
	public String toString() {
		return name + ", " + major +", " + schoolNum + ", "+ gradeAvg;
				
	}
	
	
	
	

}
