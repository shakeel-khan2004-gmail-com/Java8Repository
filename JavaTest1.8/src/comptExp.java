import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
  class empt {
	
	Integer id;
	String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public empt() {
		super();
	}
	public empt(Integer id, String name) {
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

}
 class comptExp  {

	public static void main(String[] args) {
		empt e1 = new empt(2,"shakeel");
		empt e2 = new empt(1,"amir");
		List<empt> list = new ArrayList<empt>();
		list.add(e1);
		list.add(e2);
		Collections.sort(list, new Comparator<empt>()	{
				@Override
				public int compare(empt e1,empt e2)
				{
			   return  e1.getName().compareTo(e2.getName());
				}
				});
		for(empt e: list)
		{
			System.out.println("e.getId()==="+e.getId()+"e.getName()=="+e.getName());
		}
	}

}
