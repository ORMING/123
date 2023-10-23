package chapter19.com.hspedu.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutStream_ {
	public static void main(String[] args) throws Exception {
		//序列化后,保存的文件格式,不是文本,而是按照他的格式来保存的
		String filePath = "D:\\Eclipse IDE\\F\\data.dat";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
		//序列化数据到  e:\data.dat
		oos.writeInt(100);//int->Intger(实现了 Serializable接口)
		oos.writeBoolean(true);//boolean -> Boolean (实现了 Serializable接口)
		oos.writeChar('a');//char->character(实现了 Serializable接口)
		oos.writeDouble(9.5);//double ->Double(实现了 Serializable接口)
		oos.writeUTF("包子");//String
		//保存一个dog对象
		oos.writeObject(new Dog("包子", 60));
		oos.close();
		System.out.println("数据保存完毕(序列化新式)");
	}
}
