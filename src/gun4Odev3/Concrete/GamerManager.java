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
			System.out.println("Oyuncu kimlik bilgileri doðrulandý. "
					+ gamer.getFirstName()+" "+gamer.getLastName()+" gerçek kiþidir.");
			System.out.println("Oyuncu Eklendi. "+ gamer.getFirstName()+" "+gamer.getLastName());				
		}else {
			System.out.println("Oyuncu kimlik bilgileri doðrulanmadý. "
					+gamer.getFirstName()+" "+gamer.getLastName()+" kiþisi bulunamadý.");
			System.out.println("Oyuncu Eklenemedi. ");	
		}		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfPerson(gamer)) {
			System.out.println("Oyuncu kimlik bilgileri doðrulandý. "
					+ gamer.getFirstName()+" "+gamer.getLastName()+" gerçek kiþidir.");
			System.out.println("Oyuncu Güncellendi. "+ gamer.getFirstName()+" "+gamer.getLastName());		
		}else {
			System.out.println("Oyuncu kimlik bilgileri doðrulanmadý. "
					+gamer.getFirstName()+" "+gamer.getLastName()+" kiþisi bulunamadý.");
			System.out.println("Oyuncu Güncellenemedi.");	
		}			
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi. "+ gamer.getFirstName()+" "+gamer.getLastName());		
	}
}
