package Joins;

public class DB2Runnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("db2 querying");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
