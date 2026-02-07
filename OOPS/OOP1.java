public class OOP1 {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.message(15);
        // System.out.println(c1.price);
        // Car c2 = new Car();
        Alto a1 = new Alto();
        System.out.println("Demo:" + a1.demo);
        // System.out.println("Static variable:" + Car.price);
        // System.out.println(new Car().x);
        // System.out.println(new Car().price);
        // c1.x = 14;
        // System.out.println(c1.x);
        // System.out.println("Hello World!!");
        // System.out.println(c2.x);4

    }
}

class Car {
    int x;
    static int price;
    int demo = 0;
    // call when object is created.
    static {
        price = 100;
    }

    // void message(int price) {
    // System.out.println("This is message");
    // System.out.println("This is function Price:" + price);
    // System.out.println("This is class price" + price);
    // Car.price = price;
    // System.out.println(Car.price);
    // }

    // Car() {
    // System.out.println(price);
    // }
    Car(int pr) {
        demo = pr;
    }
    // int message(int price,int orice){
    // price=1;
    // return 0;
    // }
    // Car() {
    // x = 10;
    // System.out.println("This is Car:" + x);
    // }

    // public Car(int s) {
    // System.out.println("I'm Car");
    // }
}

class Alto extends Car {
    double roll_No = 1100;

    Alto() {
        // super();

        super(100);
        // this(199f);
    }
}
