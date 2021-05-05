package gun4Odev3.Concrete;

import gun4Odev3.Abstract.GamerCheckService;
import gun4Odev3.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfPerson(Gamer gamer) {
		if (gamer.getNationalId().length()==11) {
			return true;
		}
		return false;
	}

}