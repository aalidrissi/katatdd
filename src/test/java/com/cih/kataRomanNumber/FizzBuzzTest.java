package com.cih.kataRomanNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cih.kataRomanNumber.fizz.FizzBuzz;

@SpringBootTest
public class FizzBuzzTest {

	
	  // Étape 1 : Test pour les nombres divisibles par 3
    @Test
    public void testDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.generate(3));
    }

    // Étape 2 : Test pour les nombres divisibles par 5
    @Test
    public void testDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.generate(5));
    }

    // Étape 3 : Test pour les nombres divisibles par 3 et 5
    @Test
    public void testDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.generate(15));
    }

    // Étape 4 : Test pour les nombres non divisibles par 3 ou 5
    @Test
    public void testNotDivisibleBy3Or5() {
        assertEquals("7", FizzBuzz.generate(7));
    }
}
