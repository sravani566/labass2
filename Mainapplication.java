import java.util.*;
public class Mainapplication {
	private static Scanner sc = new Scanner(System.in);
	private static Studenttt student;
	public static void main(String[] args) {
		System.out.println(" enter name yes/no");
		String isName = sc.next();
		System.out.println("enter id yes/no");
		String isId = sc.next();
		System.out.println("enter grade yes/no");
		String isgrade = sc.next();
		if (isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes") && isgrade.equalsIgnoreCase("yes")) {
			System.out.println("Enter name, id and grade values");
			String name = sc.next();
			String id = sc.next();
			int  grade = sc.nextInt();
			student = new Studenttt(name, id, grade);
			displayDetails();
		} 
		else if (isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes") && !isgrade.equalsIgnoreCase("yes")) {
			System.out.println("Enter name, id values");
			String name = sc.next();
			String id = sc.next();
			student = new Studenttt(name, id);
			displayDetails();
		}
		else if (!isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes") && !isgrade.equalsIgnoreCase("yes")) {
			System.out.println("Enter id value");
			String id = sc.next();
			student = new Studenttt(id);
			displayDetails();
		} 
		else {
			System.out.println("you must atleast select name or id");
		}
	}
	public static void displayDetails() {
		System.out.println("Do you want to enter year yes/no");
		String isYear = sc.next();
		if (isYear.equalsIgnoreCase("yes")) {
			System.out.println("Enter year");
			int year = sc.nextInt();
			student.display(year);
		} else {
			student.display();
		}
	}
}

	
