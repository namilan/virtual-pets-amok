
public class Cat extends VirtualPet{
	
	int health = 75;
	int hunger = 25;
	int thirst = 35;
	int litterBox = 25;
	
	
	public int getHealth() {
		return this.health;
	}
	

	public int getHunger() {
		return this.hunger;
	}
	
	public int getThirst() {
		return this.thirst;
	}
	
	public int getCatLitterBox () {
		return this.litterBox;
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
	
	public boolean isLitterBoxClean() {
		return litterBox >=50;
	}
	
	public boolean isLitterBoxDirty() {
		return litterBox <=50;
	}
	
	public void catTick() {
		health -= 5;
		litterBox += 5;
		hunger += 2;
		thirst += 2;
	}
	
	public boolean isOrganicAlive() {
		if(hunger < 100 && bored < 100 && thirst < 100) {
			return true;
	} else {
		return false;
		}
	}	

}
