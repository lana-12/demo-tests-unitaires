package fr.diginamic.utils;

import java.text.Normalizer;

/**
 * Classe qui fournit des services de traitements de chaines de caractères
 * 
 * @author DIGINAMIC
 */
public final class StringUtils {



	/**
	 * Retourne la distance de Levenshtein entre 2 chaines de caractères
	 * 
	 * @param lhs chaine 1
	 * @param rhs chaine 2
	 * @return distance
	 */
	public static int levenshteinDistance(CharSequence lhs, CharSequence rhs) {
		int len0 = lhs.length() + 1;
		int len1 = rhs.length() + 1;

		int[] cost = new int[len0];
		int[] newcost = new int[len0];

		for (int i = 0; i < len0; i++) {
			cost[i] = i;
		}

		for (int j = 1; j < len1; j++) {
			newcost[0] = j;

			for (int i = 1; i < len0; i++) {
				int match = (lhs.charAt(i - 1) == rhs.charAt(j - 1)) ? 0 : 1;

				int costReplace = cost[i - 1] + match;
				int costInsert = cost[i] + 1;
				int costDelete = newcost[i - 1] + 1;

				newcost[i] = Math.min(Math.min(costInsert, costDelete), costReplace);
			}

			int[] swap = cost;
			cost = newcost;
			newcost = swap;
		}
		return cost[len0 - 1];
	}


	/**
	 * Normalise une string en supp les accents,
	 * Met Première lettre en majuscule et le reste en minuscule.
	 *
	 * @param word string à normaliser
	 * @return string normalisée
	 */
	public static String normalize(String word) {
		if (word == null || word.isEmpty()) {
			return word;
		}
		String normalized = Normalizer.normalize(word, Normalizer.Form.NFD);
		normalized = normalized.replaceAll("\\p{M}", "");
		return capitalizeFirstLetter(normalized);
	}

	/**
	 * Met la première lettre en majuscule et le reste en minuscule.
	 *
	 * @param word string à normaliser
	 * @return string normalisée
	 */
	private static String capitalizeFirstLetter(String word) {
		if (word == null || word.isEmpty()) {
			return word;
		}
		String lowerCase = word.toLowerCase();
		return Character.toUpperCase(lowerCase.charAt(0)) + lowerCase.substring(1);
	}
}
