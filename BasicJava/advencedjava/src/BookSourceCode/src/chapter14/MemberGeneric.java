package chapter14;

import java.util.ArrayList;
import java.util.List;

public class MemberGeneric {

	public static void main(String[] args) {
		
		// Member 제네릭을 사용한 경우
		List<Member> list = new ArrayList<Member>();
		
		Member mem1 = new Member();
		mem1.setName("홍길동");
		mem1.setId("hong");
		mem1.setPassword("hong1234");
		mem1.setAge(40);
		
		list.add(mem1); // 리스트에 추가
		
		Member mem2 = new Member();
		mem2.setName("이순신");
		mem2.setId("lee");
		mem2.setPassword("lee1234");
		mem2.setAge(50);
		
		list.add(mem2); // 리스트에 추가
		
		Member mem3 = new Member();
		mem3.setName("김유신");
		mem3.setId("kim");
		mem3.setPassword("kim1234");
		mem3.setAge(60);
		
		list.add(mem3); // 리스트에 추가
		
		// 리스트 갯수
		System.out.println("list.size() : "+list.size());
		
		// 모든 리스트의 요소(Member) 출력
		for (int i=0; i<list.size(); i++) {
			System.out.println("인덱스 : "+i
					+", 이름 : "+list.get(i).getName()
					+", 아이디 : "+list.get(i).getId()
					+", 비밀번호 : "+list.get(i).getPassword()
					+", 나이 : "+list.get(i).getAge());
		}

	}

}
