package chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import inventory.Apple;

/**
 * 동작 파라미터화란? 아직은 어떻게 실행할 것인지 결정하지 않은 코드 블록을 의미한다.
 * 
 *
 */
public class Behavior {

	// 첫번째 시도 : 녹색 사과 필터링
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}

	// 두번쨰 시도 : 색을 파라미터화
	public static List<Apple> filterApplesByColor(List<Apple> inventory, 
			                                      String color) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (apple.getColor().equals(color)) {
				result.add(apple);
			}
		}

		return result;
	}

	// 무게 추가
	public static List<Apple> filterApplesByWeight (List<Apple> inventory, 
			                                        int weight) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}
	// 코드 반복
	
	// 세번째 시도 : 가능한 모든 속성 필터링
	public static List<Apple> filterApples(List<Apple> inventory, String color,
			                               int weight, boolean flag) {
		List<Apple> result = new ArrayList<>();
		
		
		for (Apple apple : inventory) {
			if ( (flag && apple.getColor().equals(color) || 
					(!flag && apple.getWeight() > weight))) {
				result.add(apple);
			}
		}
		return result;
	}
	
	// 네번째 시도 : 추상적 조건으로 필터링
	public static List<Apple> filterApples(List<Apple> inventory,
			                               ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	// 다섯번째 시도 -> FilteringApples.class
	// 여섯번째 시도 -> FilteringApples.class
	
	// 일곱번째 시도 : 리스트 형식으로 추상화
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T e : result) {
			if (p.test(e)) {
				result.add(e);
			}
		}
		return result;
	}
	
}
