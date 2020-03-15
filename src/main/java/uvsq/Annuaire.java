package uvsq;

import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

public class Annuaire implements Iterable<Equipe> {

	private static Annuaire ANNUAIRE;
	private EquipeIterator<Equipe> head;
	private Annuaire() {
		head = new EquipeIterator<Equipe>();
		
	}
	
	public static Annuaire getInstance() {
		
		if (ANNUAIRE == null)
			ANNUAIRE = new Annuaire();
		
		return ANNUAIRE;
	}

	@Override
	public Iterator<Equipe> iterator() {

		return this.head;
	}

	
	public void addEquipe(Equipe e) {

		this.head.add(e);
		
	}
	
	
}
