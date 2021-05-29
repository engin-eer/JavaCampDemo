package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstractcs.LoginVerificationService;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.google.GoogleManager;

public class GoogleManagerAdapter implements LoginVerificationService{
	
	 @Override
	    public boolean isValid(User user) {
	        GoogleManager googleManager = new GoogleManager();
	        return googleManager.isValid();
	    }

}
