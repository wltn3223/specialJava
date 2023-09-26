package ch08.sec05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class DicStudent {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 학생이름 객체 저장하는 map 컬렉션 생성
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("황기태",new Student(1, "010-111-1111"));
		map.put("이재문",new Student(2, "010-222-2222"));
		map.put("김남윤",new Student(3, "010-333-3333"));
		
		
		//학생 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("학생이름: " + name + " " + map.get(name));
		}
		// 향상된 for문
		System.out.println("==================for===============");
		
		for(String data: map.keySet()) {
			System.out.println("학생이름: " + data + " " + map.get(data));
		}
		System.out.println("================forEach================");
		
		map.forEach((name,stuInfo) -> System.out.println("학생이름:" + name + stuInfo));
		
		System.out.println("==============Search==================");
	
		//학생 입력
		while(true) {
			System.out.print("검색할이름?");
			String name = scan.nextLine().trim();
			if("exit".equalsIgnoreCase(name)) break;
			Student student = map.get(name);
			System.out.println(name + "은" + (student != null?
			"id: " + student.id + "tel: " + student.tel: "없는사람입니다."));
		}
		System.out.println("The end");
		

	}

}
