class Solution {
    public static int removeDuplicates(int[] nums) {
        int removed = 0;
        int curr = nums[0];
        for (int i=1; i < nums.length; i++){
            int temp = nums[i];
            if(curr == temp){
                removed++;
            }
            else{
                curr = temp;
            }
        }
        return removed;
    }
    public static void main(String[] args) {
        int[] a = {1,1,2};
        removeDuplicates(a);
    }
}
