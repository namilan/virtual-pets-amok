import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {
	
	List<VirtualPet> organicsInPlayhouse;
	List<VirtualPet> robotsInPlayhouse;
	
	public List <VirtualPet> getOrganicsInPlayhouse(){
		return organicsInPlayhouse;
	}
	
	public List <VirtualPet> getRobotsInPlayhouse(){
		return robotsInPlayhouse;
	}
	
	public String getUserPetName() {
		return this.getUserPetName();
	}
	
	public void printAllPetNames() {
		System.out.println("Here are the current fluffy pets in the Shelter:");
		for (VirtualPet currentPet : getOrganicsInPlayhouse()) {
			System.out.println(currentPet.getUserPetName());
		}
	}
	
	public void printAllRobotPetNames() {
		System.out.println("Here are the current robot pets in the Shelter: ");
		for (VirtualPet currentRobot : getRobotsInPlayhouse()) {
			System.out.println(currentRobot.getUserPetName());
		}
	}
	
	public void adoptPets(VirtualPet pet) {
		this.organicsInPlayhouse.remove(pet);
	}
	
	public void adoptPetByName(String name) {
		for(int x = 0; x < this.organicsInPlayhouse.size(); x++) {
			VirtualPet currentPet = new VirtualPet();
			currentPet = this.organicsInPlayhouse.get(x);
			if(currentPet.getUserPetName().equalsIgnoreCase(name)) {
				this.organicsInPlayhouse.remove(x);
			}
		}
	}
	
	public void adoptPetRobot(VirtualPet robot) {
		this.robotsInPlayhouse.remove(robot);
	}
	
	public void adoptPetByRobotName(String name) {
		for(int r = 0; r < this.robotsInPlayhouse.size(); r++) {
			VirtualPet currentRobot = new VirtualPet();
			currentRobot = this.robotsInPlayhouse.get(r);
			if(currentRobot.getUserPetName().equalsIgnoreCase(name)) {
				this.robotsInPlayhouse.remove(r);
			}
		}
	}

	public boolean isAdmit(VirtualPet pet) {
		return this.organicsInPlayhouse.add(pet);
	}
	
	public void admitPetByName(String name) {
		VirtualPet newPet = new VirtualPet (name);
		this.organicsInPlayhouse.add(newPet);
	}
	
	public boolean isRobotAdmit(VirtualPet robot) {
		return this.robotsInPlayhouse.add(robot);
	}
	
	public void admitPetRobotByName(String name) {
		VirtualPet newRobot = new VirtualPet (name);
		this.robotsInPlayhouse.add(newRobot);
	}
	
	public boolean areOrganicPetsThirsty() {
		for(VirtualPet currentPet : getOrganicsInPlayhouse()) {
			if(currentPet.getClass().getName().equals("Cat")  ) {
				if(((Cat)currentPet).isThirsty()) {
					return true;
				}
			} 
			
			if(currentPet.getClass().getName().equals("Dog")  ) {
				if(((Dog) currentPet).isThirsty()) {
					return true;
				}
				
			}
			
		}
		
			return false;
	}
	
	public boolean areOrganicPetsHungry() {
		for(VirtualPet currentPet : getOrganicsInPlayhouse()) {
			if(currentPet.getClass().getName().equals("Cat")) {
				if(((Cat) currentPet).isHungry()) {
					return true;
				}
			}
			
			if(currentPet.getClass().getName().equals("Dog")) {
				if(((Dog) currentPet).isHungry()) {
					return true;
				}
			}
		}
		
			return false;
	}
	
	public boolean areRobotsNeedingOil() {
		for (VirtualPet currentRobot : getRobotsInPlayhouse()) {
			if(currentRobot.getClass().getName().equals("Robot Cat")) {
				if(((RobotCat) currentRobot).isNeedingOil()) {
				return true;
			}
		}
		
		if(currentRobot.getClass().getName().equals("Robot Dog")) {
			if(((RobotDog) currentRobot).isNeedingOil()) {
				return true;
			}
		}
	}
			return false;
	}
	
	public boolean areRobotsNeedingMaintenance() {
		for(VirtualPet currentRobot : getRobotsInPlayhouse()) {
			if(currentRobot.getClass().getName().equals("Robot Cat")) {
				if (((RobotCat) currentRobot).isNeedingMaintenance()) {
					return true;
				}
			}
			
			if(currentRobot.getClass().getName().equals("Robot Dog")) {
				if(((RobotDog) currentRobot).isNeedingMaintenance()) {
					return true;
				}
			}
		}
			return false;
	}
	
	public boolean isDogCagesDirty() {
		for(VirtualPet currentPet : getOrganicsInPlayhouse()) {
			if(currentPet.getClass().getName().equals("Dog")) {
				if(((Dog) currentPet).isDogCageDirty()) {
					return true;
				}
			}
		}
			return false;
	}
	
	public boolean isCatLitterDirty() {
		for(VirtualPet currentPet : getOrganicsInPlayhouse()) {
			if(currentPet.getClass().getName().equals("Cat")) {
				if(((Cat) currentPet).isLitterBoxDirty()) {
					return true;
				}
			}
		}
			return false;
	}
	
	public void makeAllOrganicPetsTick() {
		for(VirtualPet currentPet : getOrganicsInPlayhouse()) {
			currentPet.tick();
		}
	}
	
	public void makeAllRobotPetsTick() {
		for(VirtualPet currentRobot : getRobotsInPlayhouse()) {
			currentRobot.tick();
		}
	}
		
	public void makeOrganicCatsTick() {
		for(VirtualPet currentPet : getOrganicsInPlayhouse()) {
			((Cat) currentPet).catTick();
		}
	}
	
	public void makeOrganicDogsTick() {
		for(VirtualPet currentPet : getOrganicsInPlayhouse()) {
			((Dog) currentPet).dogTick(); 
		}
	}
	
	public void makeRobotDogTick() {
		for(VirtualPet currentRobot : getRobotsInPlayhouse()) {
			((RobotDog) currentRobot).robotDogTick();
		}
	}
	
	public void makeRobotCatTick() {
		for(VirtualPet currentRobot : getRobotsInPlayhouse()) {
			((RobotCat) currentRobot).robotCatTick();
		}
	}
	
}
