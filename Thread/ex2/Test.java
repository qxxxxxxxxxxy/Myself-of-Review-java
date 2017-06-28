package ex2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titickets a = new Titickets();
		Thread first = new TrainStation1(a);
		Thread second = new TrainStation2(a);
		Thread third = new TrainStation3(a);
		second.start();
		first.start();
		third.start();
		System.out.println(a.getClass());
	}

}
