package Java8features;

import java.util.*;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * The Stream API is a powerful, but simple to understand set of tools for processing the sequence of elements.
 * When used properly, it allows us to reduce a huge amount of boilerplate code,
 * create more readable programs, and improve an app’s productivity.
 */
public class K_StreamAPI {
    /*Stream of Collection*/
    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();

    /*Stream of Array*/
    Stream<String> streamOfArray = Stream.of("a", "b", "c");
    String[] arr = new String[]{"a", "b", "c"};
    Stream<String> streamOfArrayFull = Arrays.stream(arr);

    /*Stream.generate() ->
    * The generate() method accepts a Supplier<T> for element generation.
     As the resulting stream is infinite, the developer should specify the desired size,
     or the generate() method will work until it reaches the memory limit:*/
    Stream<String> streamGenerated =
            Stream.generate(() -> "element").limit(10);

    /* Stream.iterate() -> Another way of creating an infinite stream is by using the iterate() */

    /*Stream of Primitives*/
    IntStream intStream = IntStream.range(1, 3);
    LongStream longStream = LongStream.rangeClosed(1, 3);


    /*Stream of File*/
    Path path = Paths.get("C:\\file.txt");
    Stream<String> streamOfStrings;
    {try {
            streamOfStrings = Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace(); }
    }


    /* Referencing a Stream*/


    /*Stream Pipeline*/
    // o perform a sequence of operations over the elements of the data source and aggregate their results,
    // we need three parts: the source, intermediate operation(s) and a terminal operation
    // Intermediate operations return a new modified stream.
    // For example, to create a new stream of the existing one without few elements, the skip() method should be used:

    Stream<String> onceModifiedStream =
            Stream.of("abcd", "bbcd", "cbcd").skip(1);

    // Map  -> Function mapper
    /**
     Stream map(Function mapper) is an intermediate operation. These operations are always lazy.
     Intermediate operations are invoked on a Stream instance and after they finish their processing,
     they give a Stream instance as output.
     */
    List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

    // Using Stream map(Function mapper) and
    // displaying the corresponding new stream
    {
        this.list.stream().map(number -> number * 3).forEach(System.out::println);
    }
    /*o/p-> 9 18 27 36 45
    */

    List<String> Stringlist = Arrays.asList("geeks", "gfg", "g",
            "e", "e", "k", "s");

    {
        List<String> answer = Stringlist.stream().map(String::toUpperCase).
            collect(Collectors.toList());

        // displaying the new stream of UpperCase Strings
        System.out.println(answer);
    }

    /**
      Flat Map -> Stream flatMap(Function mapper) returns a stream consisting of the results of replacing each
      element of this stream with the contents of a mapped stream produced by applying the
      provided mapping function to each element
     */


    /** Stream.reduce() in Java with examples ->
     * Many times, we need to perform operations where a stream reduces to single resultant value,
       for example, maximum, minimum, sum, product, etc. Reducing is the repeated process of combining all elements.

     T reduce(T identity, BinaryOperator<T> accumulator);

     Where, identity is initial value
     of type T and accumulator is a
     function for combining two values.

     Customer [List<phonnumbers></phonnumbers>]
     FlatMap -> One to many where as map is one to one.
     */


    List<String> words = Arrays.asList("GFG", "Geeks", "for",
            "GeeksQuiz", "GeeksforGeeks");
    String[] array = { "Geeks", "for", "Geeks" };
    {
        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);
        // Displaying the longest String
        longestString.ifPresent(System.out::println);

        /* Combining */
        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2)
                        -> str1 + "-" + str2);

        // Displaying the combined String
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
        }
    }

}
