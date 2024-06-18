import java.util.*;
import java.util.ArrayList;
public class moottorivene {
    //Tietojäsenet
    private String sMerkki;
    private Integer sTeho;
    private Float sPituus;
    //Rakentaja
    public moottorivene(String aMerkki, Integer aTeho, Float aPituus) {
        sMerkki = aMerkki;
        sTeho = aTeho;
        sPituus = aPituus;
    }
    public static void dialogi() {
        System.out.println("Valitse operaatio");
        System.out.println("(L) lisää veneen");
        System.out.println("(T) tulostaa tallennetut veneet");
        System.out.println("(P) poistaa veneen");
        System.out.println("(J) järjestää veneet");
        System.out.println("(X) poistu ohjelmasta");
        System.out.println("Syötä haluttu operaatio");
    }
    public String getMerkki() {
        return sMerkki;
    }
    public void setMerkki(String aMerkki) {
        sMerkki = aMerkki;
    }
    public Integer getTeho() {
        return sTeho;
    }
    public void setTeho(Integer aTeho) {
        sTeho = aTeho;
    }
    public Float getPituus() {
        return sPituus;
    }
    public void setPituus(float aPituus) {
        sPituus = aPituus;
    }
    public void tulostaTiedot() {

        System.out.println("Veneen merkki: " + getMerkki());
        System.out.println("Veneen teho(W): " + getTeho());
        System.out.println("Veneen pituus(m): " + getPituus());
    }
}