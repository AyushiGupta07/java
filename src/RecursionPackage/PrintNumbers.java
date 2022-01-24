package RecursionPackage;

import java.util.Scanner;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 25-Jan-2022
 */
public class PrintNumbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        numbers(n);
    }
    public static void numbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n + " ");
        numbers(n - 1);
        System.out.println(n + " ");
    }
}
