import java.util.ArrayList;


public class Parca implements Runnable{
	

	ArrayList<Integer> liste = new ArrayList<>();
	
	public Parca(ArrayList<Integer> liste) {
		this.liste = liste;
	}

	@Override
	public void run() {
		
		for(int x : liste) {
			if(x%2==0) {
				ciftekle(x);
			}
			else {
				tekEkle(x);
			}
		}

	}
	
	private synchronized void ciftekle(int x) {
		synchronized (Main.cift) {
			Main.cift.add(x);
		}
	} 
	private synchronized void tekEkle(int x) {
		synchronized (Main.tek) {
			Main.tek.add(x);
		}
	}

}
