package chapter2;

import java.util.List;

import inventory.Apple;

public class Quiz {

	// 유연한 prettyPrintApple 메서드 구현하기
	
	public static void prettyPrintApple(List<Apple> inventory,
			                            AppleFormat formater) {
		for (Apple apple : inventory) {
			String output = formater.accept(apple);
			System.out.println(output);
		}
	}
}
