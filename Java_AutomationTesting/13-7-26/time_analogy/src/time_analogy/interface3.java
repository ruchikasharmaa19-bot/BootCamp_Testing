package time_analogy;

public interface interface3 {

    void myMethod();




public class DemoClass implements interface3 {

    @Override
    public void myMethod() {
        System.out.println("Interface method implemented.");
    }

}


public class TestInterface {

    public static void main(String[] args) {

        DemoClass obj = new DemoClass();

        obj.myMethod();
    }

}
}