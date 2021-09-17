public class MainThread {
    public static void main(String[] args) {
        // Current number of threads running
        System.out.println(Thread.activeCount());

        // Rename a thread
        Thread.currentThread().setName("MAINNNNNNN");
        System.out.println(Thread.currentThread().getName());

        // Set priority (1 - 10), where 10 is highest priority
        // Main method is by default priority 5
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        // Check is it's active
        System.out.println("Main thread alive? " + Thread.currentThread().isAlive());

        // Create and start second Thread
        MyThread thread2 = new MyThread();
        thread2.run();
        System.out.println("Second thread alive? " + thread2.isAlive());
        thread2.start();
        System.out.println("Second thread alive? " + thread2.isAlive());

        // The thread2 inherits priority from Main
        thread2.setPriority(5);

        System.out.println(Thread.activeCount());

        // There are 'user' threads and 'deamon' threads
        // Deamon threads are lower priority threads, running in the background
        // one example is JVM Garbage collection

    }
}
