package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customer_CheckService;
	
	public NeroCustomerManager() {
		
	}
	
	public CustomerCheckService getCustomer_CheckService() {
		return customer_CheckService;
	}

	public void setCustomer_CheckService(CustomerCheckService customer_CheckService) {
		this.customer_CheckService = customer_CheckService;
	}

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		setCustomer_CheckService(customerCheckService);
	}
	
	public void save(Customer customer) {
		
		System.out.printf("Nero: Saved to database " + customer.getName() + " " + customer.getSurname() + "\n");
		
	}
}
