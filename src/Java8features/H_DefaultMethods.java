package Java8features;

import java.util.Collection;

interface Formula {

    double calculate(int a);
    // interface normal values assignements are accepeted
    int x =10;
    default double sqrt(int a) {
        divider(a);
        return Math.sqrt(a);
    }
    static double divideBy2(int a ){
        return a/2;
    }
    private double divider(int a) {
        return Math.sqrt(a);
    }
}

class TestFormula implements Formula {

    @Override
    public double sqrt(int a) {

        return a / 2;
    }

    @Override
    public double calculate(int a) {
        return sqrt(a * 100);
    }
}

class TestFormula1 implements Formula {

    @Override
    public double calculate(int a) {
        return sqrt(a * 100);
    }
}

class TestFormula2 extends TestFormula {

    public static void main(String[] args) {
        TestFormula2 tf2 = new TestFormula2();
        System.out.println(tf2.calculate(5010));
    }

    @Override
    public double calculate(int a) {
        return sqrt(a * 100);
    }
}

public class H_DefaultMethods {
/**
 * Java 8 introduces a new concept of default method implementation in interfaces.
 * This capability is added for backward compatibility so that old interfaces can be used to leverage
 * the lambda expression capability of Java 8.
 * */

/**
 * For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method declaration.
 * Thus, adding such method will simply break the collection framework implementations.
 * Java 8 introduces default method so that List/Collection interface can have a default
 * implementation of forEach method,
 * and the class implementing these interfaces need not implement the same.*/

}
/**
 * Interview Question
 * <p>
 * Sr. No.	Key	Static Interface         Method	Default Method
 * 1
 * Basic
 * It is a static method which belongs to the interface only. We can write implementation of this method in interface itself
 * It is a method with default keyword and class can override this method
 * 2
 * Method Invocation
 * Static method can invoke only on  interface class not on class.
 * It can be invoked on interface as well as class
 * 3
 * Method Name
 * Interface and implementing class , both can have static method with the same name without overriding each other.
 * We can override the default method in implementing class
 * 4.
 * Use Case
 * It can be used as a utility method
 * It can be used to provide common functionality in all implementing classes
 */