package ch08.sec01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyMain {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/javatest10/nature.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("C:/javatest10/naturecopy.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] b = new byte[1024 *10];
		
		while(true) {
			int data = bis.read(b);
			if(data == -1) break;
			bos.write(b,0,b.length);
		}
		bos.flush();
		
		bis.close();
		bos.close();
		System.out.println("복사완료");
		System.out.println("The end");
		

	}

}
