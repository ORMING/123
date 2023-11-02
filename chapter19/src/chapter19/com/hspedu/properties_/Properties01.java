package chapter19.com.hspedu.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
	public static void main(String[] args) throws IOException {
		
		//读取mysql.properties文件,并得到ip,user和pwd
		BufferedReader br = new BufferedReader(new FileReader("src\\mysql.properties"));
		String Line = "";
		while ((Line = br.readLine()) != null) {//循环读取
			String[] splet = Line.split("=");
			//如果我们要求指定得到ip
			if("ip".equals(splet[0])) {
				System.out.println(splet[0] + "值是:" + splet[1]);
			}
			
		}
		br.close();
	}
}
