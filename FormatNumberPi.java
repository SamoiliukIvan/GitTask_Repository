//Вывести на экран число пи 5 раз, 
//в каждой строке разное количество знаков после запятой. 
//В первой строке - 1, в последней - 5

package com.Ivan;

public class FormatNumberPi {

	public static void main(String[] args) {
		
		System.out.println(String.format("%.1f%n", Math.PI));	// 1 цифра после запятой
		System.out.println(String.format("%.2f%n", Math.PI));	// 2 цифры после запятой
		System.out.println(String.format("%.3f%n", Math.PI));	// 3 цифры после запятой
		System.out.println(String.format("%.4f%n", Math.PI));	// 4 цифры после запятой
		System.out.println(String.format("%.5f%n", Math.PI));	// 5 цифры после запятой
	}
}
