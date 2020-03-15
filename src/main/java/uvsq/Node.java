package uvsq;

public class Node<T> {

	private Node<T> precedent = null;
	private Node<T> suivant = null;
	private T element;
	
	public Node(T element){
		
		this.element = element;
		
	}
	
	public void addElement(T suivant) {
		
		if (this.suivant == null) {
			this.suivant = new Node<T>(suivant);
			this.suivant.precedent = this;
		}
		else 
			this.suivant.addElement(suivant);
		
		
	}
	
	public T getElement() {
		
		return this.element;
	}
	
	public void remove() {
		
		this.precedent.suivant = this.suivant;
		this.suivant.precedent = this.precedent;
		this.element = null;
		this.suivant = null;
		this.precedent = null;
	}
	
	public boolean hasNext() {
		
		if (this.suivant != null) return true;
		else return false;
	}
	
	public Node<T> getNext() {
		
		return this.suivant;
	}
	
}
