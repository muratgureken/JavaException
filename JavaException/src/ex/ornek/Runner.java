package ex.ornek;

public class Runner {
	public static int test(int sayi1, int sayi2)
	{
		try {
			System.out.println(2);

			if(sayi1>sayi2)
			{
				throw new RuntimeException("5"); //throw exception en yakindaki catch'e gidiyor, o da alt satirdaki catch
			}
			return 6;
		}catch(Exception e) {
			System.out.println(3);
			System.out.println(e.getMessage());
			throw new RuntimeException("4",e); //sirada en yakindaki catch'e gidiyor. O da main'de siradaki catch dd
		}finally{
			System.out.println(9);
		}
	}

	public static void main(String[] args) {
		System.out.println("Basladi");
		try {
			System.out.println(test(3,2));
		} catch (Exception e) { //dd
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
		}
		System.out.println("Bitti");
	}

}
