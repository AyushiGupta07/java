package RecursionPackage;

import java.util.Scanner;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 24-Jan-2022
 */
public class PowerOfX {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int number=sc.nextInt();
    System.out.println( printPower( number,x));

  }
  public static int printPower(int n,int x){
    if(n==0){
      return 1;
    }
   return x* printPower(n-1,x);
  }

}
