import java.util.Scanner;
public class Rannekello {
	
	public static void main(String[] args) {
		
		Rkello olio1 = new Rkello();
		olio1.asetaPvm("01.01.2021");
		olio1.naytaPvm();
		Rkello olio2 = new Rkello();
		olio2.asetaAika();
		olio2.naytaAika();
		Rkello olio3 = new Rkello();
		olio3.muutaTiedot("Polar","2.1","L","L");
		
		
		
		
	}

} //LOPPU

class Rkello{
	
	// scanner ajan ja pvm asetusta varten
	Scanner in = new Scanner(System.in);
	
	//muuttujia**********************************************************
	String aika = "";
	String pvm = "";
	
	
	// luokan parametrit*************************************************
	private String merkki;
	private String malli;
	private String koko;
	private String rannenauhanKoko;
	
	
	//muodostin *************************************************************
	public Rkello() {
		merkki = "Merkki";
		malli = "Malli";
		koko = "Koko";
		rannenauhanKoko = "Rannenauhan koko";
	}
	
	//luokan metodit ************************************************
	
	// toinen kohdan 6 tapa muuttaa tiedot
	protected void muutaTiedot(String merkkiUusi, String malliUusi, String kokoUusi, String rannenauhanKokoUusi) {
		merkki = merkkiUusi;
		malli = malliUusi;
		koko = kokoUusi;
		rannenauhanKoko = rannenauhanKokoUusi;
		tulostaTiedot();
	}
	// kohta 5.
	private void tulostaTiedot() {
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Koko: " + koko);
		System.out.println("Rannenauhan koko: " + rannenauhanKoko);
	}
	
	protected void naytaAika() {
		System.out.println("Kello on: " + aika);
	}
	
	protected void naytaPvm() {
		System.out.println(pvm);
	}
	
	protected void asetaAika() {
		System.out.println("Aseta aika:");
		aika = in.nextLine();
	}
	
	protected void asetaPvm(String pvm) {
		
		this.pvm = pvm;
	}
}

