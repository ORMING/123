package chapter19.com.hspedu.transformation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
	public static void main(String[] args) throws IOException {
		//PrintWriter printWriter = new PrintWriter(System.out);
		PrintWriter printWriter = new PrintWriter(new FileWriter("D:\\Eclipse IDE\\F\\f2.txt"));
		printWriter.print("hi,包子~~~");
		printWriter.close();//flush + 关闭流,才会将数据写入到文件
	}
}
