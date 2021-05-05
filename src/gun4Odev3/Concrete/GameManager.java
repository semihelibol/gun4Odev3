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
		System.out.println("Oyun G�ncellendi. " + game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi. " + game.getName());
	}

	@Override
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getName()+ " adl� oyun sat�ld�.\n Fiyat: "+game.getPrice()
			+" \n Alan Oyuncu: "+ gamer.getFirstName()+" "+gamer.getLastName());
	}

	@Override
	public void sellGame(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName()+ " adl� oyun sat�ld�.\n Fiyat: "+game.getPrice()
			+"\n Kampanya �smi: "+campaign.getName()+"\n Kampanyal� Fiyat�: "+game.getCampaignPrice(campaign)
			+" \n Alan Oyuncu: "+ gamer.getFirstName()+" "+gamer.getLastName());

	}

}
