package fr.diginamic.immobilier.entites;

/**
 * Représente une pièce abstraite
 *
 * @author DIGINAMIC
 */
public abstract class Piece {

    /**
     * TYPE_CHAMBRE : String
     */
    public static final String TYPE_CHAMBRE = "Chambre";
    /**
     * TYPE_SALON : String
     */
    public static final String TYPE_SALON = "Salon";
    /**
     * TYPE_CUISINE : String
     */
    public static final String TYPE_CUISINE = "Cuisine";
    /**
     * TYPE_CUISINE : String
     */
    public static final String TYPE_WC = "WC";
    /**
     * TYPE_CUISINE : String
     */
    public static final String TYPE_SDB = "Salle de bain";
    /**
     * superficie : superficie
     */
    private double superficie;
    /**
     * numEtage : étage où se situe la pièce
     */
    private int numEtage;

    /**
     * Constructeur
     *
     * @param etage      étage
     * @param superficie superficie
     */
    public Piece(int etage, double superficie) {
        this.numEtage = etage;
        this.superficie = superficie;
    }

    /**
     * Retourne le type de la pièce
     *
     * @return String
     */
    public abstract String getType();

    /**
     * Getter
     *
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Setter
     *
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Getter
     *
     * @return the numEtage
     */
    public int getNumEtage() {
        return numEtage;
    }

    /**
     * Setter
     *
     * @param numEtage the numEtage to set
     */
    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "superficie=" + superficie +
                ", numEtage=" + numEtage +
                '}';
    }
}