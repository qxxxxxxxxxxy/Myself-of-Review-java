package Review;

public class HelloWorld9neibulei {

	/*
	 * �ڲ��� �ڲ�����ص� �������ɵķ����ⲿ����κγ�Ա(����˽�г�Ա)�������ⲿ�಻��ֱ�ӷ����ڲ���ĳ�Ա��
	 * �ڲ������Ϊ��̬��������protected��private���� �ⲿ��ֻ����public �� ȱʡ����
	 */

	private int a = 1;

	/*
	 * ��Ա�ڲ��� ��Ա�ڲ����ʵ�ʾ����൱�����һ������
	 */

	public class InnerHelloWorld9 {
		public int c = HelloWorld9neibulei.this.a;
	}

	/*
	 * �ֲ��ڲ��� ��һ������������������ ���ʹ�÷�Χֻ����������������ʹ�� ������������Ĵ����в��ܵ��� �ֲ��ڲ�����Ե�������������һ�г�Ա ��
	 * ��Ա�ڲ���һ��
	 */
	// ��Ϊ�ֲ��ڲ�����������
	public void set() {
		class jubuneibulei {
			public void a() {
				System.out.println("����һ���ֲ��ڲ���");
				// �����ⲿ���˽������
				int s = HelloWorld9neibulei.this.a;
			}
		}
		// ���þֲ��ڲ���
		jubuneibulei c = new jubuneibulei();
		c.a();
	}

	/*
	 * �����ڲ��� ֻʹ��һ�ε��� �����ڲ���û������ ���ұ���̳�һ���������һ���ӿ� ���Ҳ�������ʾ��ֱ��extends �� implements
	 * ����Ĵ��� �����ڲ�����Ǿֲ��ڲ��಻д����������
	 */
	interface Inter {
		public void display();

	}

	// �������
	public void print() {
		Inter a = new Inter() {
			public void display() {
				System.out.println("���������ڲ���");
			}
		};// �����ڲ��ඨ�����
		a.display();
	}
	
   /*
    * ��̬�ڲ���  ��̬�ڲ��ඨ�������� �����κη�����ʵ�� ��static ����
    * ��̬�ڲ�����ֱ�ӷ����ⲿ��ľ�̬��Ա ����ֱ�ӷ����ⲿ���ʵ����Ա
    * ��̬�ڲ����п��Զ��徲̬��Ա�������ڲ��಻���� 
    */
	public static class Stat {
		
	}
	public static void main(String[] args) {

		HelloWorld9neibulei.InnerHelloWorld9 Inner = new HelloWorld9neibulei().new InnerHelloWorld9();// ֱ�Ӷ���һ���ڲ���Ķ���
		System.out.println(Inner.c);
		//��̬�ڲ���ĳ�Ա����ֱ������
		Stat c = new Stat();
	}

}
