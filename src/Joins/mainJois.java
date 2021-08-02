package Joins;

public class mainJois {
    public static void main(String[] args) {
        var t=new DB1Runnable();
        var t2=new DB2Runnable();
        var t3=new Thread(t);
        var t4=new Thread(t2);

        t3.start();
        t4.start();
        System.out.println("processing");


    }
}
