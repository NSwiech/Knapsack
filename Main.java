import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Item> availableItems = new ArrayList<Item>();
	private static Random randomGenerator = new Random();

	public static void main(String[] args) {
		generateItems();
		showItems();

	}

	private static void generateItems() {
		int numberOfItems = 4 + randomGenerator.nextInt(3);
		for (int i = 0; i == numberOfItems; i++) {
			Item item = new Item();
			availableItems.add(item);
		}
	}

	private static void showItems() {
		
	}

}
