package Now;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			
			ServerSocket serverSocket=new ServerSocket(8888);
			Socket socket=null;
			int count=0;
			
			while(true){
				Jframea a = new Jframea();
				a.p("服务器已经启动，我们来等待客户端的连接   *欢迎光临*");
				
				socket=serverSocket.accept();
				
				ServerThread serverThread = new ServerThread(socket,a);
				
				serverThread.start();
				
				count++;//统计客户端的数量
				System.out.println("已经连接的客户端数量是" + count );
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

	

