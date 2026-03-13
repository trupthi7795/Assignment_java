package Assignment2;

class LifeCycle extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        LifeCycle t = new LifeCycle();

        System.out.println("State: " + t.getState()); // NEW

        t.start();
        System.out.println("State: " + t.getState()); // RUNNABLE

        Thread.sleep(100);
        System.out.println("State: " + t.getState()); // TIMED_WAITING

        t.join();
        System.out.println("State: " + t.getState()); // TERMINATED
    }
}