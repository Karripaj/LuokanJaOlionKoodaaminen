
public class urheiluKello extends Rannekello {
	
	private int syke;
	
	protected void mittaaSyke(int syke) {
		this.syke = syke;
		System.out.println("Sykkeesi on: " + this.syke);
	}

}
