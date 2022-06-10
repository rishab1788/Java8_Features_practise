package Java8features;


interface Interf {
    void add(int a, int b);
}

/**
 * One method referring to other method,
 * we are using already exissting method. code reuseablity
 * :: ->
 * Rules
 * 1. -> Method names are different but arguments must be matched
 * 2. -> Different return type is acceptable.
 * 3. -> Access modifier private
 *
 * There are four kinds of method references:
 * 1. Static methods ()
 * for static methods
 * classname::methodName
 *
 *2.
 * instace::methodName
 *
 *
 * 2. Constructor reference -> it return an object
 *
 * Instance methods of particular objects
 * Instance methods of an arbitrary object of a particular type
 * Constructor Reference
 */
public class J_MethodReference {
    public static void main(String[] args) {
        Runnable r = Test::print;
        Test1 t1 = new Test1();
        Runnable r1 = t1::print;
        Thread thread = new Thread(r);

        Thread thread1 = new Thread(r1);
        thread1.start();
  }

    static class Test {
        static String print() {
            return "with static";
        }
    }

    static class Test1 {
        String print() {
            return "with out static";
        }
    }
}

class MultipleArgumentMethodRefrence {

    public static void main(String[] args) {
        Interf i = (a, b) -> System.out.println("The Sum " + (a + b));
        i.add(10, 20);

        MultipleArgumentMethodRefrence multipleArgumentMethodRefrence = new MultipleArgumentMethodRefrence();
        Interf i1 = multipleArgumentMethodRefrence::sum;
        i1.add(100, 200);

    }

    public int sum(int a, int b) {
        return a + b;
    }
}