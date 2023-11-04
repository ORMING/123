package chapter19.com.hspedu.homework01;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Properties;

import org.junit.jupiter.api.Test;






public class Homework03 {
	public static void main(String[] args) throws Exception, IOException {
		String filePath = "src\\dog.properties";
		Properties properties = new Properties();
		properties.load(new FileReader(filePath));
		String name = (String) properties.get("name");
		int age = Integer.parseInt((String) properties.get("age")) ;
		String color = (String) properties.get("color");
		Dog dog = new Dog(name, age, color);
		System.out.println("=====dog对象信息=====");
		System.out.println(dog);
		//将创建的dog对象,序列化到 文件 dog.dat文件
		String serFilePath = "D:\\Eclipse IDE\\F\\dog.dat";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
		oos.writeObject(dog);
		
		//关闭流
		oos.close();
		System.out.println("dog对象,序列完成");
		
		//再编写一个方法,反序列化dog
		}
		@Test
		public void m1() throws Exception, IOException {
			String serFilePath = "D:\\Eclipse IDE\\F\\dog.dat";
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
			Dog dog = (Dog) ois.readObject();
			System.out.println(dog);
			ois.close();
		
	}
}

class Dog implements Serializable{
	private String name;
	private int age;
	private String color;
	public Dog(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
}