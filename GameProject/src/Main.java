import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Engin");
		gamer1.setLastName("Aydoðdu");
		gamer1.setNationalityId("11111");
		gamer1.setDateOfBirth(LocalDate.of(1990,1,1));;
		gamer1.setNickName("Star");

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);

		System.out.println("--------------------------------------------------");

		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Grand Theft Auto: San Andreas");
		game1.setPrice(200);

		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Grand Theft Auto: Vice City");
		game2.setPrice(300);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game2);

		System.out.println("-------------------------------------------------");

		Campaign campaign1 = new Campaign(1,game1.getPrice(),"Yaz Kampanyasý",20 );
		
		

		Campaign campaign2 = new Campaign(2,game2.getPrice(),"Bahar Kampanyasý",30);
		
		

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.update(campaign2);

		System.out.println("---------------------------------------");
		System.out.println();

		SaleManager saleManager = new SaleManager();
		System.out.println("*********Kampanyalý***********");
		System.out.println();
		saleManager.campaignSale(game2, gamer1,campaign2);
		saleManager.campaignSale(game1, gamer1,campaign1);
		System.out.println();
		System.out.println("*********Kampanyasýz************");
		System.out.println();
		saleManager.sale(game2, gamer1);


	}

}
