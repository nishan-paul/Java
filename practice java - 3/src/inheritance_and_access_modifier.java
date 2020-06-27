class Factory {
    void design() {
        System.out.println("Design the car");
    }

    void build() {
        System.out.println("Build the car");
    }
}

class Car extends Factory {
    void brand() {
        System.out.println("Tesla");
    }
}

public class inheritance_and_access_modifier {

    public static void main(String[] args) {
        // access modifiers: public, private, protected, default
        Factory factory = new Factory();

        factory.design();
        factory.build();

        Car car1 = new Car();

        car1.design();
        car1.build();
        car1.brand();
    }
}






