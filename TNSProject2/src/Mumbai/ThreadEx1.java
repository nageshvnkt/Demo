package Mumbai;

class ChildThread extends Thread {
    private int n;
    private String msg;

    //Constructor
    public ChildThread(int n, String msg) {
        this.n = n;
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
            System.out.println(msg + i + " " + Thread.currentThread().getName());
        }
    }
}

public class ThreadEx1 {

	public static void main(String[] args) {
		ChildThread t1=new ChildThread(1,"Thread-0");
		t1.start();
		ChildThread t2=new ChildThread(2,"Thread-1");

	}

}
