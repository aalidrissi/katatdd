package com.cih.kataRomanNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cih.kataRomanNumber.converter.RomanNumerals;
import com.cih.kataRomanNumber.converter.RomanNumeralsInterface;

@SpringBootTest
class KataRomanNumberApplicationTests {
	
	
    private static RomanNumeralsInterface RomanNumerals;

    @BeforeAll
    public static void doBeforeClass() {
    	RomanNumerals = new RomanNumerals();
    }
    
	@Test
	void contextLoads() {
	}
	
	
	  // Étape 1 : Test pour 1
    @Test
    public void testSingleDigit() {
        assertEquals("I", RomanNumerals.convert(1));
    }

    // Étape 2 : Test pour 2
    @Test
    public void testMultipleDigits() {
        assertEquals("II", RomanNumerals.convert(2));
    }
    
    // Étape 2 : Test pour 3
    @Test
    public void testMultipleTroisDigits() {
        assertEquals("III", RomanNumerals.convert(3));
    }
    
    // Étape 3 : Test pour 4
    @Test
    public void testQuatre() {
        assertEquals("IV", RomanNumerals.convert(4));
    }

    // Étape 4 : Test pour 5
    @Test
    public void testCinq() {
        assertEquals("V", RomanNumerals.convert(5));
    }
    
    // Etape 5: Géréer avec du récursif
    @Test
    public void testHuit() {
        assertEquals("VIII", RomanNumerals.convert(8));
    }
    
    // Étape 5 : Test pour 9
    @Test
    public void testNeuf() {
        assertEquals("IX", RomanNumerals.convert(9));
    }

    // Étape 6 : Test pour 10
    @Test
    public void testDix() {
        assertEquals("X", RomanNumerals.convert(10));
    }

    // Étape 7 : Test pour 40
    @Test
    public void testQuarante() {
        assertEquals("XL", RomanNumerals.convert(40));
    }

    // Étape 8 : Test pour 50
    @Test
    public void testCinquante() {
        assertEquals("L", RomanNumerals.convert(50));
    }

    // Étape 9 : Test pour 90
    @Test
    public void testQuatreVingDix() {
        assertEquals("XC", RomanNumerals.convert(90));
    }

    // Étape 10 : Test pour 100
    @Test
    public void testCent() {
        assertEquals("C", RomanNumerals.convert(100));
    }

    // Étape 11 : Test pour 400
    @Test
    public void testQuatreCent() {
        assertEquals("CD", RomanNumerals.convert(400));
    }

    // Étape 12 : Test pour 500
    @Test
    public void testCinqCent() {
        assertEquals("D", RomanNumerals.convert(500));
    }

    // Étape 13 : Test pour 900
    @Test
    public void testNeufCent() {
        assertEquals("CM", RomanNumerals.convert(900));
    }

    // Étape 14 : Test pour 1000
    @Test
    public void testMille() {
        assertEquals("M", RomanNumerals.convert(1000));
    }
    
    // Étape 14 : Test pour 3450
    @Test
    public void testTroisMilleQuatreCentCinquante() {
        assertEquals("MMMCDL", RomanNumerals.convert(3450));
    }

}
