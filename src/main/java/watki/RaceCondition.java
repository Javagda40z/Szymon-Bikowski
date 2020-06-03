package watki;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable runnable = () -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
                System.out.println("Counter: " + counter.getValue() + " Thread: " + Thread.currentThread());
            }
        };

        List<String> list = Arrays.asList("string", "string", "string2");
        Runnable kolekcja = () -> {
            list.remove("string");
        };


        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(kolekcja);
        Thread t5 = new Thread(kolekcja);
        Thread t6 = new Thread(kolekcja);

        t4.start();
        t5.start();
        t6.start();

        t4.join();
        t5.join();
        t6.join();

        System.out.println(counter.getValue());
//
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        executorService.submit(runnable);
//        executorService.submit(runnable);
//        executorService.shutdown();

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(4);
        queue.poll();

    }
}
