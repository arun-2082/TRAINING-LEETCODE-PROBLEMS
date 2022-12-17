class Solution {
    public int findDuplicate(int[] nums) {
        int turt = nums[0];
        int squir = nums[0];

        do{
            turt = nums[turt];
            squir = nums[nums[squir]];

        }while(turt != squir);

        squir = nums[0];
        while(turt != squir){
            turt = nums[turt];
            squir = nums[squir];
        }
        return turt;
        
    }
}
