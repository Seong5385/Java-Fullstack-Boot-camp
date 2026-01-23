package chapter13;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		SortedSet set = new TreeSet();
		String from = "bat";
		String to = "d";
		
		// set객체에 추가
		set.add("ant");set.add("alias");
		set.add("batman");set.add("aha");
		set.add("cola");set.add("Cola");
		set.add("ddr");set.add("dance");
		set.add("dEEE");set.add("deee");
		set.add("ever"); set.add("giant");
		set.add("zoo");
		
		// 출력
		System.out.println(set);
		System.out.println("from:"+from+",to:"+to);
		// from~to 검색
		System.out.println(set.subSet(from, to));
		System.out.println("from:"+from+",to:"+to+"zzzz");
		// from~to+"zzzz" 검색
		System.out.println(set.subSet(from,to+"zzzz"));
		
		// 내림차순 정렬
		set = new TreeSet(new Descend());
		set.add("ant");set.add("alias");
		set.add("batman");set.add("aha");
		set.add("cola");set.add("Cola");
		set.add("ddr");set.add("dance");
		set.add("dEEE");set.add("deee");
		set.add("ever"); set.add("giant");
		set.add("zoo");
		
		System.out.println(set);
		System.out.println("from:"+from+",to:"+to);
		
		// to~from (반대로 검색)
		System.out.println(set.subSet(to, from));

	}

}
