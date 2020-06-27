class Animal {
    String name;
    int age;
    void bio() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class class_object_method {
    
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "WHO";
        cat.age = 7;
        cat.bio();
    }
}
