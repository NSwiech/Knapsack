package Knapsack;
import java.util.ArrayList;
import java.util.Random;

public class Sack {
	private int sackID;
	private int capacity = 0;
	private Random randomGenerator = new Random();
	private ArrayList<Item> contence = new ArrayList<Item>();

	public Sack() {
		capacity = 15 + randomGenerator.nextInt(10);
	}

	public int getWeight() {
		int weight = 0;
		for (Item x : contence) {
			weight += x.getWeight();
		}
		return weight;
	}

public boolean addItem(Item itm){
	boolean addOK = false;
	
	if((capacity) - getWeight() <= itm.getWeight()){
		contence.add(itm);
		addOK = true;
	}
	return addOK;
}
}
