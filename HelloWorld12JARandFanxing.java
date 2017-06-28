package Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HelloWorld12JARandFanxing {

	public static void main(String[] args) {
		// 容器和泛型

		/*
		 * List Set Queue Map 都是继承自Collection的接口
		 */

		// List(列表) 关心的是索引(构造的默认的大小是10)
		/*
		 * 1.对象按照索引顺序存储 2.可以存储重复元素 ArrayList 线性表 快速迭代 少量插入删除 LinkedList 快速插入删除
		 * 迭代较为慢
		 * 
		 * add(E e)：将指定的元素添加到此列表的尾部 add(int index, E element)：将指定的元素插入此列表中的指定位置
		 * remove(int index)：移除此列表中指定位置上的元素 get(int index)：返回此列表中指定位置上的元素
		 * set(int index, E element)：用指定的元素替代此列表中指定位置上的元素 size()：返回此列表中的元素数
		 */

		// LinkedList
		/*
		 * 迭代较为慢 插入删除比较快
		 */

		// Set 是最简单的一种集合
		/*
		 * 1.关心唯一性 2.不能存储重复的元素
		 */

		// HashSet LinkedHashSet TreeSet
		// TreeSet 元素的自然顺序进行升降序排序

		/*
		 * HashSet add(E e)：如果此 set 中尚未包含指定元素，则添加指定元素 clear()：从此 set 中移除所有元素
		 * remove(Object o)：如果指定元素存在于此 set 中，则将其移除 size()：返回此 set 中的元素的数量（set
		 * 的容量） isEmpty()：如果此 set 不包含任何元素，则返回 true
		 */

		/*
		 * HashSet 不能保证元素的排列顺序，顺序有可能发生变化 不是同步的，集合元素可以是null,但只能放入一个null
		 * 哈希表是通过使用称为散列法的机制来存储信息的，元素并没有以某种特定顺序来存放； LinkedHashSet
		 * 以元素插入的顺序来维护集合的链接表，允许以插入的顺序在集合中迭代； 遍历性能比HashSet好，但是插入时性能稍微逊色于HashSet
		 * TreeSet 提供一个使用树结构存储Set接口的实现，对象以升序顺序存储，访问和遍历的时间很快；
		 */

		// Map接口

		/*
		 * Map以键值对的形式存在 key值只能唯一的存在 而value值可以重复的存在 可以用 Set c = new
		 * HashMap().keySet();抽取key的所有值 可以用Collection n = new HashMap.values();
		 * 抽取所有的value值 同样的用迭代器可以迭代 用 put()函数往Map里存入数据
		 */
		Map s = new HashMap();
		// 抽取所有的key值
		Set d = s.keySet();
		// 因为set是无序的所以只能用迭代器的方法来遍历
		for (Object object : d) {
			s.get(object);// 迭代所有的value值
		}
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		// 如果不指定泛型的话这里就会报错 get函数返回的是Object类型的
		int c = (Integer) a.get(0);
		// int c = (Object)a.get(0); 这个是正确写法 如果指定了泛型就没事儿了

		
		// 泛型简单来说就是制定容器的类型
		/* 泛型
		 * 接受所声明变量类型的任何子类型 void addAnimal(List<? extends Animal> animals)
		 * Animal可以是类或接口 接受父类型的变量 void addAnimal(List<? super Dog> animals)
		 * 接受super右边类型或其超类型 List<?> 与List<? extents Object>完全相同
		 * List<Object>与List<?>完全不同
		 */
	}

}
