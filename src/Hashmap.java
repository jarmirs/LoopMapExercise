import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * You are a car dealer. Create a hash map of vehicles. The model is the Key,
		 * the make is the Value.
		 * 
		 * Ask the customer what car (model) they are looking for. Use the Hash Map to
		 * determine if you have that vehicle, and what make it is. (e.g.
		 * "Oh, you're looking for a Civic? Our Honda selection is right over here...")
		 * Submit to your GitHub and provide a link to your repository
		 */
		HashMap<String, String> vehicles = new HashMap<>();
		// add keys & values to Hashmap with .put() method
		vehicles.put("Civic", "Honda");
		vehicles.put("Altima", "Nissan");
		vehicles.put("Tundra", "Toyota");
		vehicles.put("Wrangler", "Jeep");

		System.out.println(vehicles); 
		System.out.println("What car model are you looking for?");
		String model = input.nextLine();
		
		//access key & value pairs 
		for (Map.Entry<String, String> vehicle : vehicles.entrySet()) {
//			System.out.println(vehicle);
			String currentVehicleModel = vehicle.getValue();
			System.out.println(currentVehicleModel);
			if (model.equals(currentVehicleModel)) {
				System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", model,
						vehicle.getKey());
			}
		}
		
	}
}
