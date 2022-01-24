package ArraysQuestions;

import java.util.Scanner;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 22-Jan-2022
 */
public class BubbleSort {
  public static void main(String[] args) {
    int arr[]={86,35,4,76,23,67,2};
    int n=arr.length;
    Scanner sc=new Scanner(System.in);
    System.out.println(kthElement(arr,0,n-1,3));
  }
  public static int kthElement(int arr[],int l,int r,int k) {
    for (int i = l; i < r; i++) {
      for (int j = l; j < r - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr[k-1];

  }
}
