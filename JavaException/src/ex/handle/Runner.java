package ex.handle;

public class Runner {

	public static int hesapla(int bolum) throws ArithmeticException //bu fonksiyonu cagiran class'larda try/catch kullanmayi zorunlu kiliyor.
	{
		return 5/bolum;
	}
	
	public static void main(String[] args) {
		System.out.println("program basladi.");
		
		try {
			hesapla(0); //exceptiýn'lari kontrol ediyor.exceptipn cikmazsa catch calismaz ama finally her turlu calisir.	
		} catch (Exception e) {
			e.printStackTrace(); //istersen exception'i bas. basmayabilirsin.
			System.out.println("murat");
		}
		finally {
			System.out.println("final'a geldik.");
		}
		
		System.out.println("program bitti.");
	}

}
