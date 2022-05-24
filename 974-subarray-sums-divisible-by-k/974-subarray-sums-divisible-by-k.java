class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0 , cnt = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0; i< nums.length ; i++){
            sum += nums[i];
            
            if(sum%k == 0 ) 
                cnt++;
            int req = sum%k;
            req += req < 0 ? k : 0; 
            cnt += map.getOrDefault(req , 0);
            map.put(req , map.getOrDefault(req , 0) + 1);
        }
        
        return cnt;
    }
}