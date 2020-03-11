package uvsq;

import java.util.List;

public class Annuaire {

	private static Annuaire ANNUAIRE;
	public List<Equipe> hierarchie; 
	
	private Annuaire() {
		
		
		
		
	}
	
	public static Annuaire getInstance() {
		
		if (ANNUAIRE == null)
			ANNUAIRE = new Annuaire();
		
		return ANNUAIRE;
	}

	
}
