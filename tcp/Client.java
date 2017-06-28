package Socket1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("127.0.0.1", 8888);
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		byte by[] = new byte[2048];
		int c = 0;
		StringBuffer as = new StringBuffer();
		in.read(by);
		as.append(new String(by));
		
		System.out.println(as.toString());
		out.write("ÄãºÃÂð".getBytes());
		out.flush();
		client.close();
		in.close();
		out.close();
	}
}
