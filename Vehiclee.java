
public class Vehiclee {
	private int noOfWheel;
	private int noOfPaasenger;
	private int model;
	private String make;

	public Vehiclee(int noOfWheel, int noOfPaasenger, int model, String make) {

		this.noOfWheel = noOfWheel;
		this.noOfPaasenger = noOfPaasenger;
		this.model = model;
		this.make = make;
	}

	public void display(){
		// TODO Auto-generated method stub

		System.out.println("Vehiclee " + "[noOfWheel=" + noOfWheel + ", noOfPaasenger=" + noOfPaasenger + ", model="
				+ model + ", make=" + make + "]");
	}

}
