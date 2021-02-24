import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MapTest {

	public static void main(String[] args) {
		List<String> listString= new ArrayList<String>();
		
		
		List listOfIntegers = Stream.of("1", "2", "3", "4") .map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println("---------==="+listOfIntegers);
		
		//listString.stream().filter(p->p.startsWith("s")).forEach(p->System.out.println(p));

		listString.add("shakeel");
		listString.add("shaam");
		listString.add("shakib");
		listString.add("anil");
		listString.add("deep");
		listString.add("rakesh");
		listString.stream().filter(p->p.startsWith("s"))
		.map(p->p.toUpperCase())
		.sorted((p1,p2)->p1.compareTo(p2))
		.collect(Collectors.toList())
		.forEach(p->System.out.println(p));
	//	System.out.println("======="+listString);
			
	}

}
