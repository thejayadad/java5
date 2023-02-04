import java.util.Arrays;

public class ChangeMe {


    public static void main(String[] args) {

        //Make a copy of the array and change one of the elements in the array
        int[] nums1 =  {33, 55, 21, 34, 10};
        int[] nums2 = Arrays.copyOf(nums1, nums1.length);
        nums2[3] = 39;
        System.out.println("First Array: ");
        printNums(nums1);
        System.out.println("Second Array: ");
        printNums(nums2);


    }
    //PRINT ALL NUMBERS IN THE ARRAY
    public static void printNums(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println("The number at position " + (i+1) + " is " + numbers[i]);
        }
    }
}
