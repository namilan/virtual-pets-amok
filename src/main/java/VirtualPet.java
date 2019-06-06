
public class VirtualPet {
	
	String name = "";
	int bored = 25;
	int happiness = 50;
	
	public VirtualPet() {
		
	}
	
	public VirtualPet(String name) {
		this.name = name;
	}
	
	public String getUserPetName() {
		return this.name;
	}
	
	public int getUserPetBored() {
		return this.bored;
	}
	
	public int getUserPetHappiness() {
		return this.happiness;
	}
	
	public boolean petIsNotBored() {
		return bored <=50;
	}
	
	public boolean petIsVeryBored() {
		return bored >=50;
	}

	public void play() {
		this.bored -= 5;
		this.happiness += 5;
	}
	
	public void tick() {
		bored += 2;
		happiness -= 2;		
	}
	
}
