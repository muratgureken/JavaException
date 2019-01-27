package ex.sinif;

public class HataSinifi extends Exception{
	private int hataKodu;
	private String hataMesaji;
	
	public HataSinifi(int hataKodu, String hataMesaji) {
		super(hataMesaji);//hata normal exceptiondaki gibi gorunsun istiyorsak super'ini cagirmamiz gerekiyor.
		this.hataKodu = hataKodu;
		this.hataMesaji = hataMesaji;
	}
	
	public int getHataKodu()
	{
		return this.hataKodu;
	}
}
