package Review;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP {

	public static void main(String[] args) throws IOException {
//		//������������
//		URL url = new URL("http://www.baidu.com");//��װ�����վ��һ��ͼƬ����վ
//		InputStream in = url.openStream();//������������
//		FileOutputStream out = new FileOutputStream(new File("F:\\ASDF.txt"));//���￴��ͼƬ�����ĵ� ��ѡ���ʵĺ�׺��
//		//��ԭ����һ��һ�� 
//		int b;
//		while((b=in.read())!=-1) {
//			out.write(b);
//		}
//		out.close();in.close();
		
		
		//�������ͻ��˺ͷ������˶���Ҫд��main���������  ����Ҫ���������������������ͷ��˽�������
		
		//�ͻ�����
//		Socket s = new Socket("127.0.0.1",8888);
		//��ȡ���������
//		InputStream in = s.getInputStream();
//		OutputStream out = s.getOutputStream();
//		byte bytea[] = new byte[1024];
//		StringBuffer a = new StringBuffer();
		//����1
//		in.read(bytea);
//		
//		a.append(new String(bytea));
//		System.out.println(a.toString());
		//����2
//		int c = 0;
//		while((c=in.read(bytea, 0, bytea.length))!=-1) {
//			a.append(new String(bytea));
//		}
//		//����3 ��BufferedReader��װ�Ժ���readLine()����
//		String as = null;
//		BufferedReader reader =new BufferedReader(new InputStreamReader(in));
//		while((as = reader.readLine())!= null) {
//			a.append(as);
//		}
		
		//�����Ժ�һ��Ҫ�ر����������  ��buffered��ʱ��Ҫˢ�»�����
		
		
		
		//��������
		ServerSocket a = new ServerSocket(8888);
		Socket c = a.accept();
		InputStream in = c.getInputStream();
		OutputStream out = c.getOutputStream();
		out.write("�ٺٺ�".getBytes());
		//��������ȫһ�������������
		
		
		//�ܽ�һ�� .read(int)���������ʲô�������õ�  
		//��ĸ������ѡ���� �ַ��ֽ���  
		//������һ���õĶ����ֽ��� ����Ҳ�����ַ���ȥת�� 
	}

	
}
