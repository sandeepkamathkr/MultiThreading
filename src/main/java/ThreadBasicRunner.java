public class ThreadBasicRunner {
    public static void main(String[] args) throws InterruptedException {
        // Task1
        System.out.println("Task1 is kicked Off");
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();

        // Task2
        System.out.println("Task2 is kicked Off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        task1.join();
        task2Thread.join();
        // Task3


        System.out.println("Task3 is kicked Off");

        for (int i = 301;i <=399;i++){
            System.out.print(i + " ");
        }

        System.out.println("\nTask3 Done");

        System.out.println("All Tasks Done");
    }
}

class Task1 extends Thread {
    public void  run(){
        System.out.println("\nTask1 Started");

        for (int i = 101;i <=199;i++){
            System.out.print(i + " ");
        }

        System.out.println("\nTask1 Done");
    }
}

class Task2 implements Runnable {
    @Override
    public void  run(){
        System.out.println("\nTask2 Started");

        for (int i = 201;i <=299;i++){
            System.out.print(i + " ");
        }

        System.out.println("\nTask2 Done");
    }
}
