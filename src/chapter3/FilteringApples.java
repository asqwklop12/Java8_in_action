package chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import inventory.Apple;

public class FilteringApples {

	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
				                              new Apple(155, "green"),
				                              new Apple(120, "red"));
		
		
		inventory.sort((Apple a1, Apple a2) ->
					   a1.compareTo(a2));

		inventory.sort(Comparator.comparing(Apple :: getWeight));
	}

}
