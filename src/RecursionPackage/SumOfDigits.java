package RecursionPackage;

import java.util.Scanner;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 25-Jan-2022
 */
public class SumOfDigits {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    System.out.println(printSum(number,0));
  }
  public static int printSum(int num,int sum){
    if(num==0){
      return sum;
    }
    int sumOfDigits= sum+ printSum(num/10,num%10);
    return sumOfDigits;
  }
}
