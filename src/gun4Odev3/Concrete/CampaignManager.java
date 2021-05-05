package gun4Odev3.Concrete;

import gun4Odev3.Abstract.CampaignService;
import gun4Odev3.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi. "+campaign.getName());		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi. "+campaign.getName());	
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi. "+campaign.getName());			
	}

}
