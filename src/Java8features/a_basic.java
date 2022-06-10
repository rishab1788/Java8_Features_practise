package Java8features;
/**  Features we are dealing
* (i). Understanding Lambdas.
* (ii). Using Lambdas
* (iii). Functional Interfaces
*  (iv). Method Refrences
*  (V) Collections Improvements

* */


/**
 *
 * (i). forEach() method in Iterable interface
 * (ii). default and static methods in Interfaces-
 *                        (If you read forEach method details carefully,
 *                         you will notice that it’s defined in Iterable interface
 *                         but we know that interfaces can’t have method body. From Java 8,
 *                         interfaces are enhanced to have method with implementation.
 *                         We can use default and static keyword to create interfaces with method implementation.
 *                         forEach method implementation in Iterable interface is:)
 * (iii). Functional Interfaces and Lambda Expressions - @functionInterface
 * (iv). Java Stream API for Bulk Data Operations on Collections
 *  (v). Concurrency API improvements -
 *  (vi). HashMap ->  HashMap
 *  * (Performance Improvement for HashMap in Java 8
 *  * The alternative String hash function added in Java 7 has been removed.
 *  * Buckets containing a large number of colliding keys will store their
 *  * entries in a balanced tree instead of a linked list after certain threshold
 * (Vii). MetaSpace: Java 8 stores the MetaData of classes in native memory called 'MetaSpace'.
 * It is not a contiguous Heap Memory and hence can be grown dynamically which helps to overcome the size constraints. This improves the garbage collection, auto-tuning, and de-allocation of metadata.
 *
 * */
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 *  -> ld is reached.)


 */
@FunctionalInterface
interface x {
  abstract  void run();
}

public class a_basic {
HashMap h = new HashMap();

    public static void main(String[] args) {
        x x = () -> System.out.println("d");
        x.run();
    }
}
