public class ThreadMain {
    public static void main(String[] args) {

        Thread1 thread1 = new Thread1("Thread1");
        Thread thread2 = new Thread(new Thread2("Thread2"));
        Thread thread3 = new Thread((new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 11; i++) {
                    System.out.println("Thread3" + ": " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

