package chapter19.com.hspedu.homework01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework02 {
	

	public static void main(String[] args) {
		String filePath = "D:\\Eclipse IDE\\F\\a.txt";
		BufferedReader br = null;
		String line = "";
		int lineNum = 0;
		try {
//			br = new BufferedReader(new FileReader(filePath));
			br = new BufferedReader(new InputStreamReader/*该方法可以提供一个编码*/(new FileInputStream(filePath), "GBK"));//如果文件编码为其他编码需要使用转换命令
			while ((line = br.readLine()) != null) {
				System.out.println(++lineNum + line);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {

			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		}
	}
}
