package ch08.sec01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInputMain {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/javatest10/javaTest.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

//			FileReader fr = new FileReader("C:/javatest10/javaTest.txt");
//			BufferedReader br = new BufferedReader(fr);

			while (true) {
				int data = br.read();
				if (data == -1) {
					break;
				}
				// reader 문자 2바이트, data int타입으로 리턴했기때문에 다시 char로 형변환해
				System.out.print((char) data);

			}

			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
