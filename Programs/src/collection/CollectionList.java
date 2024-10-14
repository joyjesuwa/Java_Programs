package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionList {

	public static void main(String[] args) {
		
		//List
		List<String> techList = new ArrayList<>();
		techList.add("Java");
		techList.add("Salesforce");
		techList.add("Python");
		techList.add("AI/ML");
		
		System.out.println(techList);
		techList.remove(0);
		System.out.println(techList);
		
		
		for(String tech : techList) {
			System.out.println(tech);
		}
		
		
		//Set
		Set<String> techSet = new HashSet<>();
		techSet.add("C#");
		techSet.add("Cloud");
		techSet.add("Data Analysis");
		
		System.out.println(techSet);
		techSet.remove(0);
		System.out.println(techSet);
		
		//Map
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		System.out.println(numbers);
		numbers.remove("One");
		System.out.println(numbers);
		
		 
//        HashMap<String, Integer> hs = new HashMap<>();
// 
//        hs.put("System", 1);
//        hs.put("for", 2);
//        hs.put("Process", 3);
//        hs.put("Computer", 4);
//        hs.put("Science", 5);
//        hs.put("Portal", 6);
 

//        MapValuesToList obj = new MapValuesToList(hs);
// 
//        List<Integer> mapvaltolist = obj.mapvaltolist(hs);
// 
//        for (Integer integerList : mapvaltolist) {
// 
//            System.out.println(integerList);
//            
//            
//        }
        
        //map()
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        List<Integer> squares = number.stream().collect(Collectors.toList());
        
        for(Integer tech : square) {
			System.out.println(tech);
		}
        
        System.out.println(squares);
        
        //filter()
        List<String> names = Arrays.asList("Start","Reflection","Collection","Stream");
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        
        System.out.println(result);
        
        //sort()
        List<String> name = Arrays.asList("Reflection","Collection","Stream");
        List<String> results = name.stream().sorted().collect(Collectors.toList());
        
        System.out.println(results);
        
        //collect()
        List<Integer> numberList = Arrays.asList(2,3,4,5,3);
        Set<Integer> squareSet = numberList.stream().map(x->x*x).collect(Collectors.toSet());
        
        System.out.println(squareSet);
        
        //forEach()
        List<Integer> numberList1 = Arrays.asList(2,3,4,5);
        numberList1.stream().map(x->x*x).forEach(y->System.out.println(y));

	}

}
