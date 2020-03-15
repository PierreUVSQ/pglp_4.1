package uvsq;

import java.util.Iterator;

public class EquipeIterator<Equipe> implements Iterator<Equipe>{

	private int index;
	private Equipe e;
	private EquipeIterator<Equipe>previous = null;
	private EquipeIterator<Equipe> next= null;
	@Override
	public boolean hasNext() {
		if(next != null) {
			return true;
			
		}
		return false;
	}

	@Override
	public Equipe next() {
		System.out.println("here");
		index ++;
		return next.e;
	}


	public void add(Equipe n) {
		
		System.out.println("adding");
		if(e == null)
			this.e = n;
		else {
			
			next = new EquipeIterator<Equipe>();
			next.previous = this;
			next.e = n;
		}
	}
	
	public EquipeIterator<Equipe> getNext(){
		
		return next;
		
	}

	public EquipeIterator<Equipe> getPrevious(){

		return this.previous;

	}
	

}
