package ex2;

public class TrainStation3 extends Thread {
    Titickets b;
	public  TrainStation3(Titickets a) {
		this.b = a;
	}
	public void run() {
		while(b.getI() <= 100) {
			System.out.println("TrainStation3Âô³öÁËµÚ" + b.sale() + "Æ±");
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

