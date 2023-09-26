package ch07.sec03;

import java.util.HashSet;
import java.util.Iterator;

public class LottoSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>(); // set 중복이안된다.. 알아서 중복을 걸러줌
		
		for(;true;) {
			int no = (int)(Math.random() *45 +1);
			hset.add(no); // auto boxing
			if(hset.size()>=6) break;
		}
		for(Integer data:hset) {   
			System.out.printf("%d ",data);
		}
		System.out.println();
		Iterator<Integer> it = hset.iterator();  // 이터레이터
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		hset.forEach(s -> System.out.print(s + " "));  // foreach문 

	}

}
