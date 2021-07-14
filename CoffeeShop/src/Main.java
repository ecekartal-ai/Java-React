import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Entities.DateTime;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager neCustomerManager = new NeroCustomerManager();
		BaseCustomerManager stCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		neCustomerManager.save(new Customer(57283445974L, "Ece", "Kartal", new DateTime(31, 3, 1998)));
		stCustomerManager.save(new Customer(12914614952L, "Ege", "Kartal", new DateTime(14, 5, 2005)));
		
		System.out.println("\n");
	}

}
