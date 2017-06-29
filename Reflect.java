package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Reflect {

	private int a ;
	public int getA() {
		return this.a;
	}
	/*
	 * ��ȡһ����ķ��������е���Ϣ ע�� ��get�������صĶ���Class���͵Ķ���
	 */
	public static void printMethodsMessage(Object obj) {
		Class c1 = obj.getClass();
		// ��ȡ���͵�����
		System.out.println(c1.getName());
		// ��ȡ������з���
		Method a[] = c1.getDeclaredMethods();// ��ȡ��������з��� ����������
		// Method a[] = c1.getMethods();��ȡ���е�public�����Լ�����̳й����ķ���

		// ��ȡ���з�������Ϣ
		for (Method method : a) {
			// ��ȡ�����ķ���ֵ���� //���صĶ���������
			System.out.print(method.getReturnType().getSimpleName() + " ");
			// ��ȡ����������
			System.out.print(method.getName() + "(");
			Class<?>[] b = method.getParameterTypes();
			for (Class<?> class1 : b) {
				System.out.print(class1.getSimpleName() + ",");
			}
			System.out.print(")");
			System.out.println();
			
		}
	}

	/*
	 * ��ȡ�������Ե���Ϣ
	 * getType ���ص���Class�� ���еĶ���
	 */
	public static void printFieldsMessages(Object obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class c = obj.getClass();
		//��ȡ���г�Ա����Ϣ//������getFields()�ǻ�ȡ�������е�public �� ����̳е�����
		Field a[] = c.getDeclaredFields();
		Field b = c.getDeclaredField("a");
		b.setAccessible(true);
		b.set(obj, 1);
		System.out.println(((Reflect)obj).getA());
		for (Field field : a) {
			//��ȡ���Եķ���ֵ����
			System.out.print(field.getType().getSimpleName() + " ");
			 //��ȡ���Ե�����
			System.out.println(field.getName());
		}
	}

	/*
	 * ��ȡ���췽������Ϣ
	 */
	public static void printConstructors(Object obj) {
		Class c = obj.getClass();
		Constructor a [] = c.getDeclaredConstructors();
		for (Constructor constructor : a) {
			System.out.print(constructor.getName() + " "+"(");
			Class b[] = constructor.getParameterTypes();
			for (Class class1 : b) {
				System.out.print(class1.getSimpleName() + ",");
			}
			System.out.println(")");
		}
	}
	/*
	 * ʹ�÷�����һ�������ķ���
	 */
	public static void reflect(Object obj) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = obj.getClass();
		Method a = c.getDeclaredMethod("add",int.class,int.class);
		a.invoke(obj, 10,20);
	}
	public static void add(int a ,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		String a = "asdf";
		Reflect b = new Reflect();
		Reflect c = new Reflect();
		b.reflect(c);
		printMethodsMessage(b);
		printFieldsMessages(b);
		printConstructors(a);
		
	}
}
