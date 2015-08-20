package scanner;
/**
 * Scanner State - Status für Scanner-Objekte
 */
public abstract class State {
	
	private Scanner myScanner;
	
	/**
	 * Konstruktor mit einem Scanner als Parameter
	 */
	public State (Scanner scanner) {
		this.myScanner = scanner;
	}
	
	/**
	 * Verarbeitet das Zeichen c und wechselt ggf. den Zustand
	 */
	public abstract void scan (Character c);
	
	public Scanner getMyScanner () {
		return this.myScanner;
	}
	
//	public abstract String getCollected();
	
	/**
	 * wird am Ende der Funktion toSymbolSequence ausgeführt;
	 * falls letztes Zeichen im String expr ein Digit ist, fügt es den Digit zu der Liste currentResult hinzu
	 * Let the current state finish its business if it's a state which deals with a multi digit-char symbol
	 */
	public abstract void finish ();
}
