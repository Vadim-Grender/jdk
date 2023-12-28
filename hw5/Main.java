import java.util.concurrent.CountDownLatch;

public class Main {
    private static final CountDownLatch eatTime = new CountDownLatch(1);

    private static final CountDownLatch sleep = new CountDownLatch(5);
    public static void main(String[] args) {
        Runnable philosopher = () -> {
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + " трапезничает");
                    eatTime.await();
                    Thread.sleep(500);

                    System.out.println(Thread.currentThread().getName() + " думу думает");
                    Thread.sleep(3000);

                }
                System.out.println(Thread.currentThread().getName() + " ушёл спать");
                sleep.countDown();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread philosopher1 = new Thread(philosopher, "Аристотель");
        Thread philosopher2 = new Thread(philosopher, "Кант");
        Thread philosopher3 = new Thread(philosopher, "Сократ");
        Thread philosopher4 = new Thread(philosopher, "Ницше");
        Thread philosopher5 = new Thread(philosopher, "Платон");

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();

        try {
            Thread.sleep(100);
            eatTime.countDown();
            Thread.sleep(1000);
            sleep.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}