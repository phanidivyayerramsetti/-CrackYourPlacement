class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
       int count = 0;
       int prefixSum= 0; 
       for(int i=0;i<nums.length;i++){
        prefixSum+=nums[i]; 
        if(prefixSum == k){ //Check sum for current Prefix 
         count++;   
        }
        
         /**
           Instead of loop check (prefixSum[i] - prefixSum[0,1,2......n-1] = k)
           we will only target  ( prefixSum[i] - k = prefixSum[0,1,2......n-1] inside HashMap stored earlier)
          */ 
        if(map.containsKey(prefixSum- k)){
         count += map.get(prefixSum- k) ;   
        } 
        
        map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);   
       } 
     return count;    
    }
}