//найти слова в которых больше 3 символов

package com.Ivan;

import java.util.Arrays;

public class WordsWithMoreThanThreeCharacters {

	public static void main(String[] args) {
		
		// массив строк
		String[] arrayOfStrings  = {"я", "ты", "он", "она", "вместе", "целая", "страна"};
		
		// поиск строк, длиннее трех символов
		String[] selectStrings = Arrays.stream(arrayOfStrings) 	// преобразуем массив в стрим
				.filter(s -> s.length() > 3)					// ищем "длинные" слова
				.toArray(String[]::new);						// создаем и возвращаем новый массив строк
		
		// вывод на консоль
		System.out.println(Arrays.toString(selectStrings));
	}
}
