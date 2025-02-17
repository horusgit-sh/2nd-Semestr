package cvic0;
import cvic1.Zlomek;


public class ZlomkyApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Zlomek a = new Zlomek(3, 4);
        int citatel = a.getCitatel();
        int jmenovatel = a.getJmenovatel();
        System.out.println(a);

        Zlomek b = new Zlomek(2, 5);


        Zlomek c = a.krat(b);
        Zlomek d = a.del(b);
        Zlomek e = a.sum(b);
        Zlomek f = a.minus(b);

        System.out.printf("Zlomek a * b = %s\n", c);
        System.out.printf("Zlomek a / c = %s\n", d);
        System.out.printf("Zlomek a + d = %s\n", e);
        System.out.printf("Zlomek a - b = %s\n", f);



    }

    @Override
    public String toString() {
        return "ZlomkyApp{ " +
                "Citatel="
                ;
    }
}
