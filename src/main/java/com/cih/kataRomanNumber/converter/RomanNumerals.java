package com.cih.kataRomanNumber.converter;



/**
 * Traducteur specifique a la representation romaine d'un nombre.
 *
 * Les valeurs simples sont : I (1), V (5), X (10), L (50), C (100), D (500) et
 * M (1000).
 *
 * Les valeurs "speciales" sont : IV (4), IX (9), XL (40), etc.
 *
 * Quelques exemples : <br />
 * - CCCLXIX = CCC LX IX = 369 <br />
 * - MMDCCLI = MM DCC LI = 2751
 *
 * La valeur minimale est dont 1 (I) et la valeur maximale dans ce systeme est
 * donc 3888 (MMMDCCCLXXXVIII).
 *
 * @author AAL
 * TODO XXX
 */
public class RomanNumerals implements RomanNumeralsInterface{

	@Override
	public String convert(int number) {

		/*
         // Étape 1 : Implémentation minimale pour 1
         if (number == 1) {
             return "I";
         }
         return null;
         */
         
		/*
         // Étape 2 : Gestion des répétitions
         StringBuilder result = new StringBuilder();
         for (int i = 0; i < number; i++) {
             result.append("I");
         }
         return result.toString();
		*/

		/*
         // Étape 3 : Gestion de 4
         if (number == 4) {
             return "IV";
         }
         StringBuilder result = new StringBuilder();
         for (int i = 0; i < number; i++) {
             result.append("I");
         }
         return result.toString();
		*/
		
		/*
         // Étape 4 : Ajout de 5
         if (number == 4) {
             return "IV";
         }
         if (number == 5) {
             return "V";
         }
         StringBuilder result = new StringBuilder();
         for (int i = 0; i < number; i++) {
             result.append("I");
         }
         return result.toString();
		 */

		/*
         // Étape 5 : Ajout des dizaines et centaines
         if (number == 9) {
             return "IX";
         }
         if (number >= 5) {
             return "V" + convert(number - 5);
         }
         if (number >= 4) {
             return "IV";
         }
         if (number >= 1) {
             return "I" + convert(number - 1);
         }
         return "";
		*/

		// Étape finale : Gestion complète
		StringBuilder result = new StringBuilder();

		// Ajouter les milliers
		while (number >= 1000) {
			result.append("M");
			number -= 1000;
		}

		// Ajouter les centaines
		if (number >= 900) {
			result.append("CM");
			number -= 900;
		}
		if (number >= 500) {
			result.append("D");
			number -= 500;
		}
		if (number >= 400) {
			result.append("CD");
			number -= 400;
		}
		while (number >= 100) {
			result.append("C");
			number -= 100;
		}

		// Ajouter les dizaines
		if (number >= 90) {
			result.append("XC");
			number -= 90;
		}
		if (number >= 50) {
			result.append("L");
			number -= 50;
		}
		if (number >= 40) {
			result.append("XL");
			number -= 40;
		}
		while (number >= 10) {
			result.append("X");
			number -= 10;
		}

		// Ajouter les unités
		if (number == 9) {
			result.append("IX");
			number -= 9;
		}
		if (number >= 5) {
			result.append("V");
			number -= 5;
		}
		if (number == 4) {
			result.append("IV");
			number -= 4;
		}
		while (number >= 1) {
			result.append("I");
			number -= 1;
		}

		return result.toString();
	}


}