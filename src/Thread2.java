public class Thread2 implements Runnable{
    private String thread2Name;
    public Thread2(String thread2Name) {
        this.thread2Name = thread2Name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11 ; i++) {
            System.out.println(thread2Name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
