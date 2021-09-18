/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guilh
 */
public class TDDTest {
    
    TDD sut;
    
    public TDDTest() {
        sut = new TDD();
    }

    @Test
    public void testDatas() {
        assertEquals(false, sut.datas(1800));
        assertEquals(true, sut.datas(1950));
        assertEquals(false, sut.datas(2200));
        assertEquals(false, sut.datas(1899));
        assertEquals(true, sut.datas(1900));
        assertEquals(true, sut.datas(2020));
        assertEquals(false, sut.datas(2021));
    }
    
    @Test
    public void testNotaBimestral() {
        assertEquals(false, sut.notaBimestral(-5));
        assertEquals(true, sut.notaBimestral(5));
        assertEquals(true, sut.notaBimestral(8));
        assertEquals(false, sut.notaBimestral(11));
        assertEquals(false, sut.notaBimestral(-1));
        assertEquals(true, sut.notaBimestral(0));
        assertEquals(true, sut.notaBimestral(10));
        assertEquals(false, sut.notaBimestral(11));
    }
    
    @Test
    public void testPeriodicidadeDeRenovacao() {
        assertEquals(10, sut.periodicidadeDeRenovacao(-45));
        assertEquals(10, sut.periodicidadeDeRenovacao(25));
        assertEquals(5, sut.periodicidadeDeRenovacao(59));
        assertEquals(3, sut.periodicidadeDeRenovacao(70));
        assertEquals(3, sut.periodicidadeDeRenovacao(89));
        assertEquals(3, sut.periodicidadeDeRenovacao(250));
        assertEquals(10, sut.periodicidadeDeRenovacao(49));
        assertEquals(5, sut.periodicidadeDeRenovacao(50));
        assertEquals(5, sut.periodicidadeDeRenovacao(69));
        assertEquals(3, sut.periodicidadeDeRenovacao(70));
    }
}
