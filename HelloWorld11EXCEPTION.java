package Review;

public class HelloWorld11EXCEPTION {

	public static void main(String[] args) throws InnerException {

		/*
		 * JAVA�������ִ����쳣�Ļ��� 1.�����쳣try-catch-finally 2.�׳��쳣throw throws
		 */

		// 1.
		/*
		 * try catch finally�� ���try����û�б�ִ���� finallyҲ���ᱻִ�� catch ���Ա�ʡ��
		 * finallyҲ���Ա�ʡ�� ���Ƕ���ֻ��ʡ�����е�һ�� finally�������һ���ᱻִ�е� ������ System.exit(0)
		 * ���߳����˾Ͳ������ִ����ȥ try catch finally�в������������ӵĴ��� ������ע��
		 */
		
		// 2.
		/*
		 * throw throws������ʹ�õ� throw���ֶ��׳�һ���쳣
		 */

		// �Զ����쳣
		/*
		 * �Զ����쳣����extends Exception 1.��дgetMessage���� 2.�ֶ��׳� �̳���Exception���һ������
		 */

		// �쳣�������catch�龡��д��ǰ�� �����catch�龡��д�ں���

		/*
		 * ���JDK�ṩ���쳣���Ͳ������������ʱ�򣬳���Ա�����Զ���һЩ�쳣����������������е��쳣��Ϣ.
		 * ����Ա�Զ����쳣������Throwable��ֱ�ӻ�������.
		 * �ڳ����л���쳣��Ϣһ�������쳣�����getMessage��printStackTrace��toString������
		 * �����Զ����쳣һ�����д������������.
		 */
	}

	public class InnerException extends Exception {
		public String getMessage() {
			return "����һ����д���쳣����";

		}
	}

}
