package odev2;

public class Appointment {
	public Appointment() {
		System.out.println("Ben çalýþtým");
	}
	
	public Appointment(int id, String name, String lastName, String complaint) {
		
		this.id = id;
		this.name = name;
		this.lastName =lastName;
		this.complaint = complaint;
	}
	int id;
	String name;
	String lastName;
	String complaint;
	
	

}
