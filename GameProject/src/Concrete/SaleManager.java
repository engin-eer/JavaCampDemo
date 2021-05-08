package Concrete;

import Abstract.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + ", " + game.getGameName() + " satýn alýndý. "+ 
				" Fiyatý : "+ game.getPrice()+" dolar");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(campaign.getCampaignName()+": Merhaba " + gamer.getNickName() + ", " + 
				 game.getGameName()  + " % " + campaign.getDiscountRate() + " indirimli olarak "+
				campaign.getUnitPriceAfterDiscount()+" dolara satýn alýndý "
			     );
		
	}

}
