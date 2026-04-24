import java.util.Arrays;

public class Anagram {       //Anagram is when two string contain the same characters in a different order(e.g.  "listen" & "silent")
    public static void main(String[] args) {
        //integer array
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(arr1, arr2));

        //string   -->first convert to character array
        String s1 = "anagram";
        String s2 = "nagaram";
        char[] nums1 = s1.toCharArray();
        char[] nums2 = s2.toCharArray();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.equals(nums1 , nums2));

    }
}
