
class Araba{
	
	

	public String Renk;
	public int kapilar;
	public int tekerlekler;
	public String motor;
	public String model;
	
	/*

	public String Renk;
	private int kapilar;
	private int tekerlekler;
	private String motor;
	private String model;
	*/
	
}




public class Main {

	public static void main(String[] args) {

		Araba araba1 =new Araba();
		
	araba1.Renk="Kırmızı";
	araba1.kapilar=4;
	araba1.tekerlekler=16;
	araba1.motor="16v";
	araba1.model="model";
	
	System.out.println(araba1.motor);
		
		
	}
}
