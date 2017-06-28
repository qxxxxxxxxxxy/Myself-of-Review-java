package Socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ser {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		System.out.println("µÈ´ýÁ¬½Ó");
		Socket in = server.accept();
		InputStream ins = in.getInputStream();
		InputStreamReader inss = new InputStreamReader(ins);
		BufferedReader bu = new BufferedReader(inss);
		StringBuffer a = new StringBuffer();
		String c= null;
		while((c=(bu.readLine()))!= null) {
			a.append(c);
			
		}
		System.out.println(a.toString());
		server.close();
		in.close();
		ins.close();
		inss.close();
		bu.close();
	}
}
