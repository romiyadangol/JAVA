<<<<<<< HEAD
//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
//for each 0 <= i < nums.length and return it.

package PermutationArray;

public class PerArray {
public int[] array(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
        ans[i] = nums[nums[i]];
    }
    return ans;
}
}
=======
//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
//for each 0 <= i < nums.length and return it.

package PermutationArray;

public class PerArray {
public int[] array(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
        ans[i] = nums[nums[i]];
    }
    return ans;
}
}
>>>>>>> 91755e13d01a5612251b6b83e29c097e6ac9dd72
