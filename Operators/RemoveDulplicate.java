class Solution {
    public int RemoveDuplicate(int[] nums) {
        int k = 0;
        for (int i = 0 ; i <nums.length; i++) {
            if (i == 0 ||nums [i]!=nums[i-1]){
                nums[k] = nums[i] ;
                k++;
            }
        }
        return k ;
    }
}
