import java.util.ArrayList;
import java.util.Arrays;

public class Inlet extends Intersection {
	int inrate; //Expected number of cars per minute
	// These pairs represent <neighbor node, distance>
	Inlet(ArrayList<Road> listNeighbor, int id, int rate) {
		super(listNeighbor, id);
		inrate = rate;
	}

	Inlet(int nextID, int id, int rate) {
		// High quality one liner
		super(new ArrayList<Road>(Arrays.asList(new Road(nextID, 0))), id);
		inrate = rate;
	}
}
