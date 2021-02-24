import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap8 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("shakeel", 1002);
		map.put("deep", 1000);
		map.put("sunil", 1001);
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey()).filter(e->e.getKey().startsWith("s"))
		.forEach(e->System.out.println(e));

	}

}
