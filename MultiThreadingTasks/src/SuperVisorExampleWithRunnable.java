public class SuperVisorExampleWithRunnable {
    public static void main(String[] args) {
        WorkerOne workerOne=new WorkerOne();
        WorkerTwo workerTwo=new WorkerTwo();
        Thread thread1=new Thread(workerOne);
        Thread thread2=new Thread(workerTwo);
        thread1.start();
        thread2.start();

    }
}

class WorkerOne implements Runnable{

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

class WorkerTwo implements  Runnable{

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

