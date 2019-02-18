package codingExamples.threads;

import org.junit.Test;

public class TestThread {
    @Test
    public void test() {
        Thread t = new Thread(() -> {System.out.println("Hello Thread");});
        t.start();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {System.out.println("Thread: ");});
            thread.start();
            System.out.println(Thread.activeCount());
            System.out.println(thread.getState());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
