import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapJava8Exp {

	public static void main(String[] args) {
		List<String> listofInts=Arrays.asList(5, 7, 11,13).stream()
				  .map(list->list.toString()).collect(Collectors.toList());
				  //.forEach(list->System.out.println(list));
		 System.out.println("The Structure after flattening is : " + 
                 listofInts); 
	}

}
