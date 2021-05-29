package eCommerceDemo.business.concretes;

import java.util.List;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstractcs.LoginVerificationService;
import eCommerceDemo.core.abstractcs.ValidatorService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userdao;
	
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public void add(User user) {
		System.out.println("�yeli�iniz ba�ar�yla Olu�turuldu.");
		this.userdao.add(user);
	}

	@Override
	public void update(User user) {
		this.userdao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userdao.delete(user);;
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	LoginVerificationService loginVerificationService;
    UserDao userDao;
    ValidatorService validatorService;

    public UserManager(LoginVerificationService loginVerificationService,
                       UserDao userDao, ValidatorService validatorService) {
        this.loginVerificationService = loginVerificationService;
        this.userDao = userDao;
        this.validatorService = validatorService;

    }


    @Override
    public void register(User user) {
        if (!loginVerificationService.isValid(user)) {
            System.out.println("Kullan�c� bilgileri yanl��. Kay�t i�lemi BA�ARISIZ!!!");
        } else if (!userDao.emailCheck(user)) {
            System.out.println("Bu email adresi daha �nce al�nm�� ---> " + user.geteMail() + "\n" + "Kay�t i�lemi BA�ARISIZ!!!");

        } else {
            userDao.add(user);
            validatorService.sendVerificationMail();
        }
    }

    @Override
    public void login(String email, String password) {
        if (userDao.loginByCheck(email, password)) {
            System.out.println("Giri� Ba�ar�l�.");
        } else {
            System.out.println("Kullan�c� ad� yanl�� veya kullan�c� yok. Giri� BA�ARISIZ!!!");
        }
    }
	

}
