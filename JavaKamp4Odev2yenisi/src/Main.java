import java.sql.Date;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1, "Engin", "Demiroð", LocalDate.of(1989,05,6), "123456789" ));
		System.console();

	}

}