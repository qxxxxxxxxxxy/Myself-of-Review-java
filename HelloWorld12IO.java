package Review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HelloWorld12IO implements java.io.Serializable{
	//测试用
	public int a = 0;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 切记 千万别忘了关闭输入输出流 否则可能文件不能正常复制和加载

		// 输入输出流
		// 1.创建文件夹
		/*
		 * 1.定义文件夹的名字和路径 2.判断文件夹是否存在 3.调用mkdir()进行创建
		 */
		// File c = new File("F:\\i love java\\");
		// if (!c.exists()) {
		// c.mkdir();
		// }

		/*
		 * 简单的输入输出
		 */

		// InputStream in = new FileInputStream(new File("F:\\激活码.txt"));
		// OutputStream out = new FileOutputStream(new File("F:\\激活码1.txt"));
		// int a = 0;
		// while((a = in.read()) != -1) {
		// out.write(a);
		// }
		// in.close();out.close();

		/*
		 * 字符流的用法
		 */

		// int ss = 0;
		// Reader reader = new FileReader(new File("F:\\激活码.txt"));
		// Writer writer = new FileWriter(new File("F:\\激活码2.txt"));
		// while ((ss = reader.read()) != -1) {
		// 		writer.write(ss);
		// }
		// reader.close();
		// writer.close();

		/*
		 * 用BufferedReader包装以后的用法
		 */

		// BufferedReader r = new BufferedReader(reader);
		// BufferedWriter w = new BufferedWriter(writer);
		// String st = r.readLine();
		// while (st != null) {
		// 		System.out.println(st);
		// 		w.write(st);
		//		 w.write("\r\n");
		// 		st = r.readLine();
		// }
		// r.close();w.close();

		/*
		 * 存入数组的操作 所有的都类似 这里只演示一个
		 */

		// BufferedReader r = new BufferedReader(new FileReader(new File("F:\\激活码.txt")));
		// BufferedWriter w = new BufferedWriter(new FileWriter(new File("F:\\激活码3.txt")));
		// char a[] = new char[1024];
		// int c = 0;
		// while((c = r.read(a, 0, a.length))!=-1) {
		// 		w.write(a,0,a.length);
		// }
		// r.close();w.close();
		
		/*
		 * 对象序列化和反序列化
		 * 类要继承这个借口implements java.io.Serializable
		 */
		
		
		HelloWorld12IO hello = new HelloWorld12IO();
		//序列化 保存文件
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("F:\\这是一个对象存储的文件.txt")));
		out.writeObject(hello);
		//反序列化 读取文件
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("F:\\这是一个对象存储的文件.txt")));
		HelloWorld12IO hi = (HelloWorld12IO) in.readObject();
		out.close();in.close();
		System.out.println(hi.a);
		
		
	}

}
