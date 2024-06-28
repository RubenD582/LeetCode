public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 3};
        int[] array2 = {2};

        System.out.println("Median: "+findMedianSortedArrays(array1, array2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] newArray = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                newArray[k++] = nums1[i++];
            } else {
                newArray[k++] = nums2[j++];
            }
        }
        
        while (i < m) {
            newArray[k++] = nums1[i++];
        }
        
        while (j < n) {
            newArray[k++] = nums2[j++];
        }
        
        int pivot = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            return (double) (newArray[pivot - 1] + newArray[pivot]) / 2;
        } else {
            return (double) newArray[pivot];
        }
    }
}