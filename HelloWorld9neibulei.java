package Review;

public class HelloWorld9neibulei {

	/*
	 * 内部类 内部类的特点 可以自由的访问外部类的任何成员(包括私有成员)，但是外部类不能直接访问内部类的成员。
	 * 内部类可以为静态，可以用protected、private修饰 外部类只能用public 和 缺省修饰
	 * 内部类也可以继承别的类和接口
	 */

	private int a = 1;

	/*
	 * 成员内部类 成员内部类的实质就是相当于类的一个属性
	 */

	public class InnerHelloWorld9 {
		public int c = HelloWorld9neibulei.this.a;
	}

	/*
	 * 局部内部类 用一个函数包裹起来的类 类的使用范围只在这个函数里面可以使用 且是在类下面的代码中才能调用 局部内部类可以调用外包方法外的一切成员 和
	 * 成员内部类一样
	 */
	// 成为局部内部类的外包方法
	public void set() {
		class jubuneibulei {
			public void a() {
				System.out.println("我是一个局部内部类");
				// 调用外部类的私有属性
				int s = HelloWorld9neibulei.this.a;
			}
		}
		// 调用局部内部类
		jubuneibulei c = new jubuneibulei();
		c.a();
	}

	/*
	 * 匿名内部类 只使用一次的类 匿名内部类没有类名 而且必须继承一个类或者是一个接口 而且不能有显示的直接extends 和 implements
	 * 代码的存在 匿名内部类就是局部内部类不写类名得来的
	 */
	interface Inter {
		public void display();

	}

	// 外包函数
	public void print() {
		Inter a = new Inter() {
			public void display() {
				System.out.println("我是匿名内部类");
			}
		};// 匿名内部类定义完成
		a.display();
	}
	
   /*
    * 静态内部类  静态内部类定义在类中 不在任何方法中实现 用static 修饰
    * 静态内部类能直接访问外部类的静态成员 不能直接访问外部类的实力成员
    * 静态内部类中可以定义静态成员，其它内部类不可以 
    */
	public static class Stat {
		
	}
	public static void main(String[] args) {

		HelloWorld9neibulei.InnerHelloWorld9 Inner = new HelloWorld9neibulei().new InnerHelloWorld9();// 直接定义一个内部类的对象
		System.out.println(Inner.c);
		//静态内部类的成员可以直接生成
		Stat c = new Stat();
	}

}
