package Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HelloWorld12JARandFanxing {

	public static void main(String[] args) {
		// �����ͷ���

		/*
		 * List Set Queue Map ���Ǽ̳���Collection�Ľӿ�
		 */

		// List(�б�) ���ĵ�������(�����Ĭ�ϵĴ�С��10)
		/*
		 * 1.����������˳��洢 2.���Դ洢�ظ�Ԫ�� ArrayList ���Ա� ���ٵ��� ��������ɾ�� LinkedList ���ٲ���ɾ��
		 * ������Ϊ��
		 * 
		 * add(E e)����ָ����Ԫ����ӵ����б��β�� add(int index, E element)����ָ����Ԫ�ز�����б��е�ָ��λ��
		 * remove(int index)���Ƴ����б���ָ��λ���ϵ�Ԫ�� get(int index)�����ش��б���ָ��λ���ϵ�Ԫ��
		 * set(int index, E element)����ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ�� size()�����ش��б��е�Ԫ����
		 */

		// LinkedList
		/*
		 * ������Ϊ�� ����ɾ���ȽϿ�
		 */

		// Set ����򵥵�һ�ּ���
		/*
		 * 1.����Ψһ�� 2.���ܴ洢�ظ���Ԫ��
		 */

		// HashSet LinkedHashSet TreeSet
		// TreeSet Ԫ�ص���Ȼ˳���������������

		/*
		 * HashSet add(E e)������� set ����δ����ָ��Ԫ�أ������ָ��Ԫ�� clear()���Ӵ� set ���Ƴ�����Ԫ��
		 * remove(Object o)�����ָ��Ԫ�ش����ڴ� set �У������Ƴ� size()�����ش� set �е�Ԫ�ص�������set
		 * �������� isEmpty()������� set �������κ�Ԫ�أ��򷵻� true
		 */

		/*
		 * HashSet ���ܱ�֤Ԫ�ص�����˳��˳���п��ܷ����仯 ����ͬ���ģ�����Ԫ�ؿ�����null,��ֻ�ܷ���һ��null
		 * ��ϣ����ͨ��ʹ�ó�Ϊɢ�з��Ļ������洢��Ϣ�ģ�Ԫ�ز�û����ĳ���ض�˳������ţ� LinkedHashSet
		 * ��Ԫ�ز����˳����ά�����ϵ����ӱ������Բ����˳���ڼ����е����� �������ܱ�HashSet�ã����ǲ���ʱ������΢ѷɫ��HashSet
		 * TreeSet �ṩһ��ʹ�����ṹ�洢Set�ӿڵ�ʵ�֣�����������˳��洢�����ʺͱ�����ʱ��ܿ죻
		 */

		// Map�ӿ�

		/*
		 * Map�Լ�ֵ�Ե���ʽ���� keyֵֻ��Ψһ�Ĵ��� ��valueֵ�����ظ��Ĵ��� ������ Set c = new
		 * HashMap().keySet();��ȡkey������ֵ ������Collection n = new HashMap.values();
		 * ��ȡ���е�valueֵ ͬ�����õ��������Ե��� �� put()������Map���������
		 */
		Map s = new HashMap();
		// ��ȡ���е�keyֵ
		Set d = s.keySet();
		// ��Ϊset�����������ֻ���õ������ķ���������
		for (Object object : d) {
			s.get(object);// �������е�valueֵ
		}
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		// �����ָ�����͵Ļ�����ͻᱨ�� get�������ص���Object���͵�
		int c = (Integer) a.get(0);
		// int c = (Object)a.get(0); �������ȷд�� ���ָ���˷��;�û�¶���

		
		// ���ͼ���˵�����ƶ�����������
		/* ����
		 * �����������������͵��κ������� void addAnimal(List<? extends Animal> animals)
		 * Animal���������ӿ� ���ܸ����͵ı��� void addAnimal(List<? super Dog> animals)
		 * ����super�ұ����ͻ��䳬���� List<?> ��List<? extents Object>��ȫ��ͬ
		 * List<Object>��List<?>��ȫ��ͬ
		 */
	}

}
