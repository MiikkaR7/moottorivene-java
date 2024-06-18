import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class main {
    // Järjestyslambdat
    public static void sortmerkki(ArrayList<moottorivene> veneet) {
        veneet.sort((a, b)
                -> a.getMerkki().compareTo(
                b.getMerkki()));
    }
    public static void sortteho(ArrayList<moottorivene> veneet) {
        veneet.sort((b, a)
                -> a.getTeho().compareTo(
                b.getTeho()));
    }
    public static void sortpituus(ArrayList<moottorivene> veneet) {
        veneet.sort((b, a)
                -> a.getPituus().compareTo(
                b.getPituus()));
    }
    public static void main( String[] args) {

//ArrayList, johon veneet tallennetaan
        ArrayList<moottorivene> veneet = new ArrayList<moottorivene>();
//Muuttujia kuvaavilla nimillä
        int venenumero = 1;
        char valinta = 'o';
        String venemerkki = "merkki";
        int veneteho = 0;
        float venepituus = 0;
        int poistettava = 0;
        int jperuste;
//Scannerit
        Scanner syote = new Scanner(System.in);
        Scanner merkki = new Scanner(System.in);
        Scanner teho = new Scanner(System.in);
        Scanner pituus = new Scanner(System.in);
        Scanner poisto = new Scanner(System.in);
        Scanner jarjesta = new Scanner(System.in);
        moottorivene.dialogi();
//Ohjelman varsinainen silmukka
        do
        {
            valinta = syote.next().charAt(0);
            if (valinta == 'l') {
                System.out.println("Anna veneen merkki: ");
                try {
                    venemerkki = merkki.next();
                }
                catch (java.util.InputMismatchException e) {
                    merkki.nextLine();
                }
                System.out.println("Anna veneen teho(W): ");
                try {
                    veneteho = teho.nextInt();
                }
                catch (java.util.InputMismatchException e) {
                    teho.nextLine();
                }
                System.out.println("Anna veneen pituus(m): ");
                try {
                    venepituus = pituus.nextFloat();
                }
                catch (java.util.InputMismatchException e) {
                    pituus.nextLine();
                }

                moottorivene vene = new moottorivene(venemerkki, veneteho,
                        venepituus);
                veneet.add(vene);
                moottorivene.dialogi();
            }
            if (valinta == 't') {
                if (veneet.size() == 0) {
                    System.out.println("");

                    System.out.println("Ei tulostettavia veneitä");
                    System.out.println("");
                }
                for (moottorivene n : veneet) {

                    System.out.println("Veneen numero: " + (venenumero++));

                    n.tulostaTiedot();
                    System.out.println("");

                }
                venenumero = 1;
                moottorivene.dialogi();
            }

            if (valinta == 'p' && !veneet.isEmpty()) {
                System.out.println("Anna poistettavan veneen numero: ");
                poistettava = poisto.nextInt();
                veneet.remove((poistettava - 1));
                System.out.println("Vene numero " + poistettava + " poistettu");
                System.out.println("");
                moottorivene.dialogi();
            }
            if (valinta == 'j' && !veneet.isEmpty()) {
                System.out.println("Millä perusteella järjestetään?");
                System.out.println("1: Merkki");
                System.out.println("2: Teho");
                System.out.println("3: Pituus");
                System.out.println("");
                jperuste = jarjesta.nextInt();
                if (jperuste == 1) {

                    sortmerkki(veneet);
                }
                if (jperuste == 2) {
                    sortteho(veneet);
                }
                if (jperuste == 3) {
                    sortpituus(veneet);
                }

                moottorivene.dialogi();
            }
        }
        while (valinta != 'x');
        System.exit(0);
    }
}