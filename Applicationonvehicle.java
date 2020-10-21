import java.util.*;
public class Applicationonvehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehiclee veh;
		int ch; //choice
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice :\n 1.Vehicle \n 2.Car \n 3.Convertible \n 4.SportCar");
		ch=s.nextInt();
		if(ch==1)
		{
			veh=new Vehiclee(5,5,26,"US");
			veh.display();
		}
		if(ch==2)
		{
			veh=new Carr(5,5,26,"US",6);
			veh.display();
		}
		if(ch==3)
		{
			veh=new Convertible(5,5,26,"US",6,true);
			veh.display();
		}
		if(ch==4)
		{
			veh=new Sportcar(5,5,26,"US",100);
			veh.display();
		}
	}


	}

