package ch07.sec05;

import java.util.Objects;

public class Student {
	int id;
	String tel;
	public Student() {}
	
	public Student(int id, String tel) {
		super();
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, tel);
	}
	
	public boolean equals(Object obj) {
		Student s = new Student();
		if(obj instanceof Student) {
			s = (Student)obj;
			
		}else {
			return false;
		}
				
		
		return (this.id == s.id) && this.tel.equals(s.tel);
	}

	@Override
	public String toString() {
		return "id=" + id + "  tel=" + tel;
	}
	

	

}
