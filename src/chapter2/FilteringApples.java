package chapter2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import inventory.Apple;

public class FilteringApples {

	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
				                              new Apple(155, "green"),
				                              new Apple(120, "red"));
		
		
		List<Apple> heavyApples = 
				Behavior.filterApples(inventory, new AppleHeavyWeightPredicate());
		List<Apple> greenApples = 
				Behavior.filterApples(inventory, new AppleGreenColorPredicate());
		
		System.out.println(heavyApples);
		System.out.println(greenApples);
		
		
		// 다섯 번째 시도 : 익명 클래스 사용
		List<Apple> redApples = Behavior.filterApples(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple a) {
				return "red".equals(a.getColor());
			}
		});
		
		System.out.println(redApples);
		
		// 여섯 번째 시도 : 람다 표현식 사용
		List<Apple> result = 
				Behavior.filterApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));
		
		System.out.println(result);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,10);
		
		List<Integer> evenNumber = 
				Behavior.filter(numbers, (Integer  i) -> i % 2 == 0);
		
		System.out.println(evenNumber);

	}

}
