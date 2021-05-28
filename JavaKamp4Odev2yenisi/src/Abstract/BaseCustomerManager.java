package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to database firstname :  " + customer.getFirstName());
		System.out.println("Saved to database lastname:  " + customer.getLastName());
		System.out.println("Saved to database  dateOfBirth:  " + customer.getDateOfBirth());
		System.out.println("Saved to database citizenID :  " + customer.getNationalityId());
		
	}

}
