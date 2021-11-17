package ExceptionHandler;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        System.out.println(" Please enter your name");
        final Scanner sc=new Scanner(System.in);
        String name;
       try{
             name = sc.nextLine();

        }
        catch(Exception e){
            name="Ayushi";
        }
        System.out.println(" Hello " + name);
    }
}
