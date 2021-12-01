
public class urheiluKello extends Rannekello {
	
// ominaisuudet
	private int syke;
// metodit
	protected void mittaaSyke(int syke) {
		this.syke = syke;
		System.out.println("Sykkeesi on: " + this.syke);
	}
// tarve vain getterille, setterinä toimii metodi mittaasyke()
	protected int getSyke() {
		return syke;
	}

	public void tiedot() {
		super.muutaTiedot("polar", "urheilu", "L", "L");
		
	}


}
