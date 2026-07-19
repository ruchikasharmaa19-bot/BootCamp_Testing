package time_analogy;

public interface interface1 {
    public void myOtherMethod();
}

interface interface2 {
    public void myOtherMethod();
}

// Demo class implements both interfaces
class DemoClass implements interface1, interface2 {

    @Override
    public void myOtherMethod() {
        System.out.println("Method implemented successfully.");
    }

    public static void main(String[] args) {

        DemoClass obj = new DemoClass();
        obj.myOtherMethod();
    }
}