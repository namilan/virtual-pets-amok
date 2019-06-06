
public class RobotDog extends VirtualPet implements Robotic {
	
	int health = 50;
	int maintenance = 23;
	int oil = 23;
	
	public int getHealth() {
		return this.health;
	}
	
	public int getMaintenance () {
		return this.maintenance;
	}
	
	public int getOil() {
		return this.oil;
	}
	
	public void oilRobot() {
		this.oil += 5;
		this.happiness +=2;
	}
	
	public void walkDog() {
		this.oil -= 2;
		this.maintenance +=2;
		this.happiness += 2;
	}
	
	public void routineMaintenance() {
		this.maintenance +=5;
		this.health +=2;
		this.happiness +=2;
	}
	
	public boolean isNeedingOil() {
		return oil >= 23;
	}
	
	public boolean isNotNeedingOil() {
		return oil <=23;
	}
	
	public boolean isNeedingMaintenance() {
		return maintenance >=23;
	}
	
	public boolean isNotNeedingMaintenance() {
		return maintenance <=23;
	}
	
	public void robotDogTick() {
		health -= 5;
		oil -= 2;
		maintenance +=5;
	}
	
	boolean isRobotAlive() {
		if(oil < 100 && maintenance < 100) {
			return true;
		} else {
			return false;
		}
	}

}
