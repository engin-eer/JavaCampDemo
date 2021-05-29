package eCommerceDemo.core.abstractcs;

import eCommerceDemo.entities.concretes.User;

public interface LoginVerificationService {
	 boolean isValid(User user);
	 
	 

}
