package Java8features;

//Runnable Example
public class c_lambda_with_runnable {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Print Inside Hello World");
            }
        });
        myThread.run();
        //Same Signature,
        Thread myLambdaThread = new Thread(() -> System.out.println("Print Inside Hello World"));
        myLambdaThread.run();
    }


}
