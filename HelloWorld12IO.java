package Review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HelloWorld12IO implements java.io.Serializable{
	//������
	public int a = 0;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// �м� ǧ������˹ر���������� ��������ļ������������ƺͼ���

		// ���������
		// 1.�����ļ���
		/*
		 * 1.�����ļ��е����ֺ�·�� 2.�ж��ļ����Ƿ���� 3.����mkdir()���д���
		 */
		// File c = new File("F:\\i love java\\");
		// if (!c.exists()) {
		// c.mkdir();
		// }

		/*
		 * �򵥵��������
		 */

		// InputStream in = new FileInputStream(new File("F:\\������.txt"));
		// OutputStream out = new FileOutputStream(new File("F:\\������1.txt"));
		// int a = 0;
		// while((a = in.read()) != -1) {
		// out.write(a);
		// }
		// in.close();out.close();

		/*
		 * �ַ������÷�
		 */

		// int ss = 0;
		// Reader reader = new FileReader(new File("F:\\������.txt"));
		// Writer writer = new FileWriter(new File("F:\\������2.txt"));
		// while ((ss = reader.read()) != -1) {
		// 		writer.write(ss);
		// }
		// reader.close();
		// writer.close();

		/*
		 * ��BufferedReader��װ�Ժ���÷�
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
		 * ��������Ĳ��� ���еĶ����� ����ֻ��ʾһ��
		 */

		// BufferedReader r = new BufferedReader(new FileReader(new File("F:\\������.txt")));
		// BufferedWriter w = new BufferedWriter(new FileWriter(new File("F:\\������3.txt")));
		// char a[] = new char[1024];
		// int c = 0;
		// while((c = r.read(a, 0, a.length))!=-1) {
		// 		w.write(a,0,a.length);
		// }
		// r.close();w.close();
		
		/*
		 * �������л��ͷ����л�
		 * ��Ҫ�̳�������implements java.io.Serializable
		 */
		
		
		HelloWorld12IO hello = new HelloWorld12IO();
		//���л� �����ļ�
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("F:\\����һ������洢���ļ�.txt")));
		out.writeObject(hello);
		//�����л� ��ȡ�ļ�
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("F:\\����һ������洢���ļ�.txt")));
		HelloWorld12IO hi = (HelloWorld12IO) in.readObject();
		out.close();in.close();
		System.out.println(hi.a);
		
		
	}

}
