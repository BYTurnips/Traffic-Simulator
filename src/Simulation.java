import java.util.*;

//research that thing called threading - might make simulation a whole lot easier
public class Simulation {
	Intersection[] intersections;
	Inlet[] inlets;

	// Grid with x rows and y cols, expressed in the 1d array as index =
	// (# cols)*x+y
	Simulation(int x, int y, int dist, int rate) {
		intersections = new Intersection[x * y];
		inlets = new Inlet[2 * x + 2 * y];
		generate(x, y, dist, rate);
		startsim();
	}

	// For grids
	public void generate(int rows, int cols, int dist, int rate) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				ArrayList<Road> tempStore = new ArrayList<Road>();
				if (j + 1 < cols)
					tempStore.add(new Road(cols * i + j + 1, dist));
				if (j - 1 >= 0)
					tempStore.add(new Road(cols * i + j - 1, dist));
				if (i + 1 < rows)
					tempStore.add(new Road(cols * (i + 1) + j, dist));
				if (i - 1 >= 0)
					tempStore.add(new Road(cols * (i - 1) + j, dist));
				Intersection object = new Intersection(tempStore, cols * i + j);
				intersections[cols * i + j] = object;
			}
		}
		int k = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if ((i == 0) || (i == rows - 1)) {
					inlets[k] = new Inlet(cols * i + j, rows * cols + k, rate);
					intersections[cols * i + j].neighbors.add(new Road(rows * cols + k, 0));
					k++;
				}
				if ((j == 0) || (j == cols - 1)) {
					inlets[k] = new Inlet(cols * i + j, rows * cols + k, rate);
					intersections[cols * i + j].neighbors.add(new Road(rows * cols + k, 0));
					k++;
				}
			}
		}
		print();
	}

	// User-made flexible graph
	Simulation(Scanner input) {
		String line = input.nextLine();
		String[] tokens = line.split(" ");

		intersections = new Intersection[Integer.parseInt(tokens[0])];
		inlets = new Inlet[Integer.parseInt(tokens[1])];
		generate(input);
	}

	// Generator for user-made flexible graph
	public void generate(Scanner input) {
		for (int i = 0; i < intersections.length; i++) {
			
		}
	}
	
	public void startsim() {
		
	}

	public void print() {
		for (Intersection obj : intersections)
			obj.print(true);
		for (Intersection obj : inlets)
			obj.print(true);
	}
}
