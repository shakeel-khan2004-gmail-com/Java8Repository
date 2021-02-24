import java.util.*;
  class emp implements Comparable<emp>{
	
	Integer id;
	String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public emp() {
		super();
	}
	public emp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(emp o) {
		return this.getId().compareTo(o.getId());
	}

}
 class CompExp  {

	public static void main(String[] args) {
		emp e1 = new emp(2,"shakeel");
		emp e2 = new emp(1,"amir");
		List<emp> list = new ArrayList<emp>();
		list.add(e1);
		list.add(e2);
		Collections.sort(list);
		for(emp e: list)
		{
			System.out.println("e.getId()==="+e.getId()+"e.getName()=="+e.getName());
		}
	}

}
