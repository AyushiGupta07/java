package Threading;

public class Scooby extends Thread{
    public void run(){

    }
}
class Shaggy extends Thread{
    public void run(){

    }
}
class Test{
    public static void main(String[] args) {
      //  System.out.println( Thread.currentThread().getName());
        Scooby obj=new Scooby();
         Thread.currentThread().setName("Scooby");
        System.out.println( Thread.currentThread().getName());
        obj.start();
        Shaggy obj2=new Shaggy();
       // System.out.println( Thread.currentThread().getName());
        Thread.currentThread().setName("Shaggy");
        System.out.println(  Thread.currentThread().getName());
        obj2.start();

     //   System.out.println(Thread.currentThread().getName());
    }
}
