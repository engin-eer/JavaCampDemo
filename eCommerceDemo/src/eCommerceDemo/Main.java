package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.EmailValidatorManager;
import eCommerceDemo.core.concretes.GoogleManagerAdapter;
import eCommerceDemo.core.concretes.LoginVerification;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		  User user1 = new User("Engin","Aydoðdu","engin1@engin.com","123456");
	        User user2 = new User("Engin2","Demiroð","engindemirog@gmail.com","456654");
	        User user3 = new User("Serdar","Kaya","serdar.com","456789");


	        UserService userService = new UserManager(new LoginVerification(), new HibernateUserDao(), new EmailValidatorManager());
	        //userService.register(user1);

	        System.out.println("----------------------------------");

	        userService.register(user1);

	        System.out.println("----------------------------------");

	        userService.register(user2);

	        System.out.println("----------------------------------");

	        userService.register(user3);

	        System.out.println("----------------------------------");



	        UserService userService2 = new UserManager(new GoogleManagerAdapter(), new HibernateUserDao(), new EmailValidatorManager());
	        userService2.register(user3);



	        System.out.println("----------------------------------");

	        userService.login("engin1@engin.com", "123456"); 

	        System.out.println("----------------------------------");

	        userService.login ("engindemirog@gmail.com", "5616165");


	}

}
