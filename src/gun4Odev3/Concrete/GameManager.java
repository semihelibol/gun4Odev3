package gun4Odev3.Concrete;

import gun4Odev3.Abstract.GameService;
import gun4Odev3.Entities.Campaign;
import gun4Odev3.Entities.Game;
import gun4Odev3.Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Eklendi. " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Güncellendi. " + game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi. " + game.getName());
	}

	@Override
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getName()+ " adlý oyun satýldý.\n Fiyat: "+game.getPrice()
			+" \n Alan Oyuncu: "+ gamer.getFirstName()+" "+gamer.getLastName());
	}

	@Override
	public void sellGame(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName()+ " adlý oyun satýldý.\n Fiyat: "+game.getPrice()
			+"\n Kampanya Ýsmi: "+campaign.getName()+"\n Kampanyalý Fiyatý: "+game.getCampaignPrice(campaign)
			+" \n Alan Oyuncu: "+ gamer.getFirstName()+" "+gamer.getLastName());

	}

}
