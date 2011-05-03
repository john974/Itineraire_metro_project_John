/**
 * Classe principale pour tester le reseau qui servira de reference au projet
 * @author Comma, Diallo, Minatchy, Ngatcha
 * @version 0.1
 */
public class Main1 {
    public static void main (String[] args) {

        /* Creation du reseau */
        Reseau reseau = CreationReseauNew.initialiserReseau();

        /* Creation des lignes */
        Ligne ligne1 = CreationLignes.initialiserLigne(1);
        Ligne ligne4 = CreationLignes.initialiserLigne(4);
        Ligne ligne8 = CreationLignes.initialiserLigne(8);
        Ligne ligne12 = CreationLignes.initialiserLigne(12);
        Ligne ligne14 = CreationLignes.initialiserLigne(14);


        int i = 0;
        for (Station station : reseau.getAllStations()) {
            System.out.println(station.getNom());
            i++;
        }
        System.out.println("\nIl y a : "+reseau.getAllStations().size()+" stations.");


        //ligne1.afficherListeStations();
        //ligne4.afficherListeStations();
        //ligne8.afficherListeStations();
        //ligne12.afficherListeStations();
        //ligne14.afficherListeStations();
    }
}
