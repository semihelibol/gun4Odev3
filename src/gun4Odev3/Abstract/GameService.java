package gun4Odev3.Abstract;

import gun4Odev3.Entities.Campaign;
import gun4Odev3.Entities.Game;
import gun4Odev3.Entities.Gamer;

public interface GameService {

	void add(Game game);

	void update(Game game);

	void delete(Game game);

	void sellGame(Game game, Gamer gamer);

	void sellGame(Game game, Gamer gamer, Campaign campaign);
}
