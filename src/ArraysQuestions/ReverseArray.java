package ArraysQuestions;
import java.util.Scanner;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 22-Jan-2022
 */
public class ReverseArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    String arr[]=new String[n];
    for (int i = 0; i <arr.length ; i++) {
      arr[i]=sc.next();
    }
    reverseArray(arr,0,n-1);

  }
    public static void reverseArray(String  arr[],int start,int end){
    if(end<0){
      return;
    }
    if(end>=start){
      System.out.println(arr[end]+" ");
    }
    reverseArray(arr,start,end-1);

    }
}

