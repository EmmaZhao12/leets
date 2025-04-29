class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] nums3 = new int[nums1.length];
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
                var e1 = nums1[i];
                var e2 = nums2[j];
                if (e1 < e2 && e1 != 0){
                    nums3[curr] = e1;
                    i++;
                }
                else{
                    nums3[curr] = e2;
                    j++;
                }
                curr++;
            }
            nums1 = nums3;
        }
        public static void main(String[] args){
            int[] a = {1, 2, 3, 0, 0, 0};
            int[] b = {2, 5, 6};
            merge(a, 3, b, 3);
    }
}


