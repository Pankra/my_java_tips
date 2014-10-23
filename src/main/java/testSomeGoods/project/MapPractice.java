package testSomeGoods.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		
//		map.put("Field1", "1");
		map.put("Field2", "2");
		map.put("Field3", "3");
		map.put("Field4", "4");
		
		for (int i=1; i<10; i++) {
			map.put("Field1", map.get("Field1") + " " + i);
			System.out.println(map.get("Field1"));
			
		}
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println(map.get("Field33"));

	}

}
