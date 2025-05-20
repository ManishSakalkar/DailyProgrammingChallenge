package com.coding.questions;

import java.util.Arrays;


/*
* Rotate an Array of nth elements to the right by k steps.
* For Example: with n = 7 and k =3,
* the array={1,2,3,4,5,6,7} is rotated to {5,6,7,1,2,3,4}
* How many different ways do you know to solve the questions?
* */
public class RotateAnArray {
//Using BruteForce
public static void rotateUsingExtraArray(int[] nums, int k) {
    int n = nums.length;
    k %= n;
    //Handles cases where k > n.
    //Example: if array has 7 elements and k = 10, rotating by 10 is the same as rotating by 10 % 7 = 3
    int[] temp = new int[n];
    //Creates a new temporary array of the same size to hold rotated values.

    for (int i = 0; i < n; i++){
        temp[(i+k) %n] = nums[i];
    }
    /*
    For every element nums[i], we calculate its new position in the rotated array:

    (i + k) % n ensures the index wraps around the array.

            Example:
    For nums = [1, 2, 3, 4, 5, 6, 7] and k = 3:

    i	nums[i]	(i + k) % n	temp index	temp[] after insertion
    0	1	(0+3)%7 = 3	3	[ , , , 1, , , ]
    1	2	(1+3)%7 = 4	4	[ , , , 1, 2, , ]
    2	3	(2+3)%7 = 5	5	[ , , , 1, 2, 3, ]
    3	4	(3+3)%7 = 6	6	[ , , , 1, 2, 3, 4 ]
    4	5	(4+3)%7 = 0	0	[5, , , 1, 2, 3, 4 ]
    5	6	(5+3)%7 = 1	1	[5, 6, , 1, 2, 3, 4 ]
    6	7	(6+3)%7 = 2	2	[5, 6, 7, 1, 2, 3, 4 ]
*/
    //Copy Back to Original Array
    for(int i =0; i < n; i++){
        nums[i] = temp[i];
    }

}

public static void rotateUsingReveral(int[] nums, int k){
     int n = nums.length;
     k %= n;

    // Step 1: Reverse entire array
    reverse(nums, 0, n - 1);

    // Step 2: Reverse first k elements
    reverse(nums, 0, k - 1);

    // Step 3: Reverse remaining n-k elements
    reverse(nums, k, n - 1);


}
    // Helper method: Reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String [] args){
        int[] array={1,2,3,4,5,6,7};
        int k =3;
        
//        rotateUsingExtraArray(array,k);
//        System.out.println("Rotated using Extra Array:    " + Arrays.toString(array));

//        rotateUsingReveral(array,k);
//        System.out.println("Rotated using Reversal Array:    " + Arrays.toString(array));
    }
}
