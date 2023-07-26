//TODO: EXTENDS Method
//public class MultiThreading extends Thread {
//    private int threadNumber;
//    //Creating a constructor
//    public MultiThreading (int threadNumber) {
//        this.threadNumber = threadNumber;
//    }
//    // This class must extend with Thread class
//
//    /*
//    Multithreading is the ability to execute multiple different paths of code
//    at the same time. Normally Java runs on a single thread.
//     */
//
//    /*
//    You need to make this class multi-threadable. To do  that
//    you need to override run method of the thread class.
//     */
//    @Override //Overriding run method
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + " from thread " + threadNumber );
//            try {
//                //Sleep 1 Second between each number
//                //So that we can watch print each number one at a time.
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//TODO: IMPLEMENTS Runnable Method
public class MultiThreading implements Runnable {
    private int threadNumber;
    //Creating a constructor
    public MultiThreading (int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override //Overriding run method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber );
            try {
                //Sleep 1 Second between each number
                //So that we can watch print each number one at a time.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}