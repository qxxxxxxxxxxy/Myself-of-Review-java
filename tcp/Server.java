package Socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket a = new ServerSocket(8888);
		System.out.println("服务器启动 ");
		Socket b = a.accept();
		InputStream in = b.getInputStream();
		OutputStream out = b.getOutputStream();
		out.write("你好呀".getBytes());
		out.flush();
		byte by[] = new byte[2048];
		int c = 0;
		StringBuffer as = new StringBuffer();
		while ((c = in.read()) != -1) {
			System.out.println(c);
		}

		in.read(by);
		as.append(new String(by));

		System.out.println(as.toString());

		a.close();
		b.close();
		in.close();
		out.close();
	}
}
