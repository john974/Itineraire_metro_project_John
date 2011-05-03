/**
 *
 * @author Comma, Diallo, Minatchy, Ngatcha
 * @version 0.2
 */

import java.util.LinkedList;

public class Reseau {

    /*************/
    /* Attributs */
    /*************/
    private Station startStation;
    private LinkedList<Station> allStations = new LinkedList<Station>();
    private LinkedList<Integer> visitedStations = new LinkedList<Integer>();


    /*****************/
    /* Constructeurs */
    /*****************/
    public Reseau(Station startStation) {
        this.startStation = startStation;
    }


    /***************/
    /* Accesseurs */
    /**************/
    public LinkedList<Station> getAllStations() { return allStations; }
    public void setAllStations(LinkedList<Station> allStations) { this.allStations = allStations; }
    public Station getStartStation() { return startStation; }
    public void setStartStation(Station startStation) { this.startStation = startStation; }
    public LinkedList<Integer> getVisitedStations() { return visitedStations; }
    public void setVisitedStations(LinkedList<Integer> visitedStations) { this.visitedStations = visitedStations; }


    /************/
    /* Methodes */
    /************/
    public void setReseau() {
        this.allStations.add(startStation);
        visit(startStation);
        for (Adjacent a : this.startStation.getAdjacents()) {
            if (!this.visitedStations.contains(a.getNode().getNumero())) {
                ajouter(a.getNode());
            }
        }
    }

    private void ajouter(Station s) {
        visit(s);
        this.allStations.add(s);
        for(Adjacent A : s.getAdjacents()) {
            if(!(this.visitedStations.contains(A.getNode().getNumero()))) {
                ajouter(A.getNode());
            }
        }
    }

    private void visit(Station s) {
        this.visitedStations.add(s.getNumero());
    }

    public void afficherReseau() {
        System.out.println("Le reseau est :");
        for(Station s : this.allStations) {
            System.out.println("---------------");
            for(Adjacent a : s.getAdjacents()) {
                System.out.println("- "+s.getNom()+" - "+a.getCost()+" - "+a.getNode().getNom());
            }
            System.out.println("---------------");
        }
    }
}