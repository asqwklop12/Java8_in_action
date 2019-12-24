package chapter3;

import java.util.Comparator;

import inventory.Apple;

public class Lambda {
	Comparator<Apple> byweight = new Comparator<Apple>() {
		
		@Override
		public int compare(Apple a1, Apple a2) {
			return a1.compareTo(a2);
		}
	};
	
	public static void main(String[] args) {
		Comparator<Apple> byweight = 
				(Apple a1, Apple a2) -> a1.compareTo(a2);
	}
}
