class Car {
    int x;
    static int price;
    int demo = 0;

    Car() {
        System.out.println("Car:" + price);
    }

    Car(int pr) {
        demo = pr;
        Car.price = pr;
    }
}

// class Alto extends Car {
// double roll_No = 1100;

// Alto() {
// super(100);
// }
// }

public class D {
    public static void main(String[] args) {
        // Alto a1 = new Alto();
        Car c1 = new Car();
        System.out.println("This is Alto Price:" + c1.demo);
        System.out.println("This Car Price:" + c1.demo);
    }
}
