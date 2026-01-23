package chapter14;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("name", "홍길동");
		hm.put("id", "hong");
		hm.put("age", 30);
		
		System.out.println(hm.get("name"));
		System.out.println(hm.get("id"));
		System.out.println(hm.get("age"));

	}

}
