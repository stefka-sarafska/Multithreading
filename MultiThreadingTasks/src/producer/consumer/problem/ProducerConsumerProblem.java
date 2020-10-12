package producer.consumer.problem;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.setName("Thread1");
        producer.start();

        Consumer consumer = new Consumer(producer);
        consumer.setName("Thread2");
        consumer.start();

        Consumer consumer1 = new Consumer(producer);
        consumer1.setName("Thread3");
        consumer1.start();
    }
}
