package tho.nill.kassenversand.versandziel;

import entities.VersandZiel;

public interface VersandZielFilter {
	int bewertung(VersandZiel ziel);
	void append(StringBuilder builder);
}
