package javaHomework3;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + " eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " silindi." );
	}
	
	public void update(User user) {
		System.out.println(user.getId() + "  güncellendi.");
	}

}
