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
	 * 获取一个类的方法的所有的信息 注意 用get函数返回的都是Class类型的东西
	 */
	public static void printMethodsMessage(Object obj) {
		Class c1 = obj.getClass();
		// 获取类型的名字
		System.out.println(c1.getName());
		// 获取类的所有方法
		Method a[] = c1.getDeclaredMethods();// 获取本类的所有方法 不包括父类
		// Method a[] = c1.getMethods();获取所有的public方法以及父类继承过来的方法

		// 获取所有方法的信息
		for (Method method : a) {
			// 获取方法的返回值类型 //返回的都是类类型
			System.out.print(method.getReturnType().getSimpleName() + " ");
			// 获取方法的名字
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
	 * 获取所有属性的信息
	 * getType 返回的是Class类 所有的都是
	 */
	public static void printFieldsMessages(Object obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class c = obj.getClass();
		//获取所有成员的信息//或者用getFields()是获取的是所有的public 和 父类继承的属性
		Field a[] = c.getDeclaredFields();
		Field b = c.getDeclaredField("a");
		b.setAccessible(true);
		b.set(obj, 1);
		System.out.println(((Reflect)obj).getA());
		for (Field field : a) {
			//获取属性的返回值类型
			System.out.print(field.getType().getSimpleName() + " ");
			 //获取属性的名字
			System.out.println(field.getName());
		}
	}

	/*
	 * 获取构造方法的信息
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
	 * 使用反射用一个函数的方法
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
