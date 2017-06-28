package ex2;

public class Titickets {

	public int getI() {
		return i;
	}
	private int i = 1;
	public  synchronized int sale() {
		if(i < 100) {
			return this.i++;	
		} else {
			return i++;
		}
		
	}
}
