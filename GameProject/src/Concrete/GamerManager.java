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
			System.out.println("Hoþheldiniz! " + gamer.getNickName() + ". Kimlik doðrulama baþarýlý");
		}else {
			System.out.println("Kimlik dorulama baþarýsýz.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Hoþheldiniz! " + gamer.getNickName() + ". Bilgileriniz güncellendi.");
		}else {
			System.out.println("Güncelleme Baþarýsýz!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("User " + gamer.getNickName() + " silindi.");
		
	}

}
