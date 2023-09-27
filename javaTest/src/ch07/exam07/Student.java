package ch07.exam07;

import java.util.Objects;

public class Student {
	private String name;
	private double gradeAvg;
	
	
	public Student() {
		super();
	}
	
	
	
	public Student(String name, double gradeAvg) {
		super();
		this.name = name;
		this.gradeAvg = gradeAvg;
	}


	public String getName() {
		return name;
	}

	public double getGradeAvg() {
		return gradeAvg;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gradeAvg, name);
	}

	@Override
	public boolean equals(Object obj) {
		Student stu = null;
		if(!(obj instanceof Student)) {
			return false;
		}
		stu = (Student)obj;
		return this.name.equals(stu.name) && this.gradeAvg == stu.gradeAvg;
	}
	
	
	

}
