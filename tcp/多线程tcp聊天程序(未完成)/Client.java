package Now;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;

public class Client {
	public Jframea b = null;
	public Client() {
		this.b = ServerThread.a;
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		Client sdf = new Client();
		Socket socket = new Socket("127.0.0.1", 8888);
		OutputStream out = socket.getOutputStream();
		out.write("我是客户端   你好".getBytes());

		InputStream in = socket.getInputStream();
		byte b[] = new byte[1024];
		in.read(b);
		sdf.b.p(new String(b));
		socket.close();
		in.close();
		out.close();
	}
}
