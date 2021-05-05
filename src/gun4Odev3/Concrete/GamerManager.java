package gun4Odev3.Concrete;

import gun4Odev3.Abstract.GamerCheckService;
import gun4Odev3.Abstract.GamerService;
import gun4Odev3.Entities.Gamer;

public class GamerManager implements GamerService{
	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfPerson(gamer)) {
			System.out.println("Oyuncu kimlik bilgileri do�ruland�. "
					+ gamer.getFirstName()+" "+gamer.getLastName()+" ger�ek ki�idir.");
			System.out.println("Oyuncu Eklendi. "+ gamer.getFirstName()+" "+gamer.getLastName());				
		}else {
			System.out.println("Oyuncu kimlik bilgileri do�rulanmad�. "
					+gamer.getFirstName()+" "+gamer.getLastName()+" ki�isi bulunamad�.");
			System.out.println("Oyuncu Eklenemedi. ");	
		}		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfPerson(gamer)) {
			System.out.println("Oyuncu kimlik bilgileri do�ruland�. "
					+ gamer.getFirstName()+" "+gamer.getLastName()+" ger�ek ki�idir.");
			System.out.println("Oyuncu G�ncellendi. "+ gamer.getFirstName()+" "+gamer.getLastName());		
		}else {
			System.out.println("Oyuncu kimlik bilgileri do�rulanmad�. "
					+gamer.getFirstName()+" "+gamer.getLastName()+" ki�isi bulunamad�.");
			System.out.println("Oyuncu G�ncellenemedi.");	
		}			
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi. "+ gamer.getFirstName()+" "+gamer.getLastName());		
	}
}
