package ch08.sec01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		
			File src = new File("‪C:/Windows/system.ini");
			File dest = new File("C:/javatest10/mysystem.txt");
			FileReader fr = new FileReader(src);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(dest);
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			while(true) {
				int data = br.read(); // 1바이트로 데이터읽음
				if(data == -1) break; // data없으면 반복문종료
				bw.write((char)data);
			}
			bw.flush(); // 버퍼에 있는것 출력
			
			br.close(); 
			bw.close();  
			
			System.out.printf("%s에서 %s로 복사되었습니다.\n",src.getName(),dest.getName());
			System.out.println("The end");
			
		
		
		

	}

}
