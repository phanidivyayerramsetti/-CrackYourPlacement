class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int i=nums[0];
        for(int x:nums){
            if(count==0){
                i=x;
            }
            if(i==x){
                count++;
            }
            else count--;
        }
        return i;
    }
}