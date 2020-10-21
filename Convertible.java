
public class Convertible extends Carr {
	private boolean isHoddOpen;

	public Convertible(int noOfWheel, int noOfPaasenger, int model, String make, int noofDoor, boolean isHoddOpen) {
		super(noOfWheel, noOfPaasenger, model, make, noofDoor);
		this.isHoddOpen = isHoddOpen;
	}

	public boolean isHoddOpen() {
		return isHoddOpen;
	}

	public void setHoddOpen(boolean isHoddOpen) {
		this.isHoddOpen = isHoddOpen;
	}

	@Override
	public void display() {
		super.display();
		System.out.println(" isHoddOpen="  +isHoddOpen);
	}

}
