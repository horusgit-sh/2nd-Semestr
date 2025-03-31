package test;

import model.SeznamZlomkuUkol;
import model.Zlomek;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UkolTest {
    private SeznamZlomkuUkol seznam;

    @BeforeEach
    void setUp() {
        seznam = new SeznamZlomkuUkol();
    }

    @Test
    void testPridatZlomek() {
        seznam.pridatZlomek(new Zlomek(1, 2));
        assertEquals(1, seznam.vratZlomek(0).getCitatel());
        assertEquals(2, seznam.vratZlomek(0).getJmenovatel());
    }

    @Test
    void testOdebratZlomek() {
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.odebratZlomek(0);
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.vratZlomek(0));
    }

    @Test
    void testSpoctiSoucet() {
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(1, 3));
        assertEquals(new Zlomek(5, 6), seznam.spoctiSoucet());
    }

    @Test
    void testSpoctiPrumer(){
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(1, 2));
        assertEquals(new Zlomek(1, 2), seznam.spoctiPrumer());
    }
}
