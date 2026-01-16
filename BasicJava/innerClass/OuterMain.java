package innerClass;

public class OuterMain {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.setInterfaceEx(new InterfaceExImpl());
        out.outerMethod();

        out.setInterfaceEx(new InterfaceExImpl2());
        out.outerMethod();
    }
}

class Outer {
    interface InterfaceEx {
        void method();
    }

    InterfaceEx ie;

    void setInterfaceEx(InterfaceEx ie) {
        this.ie = ie;
    }

    void outerMethod() {
        ie.method();
    }
}

class InterfaceExImpl implements Outer.InterfaceEx {
    @Override
    public void method() {
        System.out.println("InterfaceExImpl method()");
    }
}

class InterfaceExImpl2 implements Outer.InterfaceEx {
    @Override
    public void method() {
        System.out.println("InterfaceExImpl2 method()");
    }
}
