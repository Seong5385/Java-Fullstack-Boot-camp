package collections.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx1 {

   public static void main(String[] args) {

      Set<Object> set = new HashSet<>();
      set.add("three");
      set.add("two");
      set.add("four");
      set.add("five");
      set.add(new Integer(4));

      Iterator<Object> it = set.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }

   }

}