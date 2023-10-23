package chapter19.com.hspedu.inputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import chapter19.com.hspedu.outputstream_.Dog;

public class ObjectInputStream_ {
	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		//指定反序列化的文件
		String filePath = "D:\\Eclipse IDE\\F\\data.dat";
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
		
		//读取
		//1 读取顺序(反序列化)的顺序需要和你保存数据(序列化)的顺序一致
		//2 否则会出现异常
		
		System.out.println(ois.readInt());
		System.out.println(ois.readBoolean());
		System.out.println(ois.readChar());
		System.out.println(ois.readDouble());
		System.out.println(ois.readUTF());
		
		//dog 的编译类型是Object ,
		Object o = ois.readObject();
		System.out.println(o.getClass());
		System.out.println(o);//底层Object->Dog
		
		//这里非常重要的细节:
		//1 如果我们希望调用Dog方法,需要向下转型
		//2 需要我们将Dog类的定义,拷贝到可以引用的位置
		
		
		Dog dog2 = (Dog) o; // 将Object转换为Dog类型
		System.out.println(dog2.getName());
		
		//关闭流,关闭外层流即可
		ois.close();
	}
}

