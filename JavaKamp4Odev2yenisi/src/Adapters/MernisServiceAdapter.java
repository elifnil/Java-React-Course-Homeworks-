package Adapters;

import java.rmi.RemoteException;
import java.util.Date;

import org.apache.axis.utils.JavaUtils.ConvertCache;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()) , customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
	
	}

}
