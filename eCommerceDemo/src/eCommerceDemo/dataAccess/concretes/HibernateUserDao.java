package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
    List<User> users = new ArrayList<>();
    
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi " + user.getName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi " + user.getName());
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByMail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	 @Override
	    public boolean emailCheck(User user) {

	        for (User u : users)
	            if (u.geteMail() == user.geteMail()) {
	                return false;
	            }
	        return true;
	    }


	    @Override
	    public boolean loginByCheck(String email, String password) {
	        for (User user : users) {
	            if (user.geteMail() == email && user.getPassword() == password)
	                return true;
	        }
	        return false;
	    }

}
