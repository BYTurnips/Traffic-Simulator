import java.io.*;
import java.util.*;

public class main {
	public static void main(String args[]) {
		try {
			Scanner input = new Scanner(new FileInputStream("Grap.txt"));
			Simulation sim = new Simulation(input);
		} catch (Exception e) {
			System.out.println("File not found, initializing a grid layout: ");
			Simulation sim = new Simulation(3, 3, 20, 10);
		}

		/*
		 * ArrayList<Road> test = new ArrayList<>(); Road tempPair = new Road(1, 4);
		 * test.add(tempPair); test.get(0).print(); tempPair.p(0, 5);
		 * test.get(0).print();
		 */
	}
}