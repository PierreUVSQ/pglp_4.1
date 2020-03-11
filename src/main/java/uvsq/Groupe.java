package uvsq;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Equipe{

	private final String nom;
	private List<Equipe> list;
	
	
	public Groupe(String nom) {
		
		this.nom = nom;		
		list = new ArrayList<Equipe>(); 
	}
	
	public void ajoutMembre(Personnel p) {
		
		list.add(p);
		
	}
	
}
