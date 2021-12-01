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
		olio3.tulostaTiedot();
		olio3.muutaTiedot("Polar","2.1","L","L");
		olio3.tulostaTiedot();
		
		
		
		
	}

} //LOPPU

class Rkello{
	
	// scanner ajan ja pvm asetusta varten
	Scanner in = new Scanner(System.in);
	
	//muuttujia**********************************************************
	String aika = "";
	String pvm = "";
	
	
	// luokan parametrit*************************************************
	public String merkki;
	public String malli;
	public String koko;
	public String rannenauhanKoko;
	
	
	//muodostin *************************************************************
	public Rkello() {
		merkki = "Merkki";
		malli = "Malli";
		koko = "Koko";
		rannenauhanKoko = "Rannenauhan koko";
	}
	
	//luokan metodit ************************************************
	
	// toinen kohdan 6 tapa muuttaa tiedot
	public void muutaTiedot(String merkkiUusi, String malliUusi, String kokoUusi, String rannenauhanKokoUusi) {
		merkki = merkkiUusi;
		malli = malliUusi;
		koko = kokoUusi;
		rannenauhanKoko = rannenauhanKokoUusi;
	}
	// kohta 5.
	public void tulostaTiedot() {
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Koko: " + koko);
		System.out.println("Rannenauhan koko: " + rannenauhanKoko);
	}
	
	public void naytaAika() {
		System.out.println("Kello on: " + aika);
	}
	
	public void naytaPvm() {
		System.out.println(pvm);
	}
	
	public void asetaAika() {
		System.out.println("Aseta aika:");
		aika = in.nextLine();
	}
	
	public void asetaPvm(String pvm) {
		
		this.pvm = pvm;
	}
}

