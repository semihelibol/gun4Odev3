package gun4Odev3;

import java.util.Date;

import gun4Odev3.Adapters.MernisServiceAdapter;
import gun4Odev3.Concrete.CampaignManager;
import gun4Odev3.Concrete.GameManager;
import gun4Odev3.Concrete.GamerManager;
import gun4Odev3.Entities.Campaign;
import gun4Odev3.Entities.Game;
import gun4Odev3.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1,"Semih","Elibol","32702187932",new Date(1986,3,26));
		
		Game game= new Game();
		game.setId(1);
		game.setName("PES 2021");
		game.setPrice(500);
		game.setDescription("Futbol Oyunu");
		
		Campaign campaign = new Campaign(1,"Yaz Kampanyaý", 10, true);
		System.out.println("-------------");
		
		GamerManager gamerManager= new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		System.out.println("-------------");
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		System.out.println("-------------");
		
		GameManager gameManager= new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		gameManager.sellGame(game, gamer);
		gameManager.sellGame(game, gamer, campaign);
		
		System.out.println("-------------");
		
	}

}
