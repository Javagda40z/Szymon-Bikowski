package watki;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger value = new AtomicInteger();

    public void increment(){
        value.incrementAndGet();
    }

//    public void increment() {
//        synchronized (this) {
//            value++;
//        }
//    }

//    public synchronized void increment(){
//        value++;
//    }

    public int getValue() {
        return value.intValue();
    }
}
