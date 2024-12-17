package com.cih.kataRomanNumber.fizz;

public class FizzBuzz {

	
	 public static String generate(int number) {
//          return "Fizz"; // Étape 1 : Implémentation minimale pour passer testDivisibleBy3
//          return "Buzz"; // Étape 2 : Implémentation minimale pour passer testDivisibleBy5
          if (number % 3 == 0 && number % 5 == 0) 
        	  return "FizzBuzz"; // Étape 3 : Cas FizzBuzz
        if (number % 3 == 0) 
        	return "Fizz"; // Étape 3 : Gestion de "Fizz"
          if (number % 5 == 0) 
        	  return "Buzz"; // Étape 3 : Gestion de "Buzz"
        
          return Integer.toString(number); // Étape 4 : Cas pour les nombres non divisibles
         
     }
}
