package scanner;
/**
 * Responsible for processing whitespace (e.g. space, tab, return)
 */
public class WhitespaceState extends State {

	public WhitespaceState(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void scan (Character c) {
		this.getMyScanner().skip(); // holt von diesem (this) state den Scanner (jeder State hat einen myScanner), und macht auf diesen Scanner die Methode skip(), d.h. er überspringt das Zeichen im String (da es in diesem Fall hier halt ein WhiteSpaceState ist, also ein leeres Zeichen)
		this.getMyScanner().setState((new SelectionState(this.getMyScanner()))); // erst Scanner von diesem State holen, dann diesen in neuen SelectionState packen, und diesen SelectionState mit diesem Scanner dann als State von diesen Scanner setzen
	}																			 // also im Grunde genommen, wird hier dem aktuellen Scanner der SelectionState zugewiesen mit dem Scanner drin

	@Override
	public void finish() {		
	}

//	@Override
//	public String getCollected() {
//		return null;
//	}

}
