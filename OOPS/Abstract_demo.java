abstract class A {
    abstract void message();

    A() {
        System.out.println("This is A Constructor!!!");
        print();
    }

    void print() {
        System.out.println("This is Print Implementation!!!");
    }
}

class B extends A {
    void message() {
        System.out.println("This is Message Implementation!!");
    }
}

public class Abstract_demo {
    public static void main(String[] args) {
        B b1 = new B();
        b1.message();
    }
}
