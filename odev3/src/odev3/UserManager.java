package odev3;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " güncellendi");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " silindi");
	}
}
