import java.util.ArrayList;
import java.util.LinkedList;


/**
 * Contient les algorithmes de résolution de calculs dans le réseau
 * @author Jonathan
 */
public class Calcul {

    /************/
    /* Methodes */
    /************/

    /*
     * Renvoie l'itineraire qui passe par les stations données par l'usager
     * @author Jonathan MINATCHY
     * @param listeDesLignes Liste de toutes les lignes de metro existantes
     * @param depart Station de départ voulue par l'usager
     * @param arrivee Station d'arrivee voulue par l'usager
     * @param listeStationsDonnees Liste des stations par lesquelles l'usager veut passer
     * @return Itineraire (liste de stations) passant par les stations donnees en parametre
     */
    public static ArrayList<Station> itinerairePassantParStationsDonnees(ArrayList<Ligne> listeDesLignes, Station depart, Station arrivee, ArrayList<Station> listeStationsDonnees) {
        ArrayList<Station> resItineraire = new ArrayList<Station>();

        System.out.println("Recherche d'un itineraire passant par les stations demandées. Veuillez patienter...");


        resItineraire.add(depart);
        resItineraire.add(arrivee);

        /* Chercher dans quelle(s) ligne(s) il y a le depart */
        /* Chercher dans quelle(s) ligne(s) il y a l'arrivee */

        /* Donner un itineraire (correct) qui va du depart a l'arrivee */
        

        /* Donner un itineraire qui va du depart a l'arrivee en passant par les stations demandees */

        return resItineraire;
    }

    /*
     * Verifie qu'une station donnée appartient bien aux voisins d'une autre station
     * @author Jonathan MINATCHY
     * @param station1
     * @param station2
     * @return boolean Sera vrai si la station appartient bien aux voisins de l'autre station, sera faux sinon
     */
    public static boolean verifierVoisins(Station station1, Station station2) {
        boolean res = false; /* Resultat a renvoyer */

//        for (Station s : station1.getAdjacents()) {
  //          if (s == station2)
    //            res = true;
      //  }

        return res;
    }
}
