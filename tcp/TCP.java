package Review;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP {

	public static void main(String[] args) throws IOException {
//		//网络连接下载
//		URL url = new URL("http://www.baidu.com");//假装这个网站是一个图片的网站
//		InputStream in = url.openStream();//打开网络连接流
//		FileOutputStream out = new FileOutputStream(new File("F:\\ASDF.txt"));//这里看是图片还是文档 挑选合适的后缀名
//		//和原来那一套一样 
//		int b;
//		while((b=in.read())!=-1) {
//			out.write(b);
//		}
//		out.close();in.close();
		
		
		//这两个客户端和服务器端都是要写在main方法里面的  而且要先启动服务器端在启动客服端进行连接
		
		//客户端流
//		Socket s = new Socket("127.0.0.1",8888);
		//获取输入输出流
//		InputStream in = s.getInputStream();
//		OutputStream out = s.getOutputStream();
//		byte bytea[] = new byte[1024];
//		StringBuffer a = new StringBuffer();
		//方法1
//		in.read(bytea);
//		
//		a.append(new String(bytea));
//		System.out.println(a.toString());
		//方法2
//		int c = 0;
//		while((c=in.read(bytea, 0, bytea.length))!=-1) {
//			a.append(new String(bytea));
//		}
//		//方法3 用BufferedReader包装以后用readLine()方法
//		String as = null;
//		BufferedReader reader =new BufferedReader(new InputStreamReader(in));
//		while((as = reader.readLine())!= null) {
//			a.append(as);
//		}
		
		//用完以后一定要关闭输入输出流  用buffered的时候要刷新缓存区
		
		
		
		//服务器端
		ServerSocket a = new ServerSocket(8888);
		Socket c = a.accept();
		InputStream in = c.getInputStream();
		OutputStream out = c.getOutputStream();
		out.write("嘿嘿嘿".getBytes());
		//其它的完全一样和输入输出流
		
		
		//总结一下 .read(int)这个方法是什么都可以用的  
		//别的根据情况选择用 字符字节流  
		//网络编程一般用的都是字节流 但是也能往字符流去转换 
	}

	
}
