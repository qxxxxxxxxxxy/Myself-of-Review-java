package Review;

public class HelloWorld8baozhuangqilei {

	public static void main(String[] args) {
		//java 屁屁踢 第八章
		
		/*
		 * 包装器类
		 * 
		 * review 八种基本类型   
		 * byte -> Byte 
		 * short -> Short 
		 * int ->Integer
		 * long ->Long
		 * float ->Float
		 * double ->Double
		 * char ->Character
		 * boolean ->Boolean
		 */
		
		/*
		 * 	创建包装器类的两种方法
		 *  对象赋值不能再次改变
		 *  装箱和拆箱的时候 引用类型的地址都会改变 不是原来的值
		 */
		Integer i = new Integer(1);
		Integer q = Integer.valueOf(i);
		//拆箱过程中原地址改变的原因
		//先拆箱再装箱的过程
		int c = q.intValue();
		c++;
		Integer a = Integer.valueOf(c);
		//重载给装箱带来不便  参数匹配的时候应该
		
		/* 直接匹配
		 * 先把类型加宽看看是否能匹配
		 * 装箱是否能匹配
		 * 是否有不定长参数能匹配的
		 * 先装箱后加宽后能否匹配
		 */
	}

}
