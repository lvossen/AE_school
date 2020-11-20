import java.util.Set;

public class LegoKomposition extends LegoBauteil {

	private Set<LegoBauteil> teile;
	
	public double preis() {
		double preis = 0;
		for (LegoBauteil teil : teile) {
			preis += teil.preis();
		}
		return preis;
	}
}
