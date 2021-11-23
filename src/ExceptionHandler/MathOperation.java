package ExceptionHandler;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MathOperation {
    double sum;
    public void display() {
            Scanner sc=new Scanner(System.in);
            System.out.println(" enter  a number ");
            try{
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println(" Average of " + n + " numbers is " + sum / n);
        }
            catch(InputMismatchException e){
              //  System.err.println("Please enter a valid number ");
                System.out.println(e);
            }
            catch(NumberFormatException nfe){
                System.out.println(nfe);
        }
            catch(Exception e){
                System.out.println(e);
            }
    }
}
class Main{
    public static void main(String[] args) {
        MathOperation obj=new MathOperation();
        obj.display();
    }
}
