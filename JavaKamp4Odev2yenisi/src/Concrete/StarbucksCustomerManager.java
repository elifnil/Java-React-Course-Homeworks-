package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{
	private ICustomerCheckService iCustomerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		super();
		this.iCustomerCheckService = iCustomerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		try {
			if(iCustomerCheckService.checkIfRealPerson(customer)) {
			    super.Save(customer);
			}
			else {
				System.out.println("Not a valid person..");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






	
	

}
