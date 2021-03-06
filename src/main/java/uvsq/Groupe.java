package uvsq;

import java.util.Iterator;

public class Groupe extends Equipe implements Iterable<Equipe> {

  private final String nom;
  private EquipeIterator<Equipe> head;

  /**
   * Groupe.
   * @param nom String
   */
  public Groupe(String nom) {

    this.nom = nom;
    this.head = new EquipeIterator<Equipe>();
  }

  /**
   * Ajoute une équipe.
   * @param e Equipe
   */
  public void ajoutMembre(Equipe e) {

    this.head.add(e);
  }

  public String getNom() {
    return this.nom;
  }

  public void printNom() {
    System.out.println(this.nom);
    for (Equipe e : this) {
      e.printNom();
    }
  }

  @Override
  public Iterator<Equipe> iterator() {
    // TODO Auto-generated method stub
    return this.head;
  }
}
