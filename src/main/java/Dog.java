
public class Dog extends VirtualPet {
	
	int health = 50;
	int hunger = 30;
	int thirst = 15;
	int cageCleanliness = 75;
	
	
	public int getHealth() {
		return this.health;
	}
	public int getHunger() {
		return this.hunger;
	}
	
	public int getThirst() {
		return this.thirst;
	}
	
	public int getCleanliness() {
		return this.cageCleanliness;
	}
	
	public void walkTheDog() {
		this.cageCleanliness -= 5;
		this.happiness += 5;
	}
	
	public boolean isHungry() {
		return hunger >=50;
	}
	
	public boolean isNotHungry() {
		return hunger <=50;
	}
	
	public boolean isThirsty() {
		return thirst >=50;
	}
	
	public boolean isNotThirsty() {
		return thirst <=50;
	}
	
	public boolean isDogCageClean() {
		return cageCleanliness >= 75;
	}
	
	public boolean isDogCageDirty() {
		return cageCleanliness <=75;
	}
	
	public void dogTick() {
		health -= 5;
		hunger += 5;
		thirst += 5;
		cageCleanliness -= 5;
		
	}
	
	public boolean isOrganicAlive() {
		if(hunger < 100 && bored < 100 && thirst < 100) {
			return true;
	} else {
		return false;
		}
	}

}
