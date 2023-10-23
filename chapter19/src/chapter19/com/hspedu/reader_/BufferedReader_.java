package chapter19.com.hspedu.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {
	private static String Line;

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\Eclipse IDE\\F\\江口連 - 擁有超常技能的異世界流浪美食家 03 燉牛肉×未知的迷宮.epub";
		//创建buuferedReader
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		//读取
		String Line;//按行读取效率高
		//说明
		//1. bufferedReader.readLine() 是按行读取文件
		//2. 当返回 null 时，表示文件读取完毕
		while((Line = bufferedReader.readLine()) != null) {
			System.out.println(Line);
		}
		
		//关闭流, 这里注意，只需要关闭 BufferedReader ，因为底层会自动的去关闭 节点流
		//FileReader。
		bufferedReader.close();
		
	}
}
