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
				a.p("�������Ѿ��������������ȴ��ͻ��˵�����   *��ӭ����*");
				
				socket=serverSocket.accept();
				
				ServerThread serverThread = new ServerThread(socket,a);
				
				serverThread.start();
				
				count++;//ͳ�ƿͻ��˵�����
				System.out.println("�Ѿ����ӵĿͻ���������" + count );
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

	

