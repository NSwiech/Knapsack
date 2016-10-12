import java.util.Random;

public class Item {
	
	private int value;
	private int weight;
	Random randomGenerator = new Random();
	
	//Standard constructor with fields
	public Item(int value, int weight) {
		this.value = value;
		this.weight = weight;
	}
	
	//Random item generator
	public Item() {
		this.value = randomGenerator.nextInt(10);
		this.weight = randomGenerator.nextInt(8);
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}


