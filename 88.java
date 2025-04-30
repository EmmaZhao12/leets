class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] nums3 = nums1.clone();
            int i = 0;
            int j = 0;
            int curr = 0;
            if (n == 0 || m == 0){
                if(m==0){
                    nums1 = nums2;
                }
                return;
            }
            while(curr < nums1.length){
                var e1 = -1;
                var e2 = -1;
                if (i < m && j < n){
                    e1 = nums3[i];
                    e2 = nums2[j];
                }
                if (e1 < e2 && e1 > 0){
                    nums1[curr] = e1;
                    i++;
                }
                else{
                    nums1[curr] = e2;
                    j++;
                }
                curr++;
            }
        }
        public static void main(String[] args){
            int[] a = {0};
            int[] b = {1};
            merge(a, 0, b, 1);
    }
}


