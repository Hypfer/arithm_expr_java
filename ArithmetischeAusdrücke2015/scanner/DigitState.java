package scanner;

import symbols.Card;
/**
 * verantworlich dafür, die Characters die eine Zahl repräsentieren, in ein Card-Objekt umzuwandeln, das dieser Zahl entspricht
 */
public class DigitState extends State {
	
	private String collected;

	public DigitState (Scanner scanner) {
		super(scanner);
		this.collected = "";
	}

	@Override
	public void scan (Character c) {
		if (Character.isDigit(c)) {
			collect(c);
			this.getMyScanner().skip();
		}
		else {
//			this.getMyScanner().addSymbol(new Card(Integer.valueOf(collected)));
			this.getMyScanner().addSymbol(new Card(Integer.parseInt(collected)));
			this.getMyScanner().setState(new SelectionState(this.getMyScanner()));
			}
		}
	
	/**
	 * sammelt eine Aneinanderreihung von Character-Ziffern in einem String auf
	 */
	private void collect (Character c) {
		 collected = collected + c;
	}
	
	@Override
	public void finish() {
		this.getMyScanner().addSymbol(new Card(Integer.parseInt(collected)));
	}
	
//	public String getCollected () {
//		return collected;
//	}

}
