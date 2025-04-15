class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[nums1.length];
        int i = 0;
        int j = 0;
        int curr = 0;
        while(i < m && j < n){
            var e1 = nums1[i];
            var e2 = nums2[j];
            if (e1 < e2){
                nums3[curr] = e1;
                System.out.print(e1);
                i++;
            }
            else{
                nums3[curr] = e2;
                System.out.print(e2);
                j++;
            }
            curr++;
        }
    }
    public static void main(String[] args){
        merge([1,2,3,0,0,0], 3, [2,5,6], 3);
    }
}
