package Review;

import java.util.Arrays;

public class HelloWorld123 {
	public int a = 1;

	public static void main(String[] args) {
		System.out.println("我是第一章 我要开始复习啦");
		System.out.println("***************************");
		/*
		 * java标识符只能由数字，字母下划线美元符号组成 只能以字母 下划线或者美元符号开头
		 * 标识符不能是java中的关键字
		 */
		
		//数据类型 
		
		/*
		 *整数类型 byte short int long 
		 *浮点类型 double float 
		 *字符类型 char(2个字节)
		 *布尔类型 boolean 
		 */
		Integer a = 1;
		int b = 1;
		int c = 2; 
		System.out.println("instanceof的用法");
		System.out.println(a instanceof Integer);
		int d = b>c?a:c;
		System.out.println(d);
		
		System.out.println("第三章复习");
		System.out.println("******************");
		
		int ac [] = {1,2,3,4};
		//给长度的时候该是几就是几就行了 所以这里长度应该是4
		int ad [] =Arrays.copyOf(ac, 4);
		//给元素都赋值成1
		Arrays.fill(ad, 1);
		for (int i : ad) {
			System.out.print(i + " ");
		}
	}

}
