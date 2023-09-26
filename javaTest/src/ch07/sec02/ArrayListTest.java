package ch07.sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		String[] strArray = new String[10]; 
		ArrayList<String> strList = new ArrayList<String>();
		
		// 추가 및 가져와서 출력
		for(int i =0;i<5;i++) {
			int no = (int)(Math.random() * 100 +1);
			strArray[i] = new String("홍길동" + no);
			strList.add("홍길동" + no);
		}
		
		//출력하기
		printArrayAndRist(strArray,strList);
		
		//ArrayList >>  Iterator변환해서 출력하기
		System.out.println("==================Iterator===================");
		Iterator<String> it = strList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		
		
		// 삽입(2번째 위치 삽입)
		
		strArray[1] = new String("저길동");
		strList.add(new String("저길동"));
		System.out.println("============================================");
		printArrayAndRist(strArray,strList);
		
		
		// 해당 객체가 존재하는 지 확인(저길동)
		boolean isFind = false;
		int indexOf = -1;
		
		for(int i =0;i<strArray.length;i++) {
			if("저길동".equals(strArray[i])) {
				isFind = true;
				indexOf = i;
				break;
			}
		}
		System.out.println("배열에 저길동이" + (isFind == true? "있어요":"없어요"));
		System.out.println("배열에 저길동의 위치는"  + indexOf);
		System.out.println("List에 저길동이" + (strList.contains("저길동") == true? "있어요":"없어요"));
		System.out.println("List에 저길동의 위치는"  + strList.indexOf("저길동"));
		
		// Arraylist -> toArray
		System.out.println("=====================================");
		Object[] obj = strList.toArray(); // toArray()메소드 String으로 받으면 컴파일 에러발생
		for(Object data: obj) {
			System.out.print(data.toString() + " ");
		}
		System.out.println();
		
		// 배열을  -> Arrays
		List<String> list = Arrays.asList(strArray);
		for(String data: list) {
			System.out.print(data != null? data.toString()+ " ":null);
		}
		System.out.println();
		
		
		
		//2번쨰 위치 삭제
		
		strArray[1] = null;
		strList.remove(2);
		System.out.println("=============================");
		printArrayAndRist(strArray,strList);
		
		// 전체 클리어
		Arrays.fill(strArray, null);
		strList.clear();
		System.out.println("=============================");
		
		System.out.printf("strArray.length() = %d \n",strArray.length);
		System.out.printf("strList.size() = %d \n",strList.size());

		
		//isEmpty()
		boolean isEmpty = true;
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i] != null) {
				isEmpty = false;
			}
		}
		System.out.println("strArray " + (isEmpty == true ? "배열이 비어있어요": "배열에 값이 있어요"));
		System.out.println("strList " + (strList.isEmpty()? "배열이 비어있어요": "배열에 값이 있어요"));
		
		
		System.out.println("The end");

	}

	// 출력메소드
	public static void printArrayAndRist(String[] strArray, ArrayList<String> strList) {
		for (int i = 0; i < strList.size(); i++) {
			System.out.printf("strArray[%d]=%s \t", i, strArray[i]);
			System.out.printf("strList[%d]=%s \n", i, strList.get(i));
		}

	}

}
