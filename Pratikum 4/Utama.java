public class Utama {
	public static void main (String[] args){
		
		Lingkaran lingkaran = new Lingkaran();
		Segitiga segitiga = new Segitiga();
		Persegi persegi = new Persegi();
		
		lingkaran.luas();
		lingkaran.keliling();

		System.out.println();

		segitiga.luas();
		segitiga.keliling();
		
        System.out.println();
        
		persegi.luas();
		persegi.keliling();

	}
}