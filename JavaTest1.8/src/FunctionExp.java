import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Test
{
	public void show();
}

public class FunctionExp {
	public static void main(String[] args) {
		System.out.println("------------Integer.MAX_VALUE==="+Integer.MAX_VALUE);
		System.out.println("-----------Integer.BYTES==="+Integer.BYTES);
		System.out.println("------------Integer.SIZE==="+Integer.SIZE);
		
		System.out.println("------------Long.MAX_VALUE==="+Long.MAX_VALUE);
		System.out.println("-----------Long.BYTES==="+Long.BYTES);
		System.out.println("------------Long.SIZE==="+Long.SIZE);
		
		System.out.println("------------Float.MAX_VALUE==="+Float.MAX_VALUE);
		System.out.println("-----------Float.BYTES==="+Float.BYTES);
		System.out.println("------------Float.SIZE==="+Float.SIZE);
		
		System.out.println("------------Double.MAX_VALUE==="+Double.MAX_VALUE);
		System.out.println("-----------Double.BYTES==="+Double.BYTES);
		System.out.println("------------Double.SIZE==="+Double.SIZE);
		
		
		HashMap map = new HashMap<>();
		ArrayList al = new ArrayList<>();
		LinkedList ll = new LinkedList();

		System.out.println("------------ll==="+ll.size());
		System.out.println("------------map==="+al.size());
		System.out.println("------------map==="+map.size());
		
   Test t =()->System.out.println("--------------Hi Functional");
		   t.show();

	Arrays.asList(new Employee(2,"amit"),new Employee(1,"shakeel")).stream()
	.sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList())
	.forEach((p->System.out.println("-------"+p.getId()+"----"+p.getName())));
	
	}

}
