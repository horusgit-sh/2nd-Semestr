package test;

import model.Zlomek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ZlomekTest {

    @Test
    void krat() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.krat(b);
        assertEquals(12, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @Test
    void kratNulovy() {
        Zlomek a = new Zlomek(0, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.krat(b);
        assertEquals(0, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @Test
    void deleno() {
        Zlomek a = new Zlomek(5, 4);
        Zlomek b = new Zlomek(5, 4);
        Zlomek c = a.deleno(b);
        assertEquals(20, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @Test
    void plus() {
        Zlomek a = new Zlomek(1, 2);
        Zlomek b = new Zlomek(1, 4);
        Zlomek c = a.plus(b).zkratit();
        assertEquals(3, c.getCitatel(), "Chybny citatel");
        assertEquals(4, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @Test
    void minus() {
        Zlomek a = new Zlomek(1, 2);
        Zlomek b = new Zlomek(1, 4);
        Zlomek c = a.minus(b).zkratit();
        assertEquals(1, c.getCitatel(), "Chybny citatel");
        assertEquals(4, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @Test
    void zkratit() {
        Zlomek a = new Zlomek(10, 30);
        Zlomek b = new Zlomek(5, 30);
        Zlomek k = a.minus(b);
        Zlomek c = k.zkratit();
        assertEquals(1, c.getCitatel(), "Chybny citatel");
        assertEquals(6, c.getJmenovatel(), "Chybny jmenovatel");
    }
}