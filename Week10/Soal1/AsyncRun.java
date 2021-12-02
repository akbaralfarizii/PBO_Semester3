package Soal1;

public class AsyncRun implements Runnable {
    @Override
    public void run() {
	// TODO Auto-generated method stub
        System.out.println("AsyncRun.run on threads " + Thread.currentThread().getId());
        //throw new ArithmeticException();
    }
    public static void main(String[] args) {
	try {
            Thread t = new Thread(new AsyncRun());
            t.start();
            System.out.println("main on threads " + Thread.currentThread().getId());
            throw new ArithmeticException();
	}
	catch (Exception e) {
            System.out.println(e.getClass() + " handled");
	}
    }
}

