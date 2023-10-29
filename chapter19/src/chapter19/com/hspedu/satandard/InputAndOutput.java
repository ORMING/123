package chapter19.com.hspedu.satandard;

import java.util.Scanner;

public class InputAndOutput {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		//System类 的 public final static InputSteam in = null;
		// System.in 编译类型 InputStream
		// System.in 运行类型 BufferedInputSteam
		// 表示标准输入 键盘
		System.out.println(System.in.getClass());
		
		
		//1 public static final PrintStream out = null;
		//2 编译类型 PrintStream
		//3 运行类型
		//4 表示标准输出 显示器
		System.out.println(System.out.getClass());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入内容");
		String next = scanner.next();
		System.out.println("next=" + next);
	}
}
