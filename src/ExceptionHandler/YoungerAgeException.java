package ExceptionHandler;

import java.util.Scanner;

//Unchecked Exception
public class YoungerAgeException extends RuntimeException {
    public YoungerAgeException(String message) {
        super(message);
    }
}
class Voting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        try {
            if (age < 18) {
                //Programmer manually creates an object but it does not handle the exception
                throw new YoungerAgeException("You are not eligible to vote ");
            } else {
                System.out.println(" you are eligible");
            }
        }
        catch(YoungerAgeException e){
            System.out.println(e);
        }
    }
}