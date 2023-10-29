package chapter19.com.hspedu.transformation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, FileNotFoundException {
		String filePath = "D:\\Eclipse IDE\\F\\123.txt";
		String charSet = "gbk";
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),charSet);
		osw.write("hie,事件的反思");
		osw.close();
		System.out.println("按照");
		
		
	}
}
 