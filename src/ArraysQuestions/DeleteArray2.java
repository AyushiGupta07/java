package ArraysQuestions;

import java.util.Scanner;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 16-Jan-2022
 */
public class DeleteArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int element = sc.nextInt();
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            DeleteArray2.deleteElements(arr,element,c);
        }

        public  static void deleteElements(int arr[],int element,int c){
            for (int i = 0; i < arr.length ; i++) {
                if(element==arr[i]){
                    c++;
                    for (int j = i; j < arr.length-1; j++) {
                        arr[j]=arr[j+1];
                    }
                }
            }
            for (int i = 0; i <arr.length-c ; i++) {
                System.out.print(arr[i]+" ");
            }
    }
}
