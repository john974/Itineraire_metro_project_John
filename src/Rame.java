/**
 * Une rame de metro
 * @author Comma, Diallo, Minatchy, Ngatcha
 * @version 0.1
 */

public class Rame {

    /*************/
    /* Attributs */
    /*************/
    private int numero;
    private String nom;
    private int numeroDeLigne;


    /*****************/
    /* Constructeurs */
    /*****************/
    public Rame(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }


    /**************/
    /* Accesseurs */
    /*************/
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public int getNumeroDeLigne() { return numeroDeLigne; }
    public void setNumeroDeLigne(int numeroDeLigne) { this.numeroDeLigne = numeroDeLigne; }


    /************/
    /* Methodes */
    /************/
    
}
