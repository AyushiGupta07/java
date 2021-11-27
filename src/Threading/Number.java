package Threading;
import java.util.Scanner;
public class Number extends Thread {
    public int n;
   private final Thread t ;
   public Number(){
      t = new Thread();
   }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number ");
        n = sc.nextInt();
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " ");
        }
        try {
            t.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }


        for (int i = 6; i <= n; i++) {
            System.out.println(i + " ");
        }
    }
}

class Main{
    public static void main(String[] args) {
 //       Thread t=new Thread();
        Number obj=new Number();
        obj.start();

    }
}

