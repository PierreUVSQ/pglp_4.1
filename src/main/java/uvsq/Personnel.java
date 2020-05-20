package uvsq;

import java.util.Collections;
import java.util.List;

public final class Personnel extends Equipe {

  private final String nom;
  private final String prenom;
  private final String fonction;
  private final List<String> telephone;
  private final java.time.LocalDate dateNaissance;

  public static class Builder {

    private final String nom;
    private final String prenom;
    private final String fonction;
    private List<String> telephone = null;
    private java.time.LocalDate dateNaissance = java.time.LocalDate.now();

    /**
     * Buider.
     *
     * @param nom nom
     * @param prenom prenom
     * @param fonction fonction
     */
    public Builder(String nom, String prenom, String fonction) {

      this.nom = nom;
      this.prenom = prenom;
      this.fonction = fonction;
    }

    /**
     * Modifie le numero de téléphone.
     *
     * @param phone numéro
     * @return builder
     */
    public Builder updatePhoneList(List<String> phone) {

      this.telephone = phone;

      return this;
    }

    /**
     * Change la date de naissance.
     * @param t date
     * @return builder
     */
    public Builder updateDateNaissance(java.time.LocalDate t) {

      this.dateNaissance = t;

      return this;
    }

    /**
     * Renvoie le personnel construit.
     * @return Personnel
     */
    public Personnel build() {

      return new Personnel(this);
    }
  }

  /**
   * Personnel.
   * @param build Builder de personnel
   */
  private Personnel(Builder build) {

    this.nom = build.nom;
    this.prenom = build.prenom;
    this.fonction = build.fonction;
    this.telephone = build.telephone;
    this.dateNaissance = build.dateNaissance;
  }

  public String getNom() {
    return this.nom;
  }

  public List<String> getTel() {

    return Collections.unmodifiableList(this.telephone);
  }

  public java.time.LocalDate getLocalDate() {

    return this.dateNaissance;
  }

  /**
   * Affiche le nom.
   */
  public void printNom() {
    System.out.println(this.nom);
  }
}
