package ex2;

public class TrainStation2 extends Thread {
	Titickets b;

	public TrainStation2(Titickets a) {
		this.b = a;
	}

	public void run() {
		while (b.getI() <= 100) {
			System.out.println("TrainStation2Âô³öÁËµÚ" + b.sale() + "Æ±");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
