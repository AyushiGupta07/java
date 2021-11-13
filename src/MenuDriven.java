import java.util.Scanner;

public class MenuDriven
{
    public static void main(String[] args) {
        Process obj=new Process();
        obj.menu();
    }
}
class Process{
    Scanner sc=new Scanner(System.in);

    char ch;
    public void menu(){
       // System.out.println(ch);
        do{
            System.out.println("1.For calculate prime number");
            System.out.println("2.For calculate factorial number");
            System.out.println("3.For calculate fibonacci series");
         int i=sc.nextInt();
    switch (i) {
        case 1: {
            System.out.println("check prime number");
            int n = sc.nextInt();
            int count = 0;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    count++;
                }

            }
            if (count == 0)
                System.out.println("prime number");
            else
                System.out.println("Not a prime number");
        }
        break;
        case 2: {
            System.out.println("print the  of number for factorial ");
            int n = sc.nextInt();
            int fact=1;
            for (int j = n; j >= 1; j--) {

                fact=fact*j;
            }
                System.out.println("Factorial of a number is " + fact);

        }
        break;
        case 3: {
            System.out.println("print fabonacci  series");
            int a = 0;
            int b = 1;
            int n = sc.nextInt();
            int sum;
            System.out.print(a + " " + b + " ");
            for (int j = 2; j < n; j++) {
                sum = a + b;
                System.out.print(sum + " ");
                a = b;
                b = sum;
            }
        }
        break;
    }
            System.out.println();
            System.out.println("press y or Y for continue");
           ch=sc.next().charAt(0);
}
        while(ch=='Y' || ch=='y');

    }
}
