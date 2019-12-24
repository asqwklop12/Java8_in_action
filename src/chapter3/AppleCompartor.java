package chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import inventory.Apple;

public class AppleCompartor implements Comparator<Apple> {

	@Override
	public int compare(Apple o1, Apple o2) {
		return o1.compareTo(o2);
	}
	
	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
		
		inventory.sort((Apple o1, Apple o2) -> o1.compareTo(o2));
	}

}
