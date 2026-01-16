package class_.classes;

public class SingletonEx {
    private static SingletonEx instance = new SingletonEx();

    private static String name;

    private SingletonEx() {
        System.out.println("object create");
    }

    public static SingletonEx getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }
}
