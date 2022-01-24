package DBCQuestions;

import java.util.Scanner;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 15-Jan-2022
 */
public class AirthmeticOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstnum=sc.nextInt();
        int secondNum=sc.nextInt();
        int add=firstnum+secondNum;
        int sub=firstnum-secondNum;
        int divide=firstnum/secondNum;
        int mul=firstnum*secondNum;
        int mod=firstnum%secondNum;
        System.out.println("Addition of two numbers "+add);
        System.out.println("Subtraction  of two numbers "+sub);
        System.out.println("division of two numbers "+divide);
        System.out.println("Multiplication  of two numbers "+mul);
        System.out.println("Modulous of two numbers "+mod);

    }
}
