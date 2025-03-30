package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import model.SeznamZlomku;
import model.Zlomek;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class SeznamZlomkuTest {
    SeznamZlomku seznam;

    @BeforeEach
    void setUp() {
        seznam = new SeznamZlomku();
    }

    @Test
    @DisplayName("Test pridavani")
    void pridatZlomek() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        assertEquals(1, seznam.pocetZlomku(), "Pocet zlomku");
        Zlomek z = seznam.vybratZlomek(0);
        assertEquals(3, z.getCitatel(), "Citatel" );
        assertEquals(5, z.getJmenovatel(), "Jmenovatel" );
    }

    @Test
    @DisplayName("Test pridani null")
    void pridatZlomekNull() {
        assertThrows(NullPointerException.class,
                () -> seznam.pridatZlomek(null));
    }

    @Test
    void vybratZlomek() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        Zlomek z = seznam.vybratZlomek(0);
        assertEquals(3, z.getCitatel(), "Citatel" );
        assertEquals(5, z.getJmenovatel(), "Jmenovatel" );
    }

    @Test
    void vybratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> seznam.vybratZlomek(0));
    }

    @Test
    void odebratZlomek() {

        Zlomek z = new Zlomek(3, 5);
        seznam.pridatZlomek(z);
        int len = seznam.pocetZlomku();
        seznam.odebratZlomek(0);
        int len2 = seznam.pocetZlomku();
        if (len == len2) {
            fail();
        }
    }

    @Test
    void vypisZlomky() {
        Zlomek a = new Zlomek(3, 5);
        Zlomek b = new Zlomek(1, 2);
        Zlomek c = new Zlomek(2, 3);
        seznam.pridatZlomek(a);
        seznam.pridatZlomek(b);
        seznam.pridatZlomek(c);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        seznam.vypisZlomky(printStream);
        String expectedOutput = "[1] => 3 / 5\n[2] => 1 / 2\n[3] => 2 / 3\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void spoctiSoucet() {
        Zlomek a = new Zlomek(3, 5);
        Zlomek b = new Zlomek(1, 5);
        seznam.pridatZlomek(a);
        seznam.pridatZlomek(b);
        Zlomek z = seznam.spoctiSoucet();
        assertEquals(4, z.getCitatel(), "Citatel" );
        assertEquals(5, z.getJmenovatel(), "Jmenovatel" );
    }

    @Test
    void spoctiPrumer() {
        Zlomek a = new Zlomek(3, 5);
        Zlomek b = new Zlomek(1, 5);
        seznam.pridatZlomek(a);
        seznam.pridatZlomek(b);
        Zlomek z = seznam.spoctiPrumer();
        assertEquals(2, z.getCitatel(), "Citatel" );
        assertEquals(5, z.getJmenovatel(), "Jmenovatel" );

    }
}