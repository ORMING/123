package chapter19.com.hspedu.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_ {
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\Eclipse IDE\\F\\A.txt";
		
		//1 把 fileInputStream 转换成 InputStreamReader
		//2 指定编码 gdk
		InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
		//3 把 InputStreamReader 传入 BufferedReader
		BufferedReader br = new BufferedReader(isr);
		//4 读取
		String s = br.readLine();
		System.out.println("读取到的内容" + s);
		br.close();
		
	}
}
