package chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx4 {

	public static void main(String[] args) {
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("name", "홍길동");
		hm.put("id", "hong");
		hm.put("age", 30);
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "이순신");
		hm.put("id", "lee");
		hm.put("age", 40);
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "김유신");
		hm.put("id", "kim");
		hm.put("age", 50);
		list.add(hm);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println("인덱스 : "+i
					+", 이름 : "+list.get(i).get("name")
					+", 아이디 : "+list.get(i).get("id")
					+", 나이 : "+list.get(i).get("age"));
		}

	}

}

