package ch07.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);

		// 학생 정보입력
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
		for(int i=0;i<4;i++) {
			System.out.printf(">>");
			String[] array = scan.nextLine().split(",");
			String name = array[0].trim();
			String major = array[1].trim();
			int schoolNum = Integer.parseInt(array[2].trim());
			double grade = Double.parseDouble(array[3].trim());
			list.add(new Student(name, major, schoolNum, grade));
		
		}
		System.out.println("=============================");
		
		// 학생 정보 출력
		  for(Student stu:list) {
			  System.out.println(
					"이름:" + stu.getName() + "\n"+
					"학과:" + stu.getMajor() + "\n"+
					"학번:" + stu.getSchoolNum() + "\n"+
					"학점평균:" + stu.getName() + 
					"\n============================"
							);
		  }
		  
		  // 학생정보검색
		  while(true) {
			  boolean flag = false;
				System.out.print("학생이름>>");
				String name = scan.nextLine().trim();
				if("그만".equals(name)) break;
				for(Student s: list) {
					if(name.equals(s.getName())) {
						System.out.println(list.get(list.indexOf(s)));
						flag = true;
						break;
						
					}
				}
				if(!flag) {System.out.println("없습니다.");}
			}
			System.out.println("The end");
			scan.close();
		
	}

}
