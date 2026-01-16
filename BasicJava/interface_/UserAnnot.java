package interface_;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Arrays;

@Retention(RetentionPolicy.CLASS)
public @interface UserAnnot {
    String value();

    int number() default 5;
}

class User {
    @UserAnnot(value = "A")
    public void methodA() {
        System.err.println("methodA()실행");
    }

    @UserAnnot(value = "B", number = 10)
    public void methodB() {
        System.out.println("methodB()실행");
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Method method[] = User.class.getDeclaredMethods();

        Arrays.stream(method).map(x -> x.getName()).forEach(System.out::println);
        Arrays.stream(method).map(x -> x.getAnnotation(UserAnnot.class)).forEach(x -> System.out.println(x));

    }
}
