/*
 * Adjacent : Pour une station adjacente
 * @author Comma, Diallo, Minatchy, Ngatcha
 * @version 0.1
 */

final class Adjacent {

    /*************/
    /* Attributs */
    /************/
    private Station node;
    private double cost;

    
    /*****************/
    /* Constructeurs */
    /*****************/
    public Adjacent(Station nodeTo, int cost) {
            this.node = nodeTo;
            this.cost = cost;
    }


    /***************/
    /* Accesseurs */
    /**************/
    public Station getNode() { return node; }
    public double getCost() { return cost; }
}
