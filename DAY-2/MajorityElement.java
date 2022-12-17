class Solution {
    public int majorityElement(int[] nums) {
        int ctr = 0;
        int ele=0;

        for(int num:nums){
            if(ctr == 0 ){
                ele = num;
            }
            if (num == ele) ctr+=1;
            else ctr -= 1;
        }
        return ele;
        
    }
}
