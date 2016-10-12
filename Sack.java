package Knapsack;
import java.util.ArrayList;
import java.util.Random;

public class Sack {
	private int sackID;
	private int capacity=0;
	private Random randomGenerator = new Random();
	private ArrayList contence = new ArrayList();
	
	public Sack(){
		capacity = 15 + randomGenerator.nextInt(10); 
	}
	
public int getWeight(){
	int weight;
	for(Item x : contence){
		weight +=Item.getWeight();
	}
	return weight;
}

public boolean addItem(Item itm){
	boolean addOK = false;
	
	if((capacity) - getweight()) <= itm.weight()){
		contence.add(itm);
		addOK = true;
	}
	return addOk;
}
}
