class Program {

    int value;
    String text;

    public Program() {
        System.out.println("First Constructor");
    }

    public Program(int value) {
        this.value = value;
        System.out.println("Second Constructor");
    }

    public Program(int value, String text) {
        this.value = value;
        this.text = text;
        System.out.println("Third Constructor");
    }
}

public class constructor {

    public static void main(String[] args) {
        
        Program x = new Program();
        Program y = new Program(2);
        Program z = new Program(5, "Hi");        
    }
    
}

