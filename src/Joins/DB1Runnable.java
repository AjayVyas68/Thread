package Joins;

public class DB1Runnable implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(3000);
            System.out.println("db1 querying");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
