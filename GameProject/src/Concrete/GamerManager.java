package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {
	
	private IGamerCheckService gamerCheckService;

	public GamerManager(IGamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ho�heldiniz! " + gamer.getNickName() + ". Kimlik do�rulama ba�ar�l�");
		}else {
			System.out.println("Kimlik dorulama ba�ar�s�z.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ho�heldiniz! " + gamer.getNickName() + ". Bilgileriniz g�ncellendi.");
		}else {
			System.out.println("G�ncelleme Ba�ar�s�z!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("User " + gamer.getNickName() + " silindi.");
		
	}

}
