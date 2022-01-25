package RecursionPackage;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 25-Jan-2022
 */
public class AllOccurence {
    public static void main(String[] args) {
        int[]array={1,7,4,7,6};
         printALlOcuurenece(array,0,7);
    }
    public static int printALlOcuurenece(int[] arr,int currentIndex,int searchValue){
        if(currentIndex==arr.length-1){
            return -1;
        }
                if(arr[currentIndex]==searchValue){
                    System.out.println(currentIndex);
                }
             return  printALlOcuurenece(arr,currentIndex+1,searchValue);

    }
}
