package Knapsack;
import java.util.Random;

public class Item {
	
	private int value;
	private int weight;
	private Random randomGenerator = new Random();
	
	//Standard constructor with fields
	public Item(int value, int weight) {
		this.value = value;
		this.weight = weight;
	}
	
	//Random item generator
	public Item() {
		this.value = 1 + randomGenerator.nextInt(9);
		this.weight = 1 + randomGenerator.nextInt(7);
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


