package Adapter;
import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(customer.getNationalityID(),
					customer.getName().toUpperCase(), 
					customer.getSurname().toUpperCase(),
					customer.getBirthDate().getYear(customer.getBirthDate()));
		} catch (RemoteException e) {
			return false;
		}
	}

}
