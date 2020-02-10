package Java8features;

// functional programming and object oriented programming
//functional programming write readable and consice code.
//functions as a Values.
/*Everthing is an object. -> all codes are "associated " with classes and objets.
 */
class Greater {
    public void Great() {
        System.out.println("Hello Worlds");
    }


}

public class b_lambdas {
    /*
     * Enables Functional Programing
     * Radable and consize code.
     * Easier -use Api and libraries
     * Enable support for parallel processings.
     *
     * */
    public void Great() {
        System.out.println("Hello Worlds");
    }

    /*compiler remove all formailites in java -
     *      = ()->{}
     * */

    public static void main(String[] args) {
        myLambda m1 = () -> System.out.println("sdlfjsdlk");
        myAdd addfunctions = (int a, int b) -> a + b;
        stringLenghtLambda stringLambda = (String s) -> s.length();

        System.out.println(addfunctions.add(10, 20));
    }
}
@FunctionalInterface
interface myLambda {
    void foo();
}
@FunctionalInterface
interface myAdd {
    int add(int x, int y);
}

interface stringLenghtLambda {
    int length(String s);
}