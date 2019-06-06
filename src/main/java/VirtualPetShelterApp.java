import java.util.List;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter ronnysPlayhouse = new VirtualPetShelter();
		VirtualPetShelter robotsPlayhouse = new VirtualPetShelter();
		List<VirtualPet> organicsInPlayhouse = ronnysPlayhouse.getOrganicsInPlayhouse();
		List<VirtualPet> robotsInPlayhouse = robotsPlayhouse.getRobotsInPlayhouse();
		
		VirtualPet ronny = new VirtualPet("Ronny");
		organicsInPlayhouse.add(ronny);
		VirtualPet kitteh = new VirtualPet("Kitteh");
		organicsInPlayhouse.add(kitteh);
		VirtualPet bork = new VirtualPet("Bork");
		robotsInPlayhouse.add(bork);
		VirtualPet meowth = new VirtualPet("Meowth");
		robotsInPlayhouse.add(meowth);
		
		


		
		
		
		input.close();
	}

}
