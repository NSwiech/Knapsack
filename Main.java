package Knapsack;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Item> availableItems = new ArrayList<Item>();
	private static Random randomGenerator = new Random();
	private static Sack sack = new Sack();
	private static ArrayList<Sack> sackList = new ArrayList<Sack>();

	public static void main(String[] args) {
		generateItems();
		generateSack();
		//generateSacks();
		showItems();
		showSack();
		//showSacks();

	}

	private static void generateItems() {
		int numberOfItems = 4 + randomGenerator.nextInt(3);
		for (int i = 0; i <= numberOfItems; i++) {
			Item item = new Item();			
			availableItems.add(item);

		}
	}

	private static void showItems() {
		for (Item item : availableItems){
			System.out.println("Value : "+ item.getValue() +" and weight : "+ item.getWeight());
		}
	}
	
	private static void generateSack() {
		Sack sack = new Sack();
	}
	
/*	private static void generateSacks() {
		int numberOfSacks = 3;
		for (int i = 0; i <= numberOfSacks; i++) {
			Sack sack = new Sack();		
			sackList.add(sack);
		}
	}*/
	

	private static void showSack() {
		System.out.println("Weight capacity : "+ sack.getWeight());
	}

	private static void showSacks() {
		for (Sack sack : sackList){
			System.out.println("Weight capacity : "+ sack.getWeight());
		}
	}

}
