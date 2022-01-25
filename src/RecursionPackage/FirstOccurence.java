package RecursionPackage;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 25-Jan-2022
 */
public class FirstOccurence {
    public static void main(String[] args) {
        int[]array={1,2,4,2,6};
        System.out.println(removeDuplicate(array,0,2));
    }
    public static int removeDuplicate(int []arr,int currentIndex,int searchValue){
        if(currentIndex==arr.length-1 ){
            return -1;
        }
       if(arr[currentIndex]==searchValue){
           return currentIndex;

       }



        return removeDuplicate(arr,currentIndex+1,searchValue);
    }
}
