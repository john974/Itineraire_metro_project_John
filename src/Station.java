/**
 * Representation d'une station
 * @author Comma, Diallo, Minatchy, Ngatcha
 * @version 0.1
 */


import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;


public class Station {

    /*************/
    /* Attributs */
    /************/
    private static int nodeCount=0;
    private int numero;
    private String nom;
    private double tempsArret;
    private boolean incident;
   // private HashMap<Station, Double> adjacents;
   private LinkedList<Adjacent> adjacents = new LinkedList<Adjacent>();

    /******************/
    /* Constructeurs */
    /*****************/
    public Station(String nom, double tempsArret) {
        this.numero = nodeCount++;
        this.nom = nom;
        this.tempsArret = tempsArret;
    }
    public Station(String nom, double tempsArret, boolean incident) {
        this.numero = nodeCount++;
        this.nom = nom;
        this.tempsArret = tempsArret;
        this.incident = incident;
    }



    /**************/
    /* Accesseurs */
    /**************/

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public LinkedList<Adjacent> getAdjacents() { return adjacents; }
    public void setAdjacents(LinkedList<Adjacent> adjacents) { this.adjacents = adjacents; }
    public boolean isIncident() { return incident; }
    public void setIncident(boolean incident) { this.incident = incident; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public double getTempsArret() { return tempsArret; }
    public void setTempsArret(double tempsArret) { this.tempsArret = tempsArret; }


    /************/
    /* Methodes */
    /************/
    public LinkedList<Station>  chemin() {
        Iterator i = adjacents.iterator();
        while(i.hasNext()) {
            Adjacent a = (Adjacent)i.next();
             System.out.println(this.getNom()+"-"+a.getCost()+"-"+ a.getNode().getNom());
        }
        //Collection c adjacents.values();
        //Iterator i = c.iterator();
        

       return  null;
    }

    public void addAdjacent(Adjacent A) {
        this.adjacents.add(A);
        //A.getNode().addAdjacent(new Adjacent(this, A.getCost()));
    }
}
