package collections.iterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationEx {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Enumeration은 Iterator의 구버전으로 Collection이전에 사용
        // Vector, Hashtable 변환이 가능함.

        Vector<Integer> v = new Vector<>();

        for (int i = 1; i <= 100000000; i++) {
            v.add(i);
        }

        // Enumeration으로 출력
        long start = System.currentTimeMillis();
        Enumeration<Integer> e = v.elements();
        System.out.println("Enumeration 출력");
        while (e.hasMoreElements()) {
            Integer value = e.nextElement(); // 필요하면 사용
        }
        long end = System.currentTimeMillis();
        System.out.println("Enumeration 소요시간 : " + (end - start));

        // Iterator로 출력
        start = System.currentTimeMillis();
        Iterator<Integer> it = v.iterator();
        System.out.println("Iterator 출력");
        while (it.hasNext()) {
            Integer value = it.next(); // 필요하면 사용
        }
        end = System.currentTimeMillis();
        System.out.println("Iterator 소요시간 : " + (end - start));

        // Iterator와 size()를 이용하는 방법 비교
        start = System.currentTimeMillis();
        for (int i = 0; i < v.size(); i++) {
            Integer value = v.get(i); // 필요하면 사용
        }
        end = System.currentTimeMillis();
        System.out.println("size() 소요시간 : " + (end - start));

        // size()를 사용할 수 있는 상황이 size()를 사용하여 구현하는게 더 좋다.
        // Iterator의 장점은 모든 컬렉션 프레임 워크에서 공통적으로 사용할 수 있다는 것
        // 쉽게 데이터에 접근할 수 있다.
        // 단점은 대량의 데이터를 처리할 때에 속도가 느려짐, 단방향으로 반복이 가능함.
        // 변경, 추가를 할 수 없다.

    }
}
