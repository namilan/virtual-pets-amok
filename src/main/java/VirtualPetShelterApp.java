import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtualPetShelterApp {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter ronnysPlayhouse = new VirtualPetShelter();
		VirtualPetShelter robotsPlayhouse = new VirtualPetShelter();
		List<VirtualPet> organicsInPlayhouse = ronnysPlayhouse.getOrganicsInPlayhouse();
		List<VirtualPet> robotsInPlayhouse = robotsPlayhouse.getRobotsInPlayhouse();
//		List<Cat> catInPlayhouse = new ArrayList<Cat>();
//		List<Dog> dogInPlayhouse = new ArrayList<Dog>();
		
		VirtualPet ronny = new VirtualPet("Ronny");
		organicsInPlayhouse.add(ronny);
		VirtualPet kitteh = new VirtualPet("Kitteh");
		organicsInPlayhouse.add(kitteh);
		VirtualPet bork = new VirtualPet("Bork");
		robotsInPlayhouse.add(bork);
		VirtualPet meowth = new VirtualPet("Meowth");
		robotsInPlayhouse.add(meowth);
		
		
		do {
			
			System.out.println("Welcome to Ronny's Playhouse!");
			System.out.println("");
			ronnysPlayhouse.printAllPetNames();
			System.out.println("");
			robotsPlayhouse.printAllRobotPetNames();
			
			System.out.println("");
			System.out.println("Here are some options for you!");
			System.out.println("1: Would you like to feed the fluffy pets?");
			System.out.println("2: Would you like to oil the robot pets?");
			System.out.println("3: Would you like to water all the fluffy pets?");
			System.out.println("4: Would you like to clean the fluffy dog cages?");
			System.out.println("5: Would you like the clean the kitty litter boxes?");
			System.out.println("6: Would you like to provide maintenance for your robot pets?");
			System.out.println("7: Would you like to walk the dogs?");
			System.out.println("8: Which pet would you like to give a treat to?");
			System.out.println("9: Which pet would you like to play with?");
			System.out.println("10: Which pet would you like to adopt?");
			System.out.println("11: Would you like to admit a fluffy pet?");
			System.out.println("12: Would you like to admit a robot pet?");
			System.out.println("13: Quit. ");
			
			int userInput = input.nextInt();
			
			switch (userInput) {
			case 1:
				if (ronnysPlayhouse.areOrganicPetsHungry()) {
					System.out.println("You fed the pets!");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				} else {
					System.out.println("Pets were not hungry afterall."); 
					ronnysPlayhouse.makeAllOrganicPetsTick();
					}
			break;
			case 2: 
				if (robotsPlayhouse.areRobotsNeedingOil()) {
					System.out.println("You oiled your robots");
					robotsPlayhouse.makeAllRobotPetsTick();
				} else {
					System.out.println("No Oil Needed.");
					robotsPlayhouse.makeAllRobotPetsTick();
				}
			break;
			case 3:
				if (ronnysPlayhouse.areOrganicPetsThirsty()) {
					System.out.println("You watered the fluffy doggo's and kitties!");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				} else {
					System.out.println("They're just going to let the water sit. Not thirsty at this time.");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				}
			break;
			case 4:
				if(ronnysPlayhouse.isDogCagesDirty()) {
					System.out.println("You cleaned the dog cages!");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				} else {
					System.out.println("Cages were just cleaned!");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				}
			break;
			case 5:
				if(ronnysPlayhouse.isCatLitterDirty()) {
					System.out.println("You cleaned the kitty litter boxes!");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				} else {
					System.out.println("Kitty litter is clean!");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				}
			break;
			case 6:
				if(robotsPlayhouse.areRobotsNeedingMaintenance()) {
					System.out.println("Robots are Perfect!");
					robotsPlayhouse.makeAllRobotPetsTick();
				} else {
					System.out.println("Robots are already perfect!");
					robotsPlayhouse.makeAllRobotPetsTick();
				}
			break;
			case 7:
				if(ronnysPlayhouse.isDogNeedingWalked()) {
					System.out.println("Let's take the floof dogs for a walk!");
					System.out.println("Doggos enjoyed the walk! Nice job!");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				} else {
					System.out.println("They're pooped. They don't need a walk.");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				}
			break;
//			case 8:
//					System.out.println("Which pet would you like to give a treat to today?");
//					input.nextLine();
//					String nameOrganic = input.nextLine();
//					System.out.println("Please provide the pet a treat.");
//					String treat = input.nextLine();
//					ronnysPlayhouse.printAllPetNames();
//				if(ronnysPlayhouse.arePetsGettingATreat()) {
//					System.out.println("You gave your pet a treat!");
//					ronnysPlayhouse.makeAllPetsTick();
//				} else {
//					System.out.println("They didn't want a treat? First time for everything.");
//					ronnysPlayHouse.makeAllPetsTick();
//				}
//			break;
			case 9:
				if(ronnysPlayhouse.areOrganicPetsNeedingPlay()) {
					System.out.println("You played with all your pets!");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				} else {
					System.out.println("They didn't want to play after-all.");
					ronnysPlayhouse.makeAllOrganicPetsTick();
				}
				
			break;
			case 10:
					System.out.println("Please choose a pet that you would like to adopt?");
					ronnysPlayhouse.printAllPetNames();
					robotsPlayhouse.printAllRobotPetNames();
					System.out.println("Please enter their name here. ");
					input.nextLine();
					String adoptPet = input.nextLine();
					String adoptRoboPet = input.nextLine();
					ronnysPlayhouse.adoptPetByName(adoptPet);
					robotsPlayhouse.adoptPetByRobotName(adoptRoboPet);
					System.out.println("You have adopted your pet. Please take great care of them!");
					System.out.println("Remaining pets in the shelter as follows:");
					ronnysPlayhouse.printAllPetNames();
					robotsPlayhouse.printAllRobotPetNames();
			break;
			case 11:
					System.out.println("Do you have a fluffy pet you would like to admit today?");
					System.out.println("If so, what is their name?");
					input.nextLine();
					String name = input.nextLine();
					System.out.println("Please provide the type of pet you are admitting.");
					String type = input.nextLine();
					ronnysPlayhouse.admitPetByName(name, type);
					System.out.println("We will take great care of your floofs.");
			break;
			case 12:
					System.out.println("Do you have a robot pet you would like to admit today?");
					System.out.println("If so, what is their name?");
					input.nextLine();
					String robotName = input.nextLine();
					robotsPlayhouse.admitPetRobotByName(robotName);
					System.out.println("We will take great care of your little robot.");
			break;
			case 13:
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			
			default:
				System.out.println("You did not enter a valid response. Try again.\n");
				continue;
				
			}	
			
		} while (ronnysPlayhouse.isBored());
			if (ronnysPlayhouse.isBored()) {
			System.out.println("Pet's were bored and they ran away. Sadface.");
			}
		System.out.println("Game over.");
		
		input.close();
	}

}
