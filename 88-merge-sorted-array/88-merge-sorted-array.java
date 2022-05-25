class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            for(int i = 0; i< n; i++) 
                nums1[i] = nums2[i];
            return;
        }
        if(n == 0) {
            return;
        }
        int i = m-1;
        int j = n-1;
        int k = m+n -1;
        while(k >= 0 && (i >= 0 && j >= 0)) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        while(i>=0 && k >=0) {
            nums1[k] = nums1[i];
            k--;
            i--;
        }
        while(j>=0 && k >=0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}