package HTL;

public class Wohnung {

    private String adress;
    private int groesse;
    private boolean balkon;
    private int anzZimmer;
    private int mieteProMonat;



    public Wohnung(String adress, int groesse, boolean balkon, int anzZimmer, int mieteProMonat){


    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {

        this.groesse = groesse;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public int getAnzZimmer() {
        return anzZimmer;
    }

    public void setAnzZimmer(int anzZimmer) {
        this.anzZimmer = anzZimmer;
    }

    public int getMieteProMonat() {
        return mieteProMonat;
    }

    public void setMieteProMonat(int mieteProMonat) {
        this.mieteProMonat = mieteProMonat;
    }
}
