package uvsq;

import java.util.Iterator;

public class EquipeIterator<Equipe> implements Iterator<Equipe> {

  private int index;
  private Node<Equipe> e;

  @Override
  public boolean hasNext() {
    if (e != null) {
      return true;
    }
    return false;
  }

  @Override
  public Equipe next() {
    Equipe tmp = e.getElement();
    e = e.getNext();
    index++;
    return tmp;
  }

  /**
   * Ajout dans l'itérateur.
   *
   * @param n équipe
   */
  public void add(Equipe n) {

    if (e == null) {
      this.e = new Node<Equipe>(n);
    } else {

      this.e.addElement(n);
    }
  }
}
