package app;

import model.Zlomek;
import model.SeznamZlomku;
/**
 * Priklad pouziti SeznamuZlomku
 */
public class SeznamZlomkuApp {

    public static void main(String[] args) {
        SeznamZlomku seznam = new SeznamZlomku();

        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(2, 3));
        seznam.pridatZlomek(new Zlomek(-4, 5));
        seznam.pridatZlomek(new Zlomek(7, 8));

        seznam.vypisZlomky(System.out);


        Zlomek soucet = seznam.spoctiSoucet();
        System.out.println("Soucet zlomku je " + soucet);
        System.out.println("Soucet zlomku realne je " + soucet.doubleValue());
        Zlomek prumer = seznam.spoctiPrumer();
        System.out.println("Prumer zlomku je " + prumer);
        System.out.println("Prumer zlomku realne je " + prumer.doubleValue());
    }
}