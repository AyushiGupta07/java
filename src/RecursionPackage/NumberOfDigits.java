package RecursionPackage;

import java.util.Scanner;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 25-Jan-2022
 */
public class NumberOfDigits {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int numbers=scanner.nextInt();
    System.out.println( countDigits(numbers,0));
  }
  public static int countDigits (int number,int count){
    //It will check whether the number is zero or not
    if(number==0){
      return count;
    }
    //This method calling divides the number by 10 and increment the count by 1 till it becomes zero.
    //and return the value of count.
   return countDigits(number/10,count+1);
  }
}
