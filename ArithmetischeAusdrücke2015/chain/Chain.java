package chain;

import scanner.Scanner;
import scanner.State;

public class Chain {
	private ChainLink firstLink;
	private Scanner myScanner;
	
	public Chain(Scanner scanner) {
		this.myScanner = scanner;
		this.firstLink = new WhitespaceChainLink(this.myScanner);
	}
	
	public State matchState(Character c) {
		return this.firstLink.matchState(c);
	}
}
