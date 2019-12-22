package inventory;

public class Apple {

	private String color;
	private int weight;
	
	public Apple(int weight, String color) {
		this.weight = weight;
		this.color = color;
		
	}
	
	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
	
	

	@Override
	public String toString() {
		return "color : " + color +
				" " +
				"weight : " + weight;
	}

}
