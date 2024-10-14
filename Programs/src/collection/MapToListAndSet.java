package collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapToListAndSet {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ABC");
		map.put(2, "CDE");
		map.put(3, "EFG");
		map.put(4, "");
		map.put(1, "XYZ");
		
		
		System.out.println(map);
		
		Set<Integer> set = map.keySet().stream().collect(Collectors.toSet());
		System.out.println(set);
		
		List<String> list = map.values().stream().collect(Collectors.toList());
		System.out.println(list);
		
		


	}

}
