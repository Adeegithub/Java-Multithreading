public class Threading {
    /*
    There are two main ways of creating threads in Java
    1. -> have a class extend the thread class
    2. -> IMPLEMENTS runnable interface
     */

    /*
    TODO: EXTENDS method
    public static void main(String[] args) {
        //Creating objects of Multithreading Class

        MultiThreading multiThreading1 = new MultiThreading();
        MultiThreading multiThreading2 = new MultiThreading();

        //This will kick off a brand-new thread
        multiThreading1.start();

        //Creating another new thread
        multiThreading2.start();
    }
*/

    //TODO: IMPLEMENTS runnable Method
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            MultiThreading multiThreading1 = new MultiThreading(i);
            Thread myThread = new Thread(multiThreading1);
            myThread.start();
        }
    }
}