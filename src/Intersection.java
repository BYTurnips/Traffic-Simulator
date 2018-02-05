import java.util.ArrayList;

public class Intersection {
	// These pairs represent <neighbor node, distance>
	ArrayList<Road> neighbors;
	int ID;
	

	public Intersection(ArrayList<Road> listNeighbor, int id) {
		neighbors = listNeighbor;
		ID = id;
	}

	public void print(boolean zind) {
		if (!zind)
			System.out.println("Intersection " + (ID + 1) + ":");
		else
			System.out.println("Intersection " + (ID) + ":");
		for (Road i : neighbors) {
			System.out.print("\t");
			i.print(zind);
		}
	}
}
