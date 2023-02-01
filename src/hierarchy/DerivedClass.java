package hierarchy;

public class DerivedClass extends BaseClass{
    @Override
    public void print() {
        System.out.println("the second is DerivedClass");
        super.print();
    }
}
