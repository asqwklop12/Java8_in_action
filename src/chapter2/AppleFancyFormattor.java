package chapter2;

import inventory.Apple;

public class AppleFancyFormattor implements AppleFormat{

	@Override
	public String accept(Apple apple) {
		String characteristic = apple.getWeight() > 150 ? "heavy" :
			    "light";
		return "A " + characteristic +
				" " + apple.getColor() + " apple";
	}

}
