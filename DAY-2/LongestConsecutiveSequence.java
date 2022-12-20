class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int num : nums){
            hashSet.add(num);
        }

        int max = 0;
        for(int num : nums){
            if(!hashSet.contains(num-1)){
                int currnum = num;
                int currlen = 1;

                while(hashSet.contains(currnum+1)){
                    currnum += 1;
                    currlen += 1;
                }
                max = Math.max(max,currlen);
            }
            

        }
        return max;
        
    }
}
