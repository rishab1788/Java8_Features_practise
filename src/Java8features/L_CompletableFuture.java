package Java8features;
/**
 *
 * what is completeable future.
 * -> A asychrnous programming.
 *      using asychnouse programming you can write non blockinng code.
 *      where concurrently you can run N number of tasks in seaprate thread.
 *      without blocking main thread.
 *
 *      when task is completed it notifies the main thread.(wheter task is failed.)improves
 *
 *
 *  why to use completeable future.
 *  -> There are different ways to implement ascyn programming
 *      Future, Executer service, Callback Thread ppol.
 *
 *      Disadvantage of futre->
 *      1. it can not be manually completed.
 *      2. multiple futures can not be chained together.
 *      3. we can not combine multiple feature together
 *      4.No proper Exception handling.
 *
 *
 *      Future              Completion Stage
 *          \                       /
 *              CompletableFuture
 * */
public class L_CompletableFuture {

public void runAsync(){}

public void supplyAsync(){}
}
