package leetcode;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * Note:
 * Each element in the result should appear as many times as it shows in both
 * arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your
 * algorithm?
 * What if nums1's size is small compared to num2's size? Which algorithm is
 * better?
 * What if elements of nums2 are stored on disk, and the memory is limited such
 * that you cannot load all elements into the memory at once?
 * Subscribe to see which companies asked this question
 * @author liqqc
 */
public class Intersection_of_Two_Arrays_2 {

    public static void main(String[] args) {
        intersect(new int[]{1,2,3,2},new int[]{2,2});
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return new int[] {};

        int[] ch1 = new int[99999];
        int[] ch2 = new int[99999];
        
        for (int i : nums1) {
            ch1[i]+=1;
        }

        for (int j : nums2) {
            ch2[j]+=1;
        }

        return null;
    }
}
