package collections.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx2 {

    public static void main(String[] args) {
        // Iterator 객체 선언
        Iterator<Integer> it = null;

        // List와 Set 객체 생성
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // list와 set객체에 5개의 값을 추가
        for (int i = 1; i <= 5; i++) {
            list.add(i);
            set.add(i + 5);
        }

        System.out.println(list);
        System.out.println(set);

        // list에서 Iterator 객체로 생성
        it = list.iterator();

        // list의 Iterator 객체 출력
        System.out.println("List Iterator 출력");
        iteratorPrint(it);

        System.out.println(list);

        // set에서 Iterator 객체로 생성
        it = set.iterator();
        System.out.println("Set Iterator 출력");
        iteratorPrint(it);

        System.out.println(set);

    }

    private static void iteratorPrint(Iterator<Integer> it) {
        // Iterator 객체 반복 (다음요소가 있는 경우에 반복 처리)
        while (it.hasNext()) {
            // Iterator 객체의 다음요소를 읽어와서 출력
            System.out.println(it.next());
            // 현제 요소 삭제
            it.remove();
        }
    }

}
