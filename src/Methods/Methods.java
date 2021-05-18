package Methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println("First call");
        doSomething();
        System.out.println("Last call");
    }

    static void doSomething() {
        System.out.println("inside Method");
        System.out.println("still inside Method");
    }
}
