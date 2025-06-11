package Leetcode;

import java.util.Arrays;
import java.util.HashMap;


/**
 * **📝 Two Sum Problem Summary with Example:**
 *
 * **Goal:**
 * Find **two indices** in an array such that the **sum of their values equals the target**.
 * You **cannot use the same element twice**. Only **one valid pair exists**.
 *
 * ---
 *
 * **Example:**
 * Input:
 * `nums = [2, 7, 11, 15]`, `target = 9`
 * Output:
 * `[0, 1]`
 *
 * **Explanation:**
 * `nums[0] + nums[1] = 2 + 7 = 9` → which is the target.
 * So return indices `[0, 1]`.
 *
 * ---
 *
 * **Efficient Solution:**
 * Use a **HashMap** to track values you've seen so far.
 * **Time Complexity:** O(n)
 * **Space Complexity:** O(n)
 *
 * Let me know if you want a visual or step-by-step breakdown.
 */
public class _1_TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));

    }


    public static int[] twoSum(int[] nums, int target) {

        //Create a map to store value -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        //Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; //value we want

            //Check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            //Otherwise, put current value and index into map
            map.put(nums[i], i);
        }

        //No solution found
        return new int[]{};

    }

}

/**
 * Time complexity - O(n)
 * We iterate the array exactly once - O(n)
 * Each map.containskey() and map.put() operation takes O(1) average time due to HashMap properties
 *
 * Total time:
 * O(n) where n is the number of elements in the input array nums.
 *
 *
 *
 * Space complexity - O(n)
 * In worst case, no two numbers sum to target until the last element.
 * So we store up to n elements in the HashMap - O(n) space
 *
 * Total Space:
 * O(n) for the HashMap storing number -> index pairs.
 */