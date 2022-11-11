public class Segitiga extends BangunDatar{
	private int alas = 7;
	private int tinggi = 8;
	
	public float luas(){
		System.out.println("Menghitung Luas Segitiga");
		System.out.println("Alas = " + alas);
		System.out.println("Tinggi = " + tinggi);
		System.out.println("Luas Segitiga = " + (alas * tinggi / 2) + " cm");
			return 1;
	}
	
	public float keliling(){
		double sisi = Math.sqrt(alas*alas + tinggi*tinggi);
		System.out.println("Menghitung Keliling Segitiga");
		System.out.println("Alas = " + alas);
		System.out.println("Tinggi = " + tinggi);
		System.out.println("Keliling Segtiga = " + (sisi + tinggi + alas) + " cm");
		return 1;
	}
}