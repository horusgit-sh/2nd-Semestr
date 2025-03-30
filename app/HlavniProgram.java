package app;
import model.SeznamZlomkuUkol;
import model.Zlomek;


public class HlavniProgram {
    public static void main(String[] args) {
        SeznamZlomkuUkol seznam = new SeznamZlomkuUkol();
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(3, 4));
        seznam.pridatZlomek(new Zlomek(5, 6));

        System.out.println("Seznam zlomků:");
        seznam.vypisZlomky();

        Zlomek soucet = seznam.spoctiSoucet();
        System.out.println("Součet: " + soucet + " = " + soucet.doubleValue());

        Zlomek prumer = seznam.spoctiPrumer();
        System.out.println("Průměr: " + prumer + " = " + prumer.doubleValue());
    }
}