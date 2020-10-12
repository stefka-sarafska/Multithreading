package producer.consumer.problem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {
    private List<String> messages = new ArrayList<>();
    private static final int MAX_SIZE = 3;

    @Override
    public void run() {
        try {
            while (true) {
                produce();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private synchronized void produce() throws InterruptedException {
        while (messages.size() == MAX_SIZE) {
            wait();
        }
        String message = LocalDate.now().toString();
        messages.add(message);
        System.out.println("Producer produce data: " + message);
        notify();

    }

    public synchronized String consume() throws InterruptedException {
        notify();
        while (messages.isEmpty()) {
            wait();
        }
        String message = messages.get(0);
        messages.remove(message);
        return message;

    }

}
