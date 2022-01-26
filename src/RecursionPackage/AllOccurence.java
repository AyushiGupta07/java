package RecursionPackage;

/***
 *Author Name : Ayushi Gupta 
 * IDE : Intellij IDEA Community Edition 
 * Date : 25-Jan-2022
 */
public class AllOccurence {
    public static void main(String[] args) {
        int[]array={3,2,2,3,5,87,9};
        System.out.println( printALlOcuurenece(array,3));
    }
    public static int  printALlOcuurenece(int[] nums,int val) {
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=val){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
