package chapter19.com.hspedu.printstream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		//在默认情况下PrintStream 输出位置是 标准输出,即显示器
		/*
		 *  public void print(String s) {
		        write(String.valueOf(s));
		    }
	        public static String valueOf(Object obj) {
		        return (obj == null) ? "null" : obj.toString();
		    }
		 */
		out.print("john,hello");
		//应为print底层使用的是write,所以我们可以直接调用write进行打印/输出
		out.write("广发发生的".getBytes());
		out.close();
		//我们可以去修改打印流输出的位置/设备
		//修改成到"D:\\Eclipse IDE\\F\\f1.txt"
		/*
		 *     public static void setOut(PrintStream out) {
			        checkIO();
			        setOut0(out);//native 方法,修改了out
			    }

		 */
		System.setOut(new PrintStream("D:\\Eclipse IDE\\F\\f1.txt"));
		System.out.println("halle,上飞机");
	}
}
