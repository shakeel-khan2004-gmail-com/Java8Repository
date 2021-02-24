import java.util.LinkedHashMap;
import java.util.LinkedHashSet;



public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
System.out.println(i1+""+ i1.hashCode());
System.out.println(i2+""+ i2.hashCode());


System.out.println(i1.equals(i2));
System.out.println(i1==i2);




Employee e1 = new Employee(5,"xyz");
Employee e2 = new Employee(4,"xyz");
System.out.println(e1.getName()+"bbb=="+ e1.hashCode());
System.out.println(e2.getName()+""+ e2.hashCode());


System.out.println(e1.equals(e2));
System.out.println(e1==e2);


LinkedHashSet l = new LinkedHashSet();
LinkedHashMap l2 = new LinkedHashMap();

	}

}
