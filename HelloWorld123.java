package Review;

import java.util.Arrays;

public class HelloWorld123 {
	public int a = 1;

	public static void main(String[] args) {
		System.out.println("���ǵ�һ�� ��Ҫ��ʼ��ϰ��");
		System.out.println("***************************");
		/*
		 * java��ʶ��ֻ�������֣���ĸ�»�����Ԫ������� ֻ������ĸ �»��߻�����Ԫ���ſ�ͷ
		 * ��ʶ��������java�еĹؼ���
		 */
		
		//�������� 
		
		/*
		 *�������� byte short int long 
		 *�������� double float 
		 *�ַ����� char(2���ֽ�)
		 *�������� boolean 
		 */
		Integer a = 1;
		int b = 1;
		int c = 2; 
		System.out.println("instanceof���÷�");
		System.out.println(a instanceof Integer);
		int d = b>c?a:c;
		System.out.println(d);
		
		System.out.println("�����¸�ϰ");
		System.out.println("******************");
		
		int ac [] = {1,2,3,4};
		//�����ȵ�ʱ����Ǽ����Ǽ������� �������ﳤ��Ӧ����4
		int ad [] =Arrays.copyOf(ac, 4);
		//��Ԫ�ض���ֵ��1
		Arrays.fill(ad, 1);
		for (int i : ad) {
			System.out.print(i + " ");
		}
	}

}
