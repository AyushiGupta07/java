package ExceptionHandler;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        try {
            System.out.println(" enter the number u want to enter ");
            int a = sc.nextInt();
            System.out.println(" the array element at index " + a + "=" + arr[a] + " ");
        }
        catch(ArrayIndexOutOfBoundsException e){
         //   System.out.println(e);
            e.printStackTrace();

        }
        catch (Exception obj){
            System.out.println(obj);
        }


    }
}
