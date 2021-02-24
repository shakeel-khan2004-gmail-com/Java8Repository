import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(5, "shakeel");
		Customer c2 = new Customer(8, "amer");
		Map<Customer, String> map = new TreeMap<Customer,String>(new Comparator<Customer>() {
			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.getName().compareTo(c2.getName());
			}
		});
		map.put(c1, "Sales");
		map.put(c2, "Management");

		for (Map.Entry<Customer, String> entry : map.entrySet()) {
			System.out.println("key===========" + entry.getKey().getId() + "--------" + entry.getKey().getName());
		}
	}

}
