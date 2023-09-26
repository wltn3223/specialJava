package ch07.exam02;

import java.util.HashMap;
import java.util.Scanner;
;

public class SaveSearchlocation {

	public static void main(String[] args) {
		HashMap<String, Location> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		String[] array = new String[3];
		// 도시 정보입력
		System.out.println("도시, 경도, 위도를입력하세요");
		for(int i=0;i<4;i++) {
			System.out.printf(">>");
			array = scan.nextLine().split(",");
			String name = array[0].trim();
			int x = Integer.parseInt(array[1].trim());
			int y = Integer.parseInt(array[2].trim());
			map.put(name, new Location(name,x,y));
		}
		System.out.println("=============================");
		
		// 도시 정보출력
		for(String data : map.keySet()) {
			System.out.println(map.get(data));
		}
		
		System.out.println("=============================");
		
		// 도시 검색
		while(true) {
			System.out.printf("도시검색>>");
			String name = scan.nextLine().trim();
			if("그만".equals(name)) break;
			System.out.println((map.containsKey(name))? map.get(name): "없습니다." );
			
		}
		scan.close();
		System.out.println("The end");
		

	}

}
