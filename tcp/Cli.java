package Socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cli {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("127.0.0.1",8888);
		OutputStream out = s.getOutputStream();
		PrintWriter print = new PrintWriter(out);
		print.write("asdfasdf");
		print.flush();
		s.close();
		out.close();
		print.close();
	}
}
