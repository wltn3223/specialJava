package ch07.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapTest {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// HashMap 추가
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		// 중복된 key값을 넣을때 이전의 value를 덮어쓰게된다.
		dic.put("apple", "사과2");
		
		// HashMap 출력
		
		for(String key:dic.keySet()) {
			System.out.println(key + ": " + dic.get(key));
		}
		System.out.println();
		System.out.println("==============forEach=================");
		
		// for each문으로 출력
		dic.forEach((key,value) -> System.out.println(key +": " + value));
		System.out.println("=======================================");
		
		//검색기능
		while(true) {
			System.out.print("검색단어(종료:exit)>>");
			String search = scan.nextLine().trim();
			if("exit".equals(search) || "EXIT".equals(search)) {
				System.out.println("단어 검색을종료합니다.");
				break;
			}
			System.out.println(search + "는 " + (dic.get(search) != null ? dic.get(search) : "값이 없습니다.")); 
		}
		
		System.out.println("The end");
		
		
	}

}
