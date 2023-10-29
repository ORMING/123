package chapter19.com.hspedu.transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
	public static void main(String[] args) throws IOException {
		//读取D:\\Eclipse IDE\\F\\A.txt 文件到程序
		//思路
		//1 创建字符输入流 BufferedReader[处理流]
		//2 使用 BufferedReader 对象读取A.txt
		//3 默认情况下 ,读取文件是按照utf-8 编码
		String filePath = "D:\\Eclipse IDE\\F\\A.txt";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		
		String s = br.readLine();
		System.out.println("读取到的内容" + s);
		
		br.close();
		
		
	}
}
