/**
 * Classe principale
 * @author Comma, Diallo, Minatchy, Ngatcha
 * @version 0.1
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Main0 {
    //public static void main(String[] args) {
/*       Station t1 = new Station ("A", 3);
       Station t2 = new Station ("B", 4);
       Station t3 = new Station ("C", 5);
       Station t4 = new Station ("D", 6);
       Station t5 = new Station ("E", 7);

       t1.addAdjacent(new Adjacent(t2, 10));
       t2.addAdjacent(new Adjacent(t1, 10));
       
       t1.addAdjacent(new Adjacent(t3, 11));
       t3.addAdjacent(new Adjacent(t1, 11));
       
       t2.addAdjacent(new Adjacent(t3, 10));
       t3.addAdjacent(new Adjacent(t2, 10));
       
       t3.addAdjacent(new Adjacent(t4, 12));
       t4.addAdjacent(new Adjacent(t3, 12));

       t4.addAdjacent(new Adjacent(t1, 15));
       t1.addAdjacent(new Adjacent(t4, 15));

       t4.addAdjacent(new Adjacent(t5, 13));
       t5.addAdjacent(new Adjacent(t4, 13));

       Reseau r = new Reseau(t1);
       r.setReseau();
       r.afficherReseau();*/

       //t1.chemin();

       /*******************************************************************************/
       /*******************************************************************************/
       /*** Tests : L'itinéraire passe par certains points donnés par l'utilisateur ***/
       /*******************************************************************************/
       /*******************************************************************************/
       
       /* Listes des stations */
       //Station a = new Station ("A", 1);
       //Station b = new Station ("B", 3);
       //Station c = new Station ("C", 4);
       //Station d = new Station ("D", 3);
       //Station e = new Station ("E", 2);
       //Station f = new Station ("F", 2);
       //Station g = new Station ("G", 2);
       //Station h = new Station ("H", 1);
       //Station i = new Station ("I", 1);
       //Station j = new Station ("J", 3);

       /* Voisins */
       //a.addAdjacent(new Adjacent(f,4));
       //a.addAdjacent(new Adjacent(g,2));
       //a.addAdjacent(new Adjacent(d,2));
       //b.addAdjacent(new Adjacent(f,5));
       //b.addAdjacent(new Adjacent(i,2));
       //c.addAdjacent(new Adjacent(g,1));
       //c.addAdjacent(new Adjacent(d,3));
       //c.addAdjacent(new Adjacent(e,2));
       //c.addAdjacent(new Adjacent(j,2));
       //d.addAdjacent(new Adjacent(a,2));
       //d.addAdjacent(new Adjacent(c,3));
       //e.addAdjacent(new Adjacent(c,2));
       //e.addAdjacent(new Adjacent(h,3));
       //f.addAdjacent(new Adjacent(a,4));
       //f.addAdjacent(new Adjacent(b,5));
       //g.addAdjacent(new Adjacent(a,2));
       //g.addAdjacent(new Adjacent(c,1));
       //h.addAdjacent(new Adjacent(e,3));
       //h.addAdjacent(new Adjacent(i,1));
       //i.addAdjacent(new Adjacent(b,2));
       //i.addAdjacent(new Adjacent(h,1));
       //i.addAdjacent(new Adjacent(j,4));
       //j.addAdjacent(new Adjacent(c,2));
       //j.addAdjacent(new Adjacent(i,4));

       /* Lignes de metro */
            //Ligne1
       //HashMap<String, Double> listStations1 = new HashMap<String, Double>();
       //listStations1.put("a", 4.0);
       //listStations1.put("f", 5.0);
       //listStations1.put("b", 2.0);
       //listStations1.put("i", null);
       //Ligne ligne1 = new Ligne(1, "La ligne 1 !", 13, false, listStations1);
            //Ligne2
       //HashMap<String, Double> listStations2 = new HashMap<String, Double>();
       //listStations2.put("a", 4.0);
       //listStations2.put("g", 2.0);
       //listStations2.put("c", 1.0);
       //listStations2.put("e", 2.0);
       //listStations2.put("h", 3.0);
       //listStations2.put("i", null);
       //Ligne ligne2 = new Ligne(2, "La ligne 2 !", 15, false, listStations2);
            //Ligne3
       //HashMap<String, Double> listStations3 = new HashMap<String, Double>();
       //listStations3.put("a", 2.0);
       //listStations3.put("d", 3.0);
       //listStations3.put("c", 2.0);
       //listStations3.put("j", 4.0);
       //listStations3.put("i", null);
       //Ligne ligne3 = new Ligne(3, "La ligne 3 !", 22, false, listStations3);

       /* Liste des lignes */
       //ArrayList<Ligne> listeDesLignes = new ArrayList<Ligne>();
       //listeDesLignes.add(ligne1);
       //listeDesLignes.add(ligne2);
       //listeDesLignes.add(ligne3);

       /* Itinéraire */
       //ArrayList<Station> itineraire = null;

       /*****************************************************/
       /* Test1 : "Je veux aller de A à B en passant par C" */
       /*****************************************************/
       //Station depart = a; /* Faire de ca une saisie au clavier par l'utilisateur, après */
       //Station arrivee = b; /* Faire de ca une saisie au clavier par l'utilisateur, après */
       //ArrayList<Station> listeStationsDonnees = new ArrayList<Station>();
       //listeStationsDonnees.add(c); /* Faire de ca une saisie au clavier par l'utilisateur, après */

       //itineraire = Calcul.itinerairePassantParStationsDonnees(listeDesLignes, depart, arrivee, listeStationsDonnees);

       //System.out.print("\nItineraire allant de "+depart.getNom()+" a "+arrivee.getNom()+" en passant par");
       //for (Station s : listeStationsDonnees)
       //    System.out.print(", "+s.getNom());
       //System.out.println(":");
       
       //if (itineraire.size() == 0) {
       //    System.out.println("*Aucun itineraire disponible*");
       //}
       //else {
       //    for (Station s : itineraire) {
       //        System.out.println("-Ligne "/*+Calcul.trouverNumeroLigne()*/+", Station "+s.getNom());
       //    }
       //}

       /*********************************************************/
       /* Test2 : "Je veux aller de A en passant par C, F et E" */
       /*********************************************************/
        
    //}
}
