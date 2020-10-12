public class SupervisorExample {
    public static void main(String[] args) {

        Worker1 worker1 = new Worker1();
        Worker2 worker2 = new Worker2();

        try {
            worker1.executeWork();
            worker2.executeWork();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

class Worker1 {
    public void executeWork() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("Worker 1 is executing task: " + i);
        }
    }
}

class Worker2 {
    public void executeWork() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("Worker 2 is executing task: " + i);
        }
    }
}
