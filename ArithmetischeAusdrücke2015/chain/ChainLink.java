package chain;

import scanner.Scanner;
import scanner.SelectionState;
import scanner.State;

public abstract class ChainLink {
	
	private Scanner myScanner;
	
	public ChainLink(Scanner scanner) {
		this.myScanner = scanner;
	}
	
	public Scanner getMyScanner() {
		return this.myScanner;
	}
	
	public State matchState(Character c) {
		return new SelectionState(this.myScanner); //TODO: ??? Ist das sinnvoll?
	}
	
}
