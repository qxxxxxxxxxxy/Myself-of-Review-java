package Review;

public class HelloWorld345 extends HelloWorld123{
	
	public HelloWorld345() {
		int c = super.a;
	}
	
	public static void main(String[] args) {
		System.out.println("第四章类和对象");
		System.out.println("********************");
		//面向对象的设计思想 oop
		//注意是音容才能改变值的大小
		System.out.println("第五章");
		System.out.println("*********************");
		/*
		 * public 在哪都可以访问到的成员
		 * protected 是在子孙类可以被继承和同一个包类可以访问到的
		 * 缺省      这个是在同一个包可以访问到的
		 * private 只是在本类中可以访问到的
		 */
		
		/*
		 * super关键字 可以用super.属性调用父类的方法和属性 
		 * 子类只能访问父类的protected和public的方法
		 * 包含抽象方法的类必须被声明成抽象的 抽象类没有实体 不能有大括号包围
		 * 子类继承抽象类必须实现抽象类中所有的方法 要不然也必须声明为抽象类
		 * public abstract class {
		 * 		public abstract void c ();
		 * }
		 */
		
		//接口的概念
		/*
		 * 接口的意义弥补java中单继承的不足
		 * 接口的定义   接口中的类也是抽象类
		 * 接口可以继承多个
		 * interface jiekou {
		 *  	int compare(Object other);	 
		 * }
		 */
		
		//方法重写和方法重载
		
		/*
		 * 方法重写 
		 * 
		 * 返回值类型一致
		 * 方法名一致
		 * 参数列表一致
		 * 不能缩小访问权限
		 * 不能重写被final修饰的方法 equlas() 方法除外
		 * 不能被继承的方法不能重写
		 */
		
		/*
		 * 方法重载
		 * 
		 * 方法名一致
		 * 参数列表必须不同(包括值类型 参数的个数)
		 * 返回值类型不作为重载的标准
		 * 是否为静态不作为重载的标准
		 */
		
	}
}
