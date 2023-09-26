package ch07.exam01;

import java.util.HashMap;
import java.util.Scanner;

public class SaveSeachinfo {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		Scanner scan = new Scanner(System.in);
		String[] array = new String[4];
		// 학생 정보입력
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
		for(int i=0;i<4;i++) {
			System.out.printf(">>");
			array = scan.nextLine().split(",");
			String name = array[0].trim();
			String major = array[1].trim();
			int schoolNum = Integer.parseInt(array[2].trim());
			double grade = Double.parseDouble(array[3].trim());
			map.put(name, new Student(name, major, schoolNum, grade));
		
		}
		System.out.println("=============================");
		
		// 입력한 정보 출력
		map.forEach((name,student) -> System.out.println(
				"이름:" + name + "\n"+
				"학과:" + student.getMajor() + "\n"+
				"학번:" + student.getSchoolNum() + "\n"+
				"학점평균:" + student.getName() + 
				"\n============================"
				));
		
		// 정보검색
		while(true) {
			System.out.print("학생이름>>");
			String name = scan.nextLine().trim();
			if("그만".equals(name)) break;
			if(map.containsKey(name)) {
				System.out.println(map.get(name));
				
			}
		}
		System.out.println("The end");
		scan.close();
				

	}

}
