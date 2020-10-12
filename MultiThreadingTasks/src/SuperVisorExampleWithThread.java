public class SuperVisorExampleWithThread {
    public static void main(String[] args) {
        ParallelWorker1 worker1 = new ParallelWorker1();
        ParallelWorker2 worker2 = new ParallelWorker2();

        worker1.start();
        worker2.start();
    }
}

class ParallelWorker1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The worker1 is executing task: " + i);
        }
    }
}

class ParallelWorker2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The worker2 is executing task: " + i);
        }
    }
}