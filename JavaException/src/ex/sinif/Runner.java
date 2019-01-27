package ex.sinif;

public class Runner {

	public static double test(int sayi, int sayi1) throws HataSinifi
	{
		double sonuc=0;
		
		if(sayi1==0)
		{
			throw new HataSinifi(101, "Ikinci Sayi Sifir Olamaz...!!!");
		}
		
		sonuc = (double)sayi/sayi1;
		
		return sonuc;
	}
	
	public static void main(String[] args) {
		try {
			test(12,0);
		} catch (HataSinifi e) {
			e.printStackTrace();
			System.out.println("Hata Kodu:"+e.getHataKodu()); //getter'imizdaki hatakodu
			System.out.println("Hata Mesaji:"+e.getMessage()); 
			System.out.println("Hata Sebebi:"+e.getCause());
			System.out.println("Hata:"+e.getSuppressed());
		}
	}

}
