package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	User getByMail(String email);
	List<User> getAll();
	boolean emailCheck(User user);
	boolean loginByCheck(String email, String password);


}
