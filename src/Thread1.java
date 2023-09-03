class Thread1 extends Thread {

    private String thread1Name;

    public Thread1(String threadName) {
        this.thread1Name = threadName;
    }


    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(thread1Name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}