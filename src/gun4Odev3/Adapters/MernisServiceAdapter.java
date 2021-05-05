package gun4Odev3.Adapters;

import java.rmi.RemoteException;

import gun4Odev3.Abstract.GamerCheckService;
import gun4Odev3.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfPerson(Gamer gamer) {
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(
					  Long.parseLong(gamer.getNationalId()), 
					  gamer.getFirstName(), 
					  gamer.getLastName(), 
					  gamer.getYearOfBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}
	
}
