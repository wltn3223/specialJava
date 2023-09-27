package ch08.sec01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterMain {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try {

			FileWriter fw = new FileWriter("C:/javatest10/javaTestWriter.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			
			while (true) {
				System.out.print("내용입력>>");
				String inputData = scan.nextLine();
				if(inputData.length() == 0) break;
				bw.write(inputData,0,inputData.length());
				bw.write("\r\n",0,2);

			}
	
			
			bw.close();
			FileReader fr = new FileReader("C:/javatest10/javaTestWriter.txt");
			BufferedReader br = new BufferedReader(fr);
			
		
			while(true) {
				int data = br.read();
				if(data == -1) {
					break;
				}
				// reader 문자 2바이트, data int타입으로 리턴했기때문에 다시 char로 형변환해
				System.out.print((char)data);
				
			}
			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");

	}

}
