class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length ;
        HashMap<Integer, Integer>Map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(Map.containsKey(nums[i])){
                int count = Map.get(nums[i]);
                Map.put(nums[i], count+1);
            }
            else{
                Map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:Map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();

            }
        }
        return 0 ;
        
    }
}