package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customer_CheckService;
	
	public StarbucksCustomerManager() {
		
	}
	
	public CustomerCheckService getCustomer_CheckService() {
		return customer_CheckService;
	}

	public void setCustomer_CheckService(CustomerCheckService customer_CheckService) {
		this.customer_CheckService = customer_CheckService;
	}

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		setCustomer_CheckService(customerCheckService);
	}
	
	public void save(Customer customer) {
		
		//CustomerCheckManager customerCheckManager = new CustomerCheckManager();
		if(customer_CheckService.checkIfRealPerson(customer)) {
			System.out.printf("Starbucks: Saved to database " + customer.getName() + " " + customer.getSurname() + "\n");
		}
		else {
			System.out.println("Not a valid nationality ID for " + customer.getName() + " " + customer.getSurname() + "\n");
		}
	}
}
