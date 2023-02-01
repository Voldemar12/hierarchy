package hierarchy;

public class Main {
    public static void main(String[] args) {\

        DerivedClass derivedClass = new DerivedClass();
        BaseClass baseClass = new BaseClass();

        baseClass.print();
        derivedClass.print();

    }
}