package chain;

import scanner.Scanner;

public abstract class ChainLinkWithNext extends ChainLink {
	
	private ChainLink nextLink;

	public ChainLinkWithNext(Scanner scanner) {
		super(scanner);
	}
	
	public ChainLink getNextLink() {
		return this.nextLink;
	}

	public void setNextLink(ChainLink nextLink) {
		this.nextLink = nextLink;
	}
	
}