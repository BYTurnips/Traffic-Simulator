import java.util.ArrayList;

public class Road {
	public int dest;
	public int dist;
	ArrayList<Car> queue; // This is the queue for traveling on the road,
							// not the queue on the road currently

	Road(int a, int b) {
		dest = a;
		dist = b;
	}

	public void set(int a, int b) {
		dest = a;
		dist = b;
	}

	public void print(boolean zind) {
		if (!zind) {
			System.out.println("Road to " + (dest + 1) + " with distance " + dist);
			System.out.println("Current queue of cars: ");
			for(Car c: queue) System.out.println("\t" + c.ID);
		}
			
		else
			System.out.println("Road to " + (dest) + " with distance " + dist);
		
	}
}
