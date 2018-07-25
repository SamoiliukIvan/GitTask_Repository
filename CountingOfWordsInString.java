//реализовать метод, который вернет количество слов в строке текста

package com.Ivan;

public class CountingOfWordsInString {

	public static void main(String[] args) {
		String str = new String ("ћой д€д€ самый честных правил!");
		int countOfWords = 0;			// переменна€-счетчик слов
		
		for(String s: str.split(" "))
		{
			countOfWords++;
		}
		System.out.println(" оличество слов в тексте - " + countOfWords );
	}
}
