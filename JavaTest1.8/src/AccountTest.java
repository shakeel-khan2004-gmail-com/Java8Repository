import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AccountTest {

	public static void main(String[] args) {
		Account s1 = new Account(5, "shakeel");
		Account s2 = new Account(5, "shakeel");
		HashMap<Account, String> map = new HashMap<Account,String>();
		
		map.put(s1, "Sales");
		map.put(s2, "Sales1");
System.out.println("ssssssss=="+map.size());
System.out.println("ssssssss1=="+s1.hashCode());
System.out.println("ssssssss2=="+s2.hashCode());
		for (Map.Entry<Account, String> entry : map.entrySet()) {
			System.out.println("key===========" + entry.getKey().getId() + "--------==" + entry.getKey().getName() +"-------------=="+entry.getKey().hashCode());
		}
		
		//-----------------------------------------------------------
		/*s1.setName("Kumar");
		
		for (Map.Entry<Account, String> entry : map.entrySet()) {
			System.out.println("key===========" + entry.getKey().getId() + "--------==" + entry.getKey().getName() +"-------------=="+entry.getKey().hashCode());
		}
		System.out.println("s1==========" + map.get(s1));
		System.out.println("s1.getName()==========" + map.get(s1.getName()));
		System.out.println("s1.getId()=========" + map.get(s1.getId()));*/
	//---------------------------------------------------------------------------------------------------------------
	}

}
