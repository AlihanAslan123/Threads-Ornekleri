import java.util.ArrayList;


public class Main {

	static ArrayList<Integer>  tek = new ArrayList<>();
	static ArrayList<Integer> cift = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Integer> sayilar = new ArrayList<>(); // sayilar diye bir arraylist oluşturuyorum.
		
		for(int i= 1 ; i<=10000; i++) {  
			sayilar.add(i);			// sayılar arraylistinin içine 1 den 10.000 olana kadar olan sayıları ekliyorum.
		}
		
		// sayilar arraylistinin 4 eşit listeye bölüyorum.
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		ArrayList<Integer> ar3 = new ArrayList<>();
		ArrayList<Integer> ar4 = new ArrayList<>();
		
		
		for(int x : sayilar) {
			if(x<=2500) {
				ar1.add(x);
			}else if(x <= 5000 && x>2500) {
				ar2.add(x);
			}else if(x<=7500 && x > 5000) {
				ar3.add(x);
			}else if(x <= 10000 && x > 7500) {
				ar4.add(x);
			}
		}
		
		
		Thread t1 = new Thread(new Parca(ar1));
		Thread t2 = new Thread(new Parca(ar2));
		Thread t3 = new Thread(new Parca(ar3));
		Thread t4 = new Thread(new Parca(ar4));
		t1.start();t2.start();t3.start();t4.start(); // başlatıyoruz.
		t1.join();t2.join();t3.join();t4.join(); // bitmelerini bekliyoruz.
		
		System.out.println("****************************");
		System.out.println("Tek liste: "+tek);
		System.out.println("***************************");
		System.out.println("Çift Liste: "+cift);


  }
	
}
