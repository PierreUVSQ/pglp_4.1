package uvsq;

import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

public class Annuaire implements Iterable<Equipe> {

	private static Annuaire ANNUAIRE;
	private EquipeIterator<Equipe> head;
	private EquipeIterator<Equipe> tail;
	private Annuaire() {
		
		
	}
	
	public static Annuaire getInstance() {
		
		if (ANNUAIRE == null)
			ANNUAIRE = new Annuaire();
		
		return ANNUAIRE;
	}

	@Override
	public Iterator<Equipe> iterator() {
		// TODO Auto-generated method stub
		return this.head;
	}

	
	public void addEquipe(Equipe e) {
		
		if(this.head == null) {
			this.head = new EquipeIterator<Equipe>();
			this.head.add(e);
		}
		else if(this.tail == null) {
			
			this.head.add(e);
			this.tail = this.head.getNext();
		}
		else {
			
			this.tail.add(e);
			this.tail = this.tail.getNext();
		}
	}
	
	
}
