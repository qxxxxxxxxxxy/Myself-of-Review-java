package Now;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {

	public Socket socket = null;
	public static Jframea a = null;

	public ServerThread(Socket socket, Jframea jframe) {
		this.socket = socket;
		this.a = jframe;
	}

	public void run() {
		InputStream is = null;
		OutputStream os = null;

		try {

			is = socket.getInputStream();
			byte b[] = new byte[1024];
			is.read(b);
			a.p(new String(b));

			os = socket.getOutputStream();
			os.write("»¶Ó­Äú".getBytes());

			os.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
