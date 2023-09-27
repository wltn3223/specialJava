package ch07.exam07;

import java.util.HashMap;
import java.util.Scanner;

public class ScholarshipMap {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("미래장학금관리시스템입니다.");
		HashMap<String, Student> map = new HashMap<>();
		
		// 학생정보입력
		for(int i=0;i<5;i++) {
			System.out.print("이름과 학점>>");
			String name = scan.next();
			double gradeAvg = scan.nextDouble();
			map.put(name,new Student(name,gradeAvg));
		}
		System.out.print("장학생 선발 학점 기준 입력>>");
		double score = scan.nextDouble();
		
		
		// 장학생 명단 출력
		System.out.printf("장학생 명단:");
		
		for(String name:map.keySet()) {
			if(map.get(name).getGradeAvg()>=score) {
				System.out.print(map.get(name).getName() + " ");
			}
		}
		System.out.println();
		// 스트림 활용
		System.out.printf("장학생 명단:");
		map.values().stream().filter(s -> s.getGradeAvg()>score)
		.forEach(s -> System.out.print(s.getName() + " "));
		

	}

}
