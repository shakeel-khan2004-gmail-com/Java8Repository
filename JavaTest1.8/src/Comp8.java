import java.util.ArrayList;

public class Comp8 {

	public static void main(String[] args) {
		Customer c1  = new Customer(2,"shakeel");
		Customer c2 = new Customer(5,"amar");
		Customer c3  = new Customer(1,"jadhav");
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		list.stream().sorted((l1,l2)->l1.getName().compareTo(l2.getName())).forEach(p->System.out.println("p=="+p.getName()));

	}

}
