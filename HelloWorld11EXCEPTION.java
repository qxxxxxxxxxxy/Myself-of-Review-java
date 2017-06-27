package Review;

public class HelloWorld11EXCEPTION {

	public static void main(String[] args) throws InnerException {

		/*
		 * JAVA中有两种处理异常的机制 1.捕获异常try-catch-finally 2.抛出异常throw throws
		 */

		// 1.
		/*
		 * try catch finally中 如果try语句块没有被执行择 finally也不会被执行 catch 可以被省略
		 * finally也可以被省略 但是二者只能省略其中的一个 finally语句中是一定会被执行的 除非有 System.exit(0)
		 * 或者出错了就不会继续执行下去 try catch finally中不能有其它夹杂的代码 除非是注释
		 */
		
		// 2.
		/*
		 * throw throws是配套使用的 throw是手动抛出一个异常
		 */

		// 自定义异常
		/*
		 * 自定义异常必须extends Exception 1.重写getMessage方法 2.手动抛出 继承自Exception类的一个对象
		 */

		// 异常中子类的catch块尽量写在前面 父类的catch块尽量写在后面

		/*
		 * 如果JDK提供的异常类型不能满足需求的时候，程序员可以自定义一些异常类来描述自身程序中的异常信息.
		 * 程序员自定义异常必须是Throwable的直接或间接子类.
		 * 在程序中获得异常信息一般会调用异常对象的getMessage，printStackTrace，toString方法，
		 * 所以自定义异常一般会重写以上三个方法.
		 */
	}

	public class InnerException extends Exception {
		public String getMessage() {
			return "这是一个重写的异常类型";

		}
	}

}
