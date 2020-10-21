
public class Studenttt {

	private String name;
	private String id;
	private int grade;
	public Studenttt(String name, String id, int grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	public Studenttt(String name, String id) {
		this(name, id, 0);
		this.name = name;
		this.id = id;
	}
	public Studenttt(String id) {
		this("", id);
		this.id = id;	
	}
	public void display() {
		System.out.println("name: " + name + " id: " + id + " grade: " + grade);
	}
	public void display(int year) {
		this.display();
		System.out.println("year: " + year);
	}
}
