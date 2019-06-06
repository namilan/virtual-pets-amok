
public class RobotCat extends VirtualPet implements Robotic{
	
	int health = 75;
	int maintenance = 55;
	int oil = 62;

	public int getMaintenance() {
		return this.maintenance;
	}
	
	public int getOil() {
		return this.oil;
	}
	
	public void oilRobot() {
		this.oil += 5;
		this.happiness +=2;
	}
	
	public void routineMaintenance() {
		this.maintenance +=5;
		this.health +=2;
		this.happiness +=2;
	}
	
	public boolean isNeedingOil() {
		return oil >= 62;
	}
	
	public boolean isNotNeedingOil() {
		return oil <=62;
	}
	
	public boolean isNeedingMaintenance() {
		return maintenance >=55;
	}
	
	public boolean isNotNeedingMaintenance() {
		return maintenance <=55;
	}
	
	public void robotCatTick() {
		health -= 5;
		oil -= 2;
		maintenance +=5;
	}


}
