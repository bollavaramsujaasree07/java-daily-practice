package Arrays;

public class ArrayCreation {
    public static void main(String[] args) {
        int nums[] = new int[5]; // when we use new key word all the element values will be zero in default. --method 1
        nums[0] = 10;  
        nums[1] = 20;  
        nums[2] = 30; 
        nums[3] = 40;  
        nums[4] = 50;    
        
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);    
        System.out.println(nums[3]);
        System.out.println(nums[4]);

        int nums1[] = {10, 20, 30, 40, 50}; // method 2
        System.out.println(nums1[0]);
        System.out.println(nums1[1]);   
        System.out.println(nums1[2]);
        System.out.println(nums1[3]);   
        System.out.println(nums1[4]);
        // int nums2[] = new int[5]{10, 20, 30, 40, 50}; // this is not allowed in java.
        
        //now instead printing same print statement for 5 times time we can use for loop by iterating the index number of an array.
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
