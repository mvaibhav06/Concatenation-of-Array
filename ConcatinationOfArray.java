public class ConcatinationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i=0; i<nums.length; i++){
            if(i<nums.length){
                ans[i] = nums[i];
            }
        }
        int j = 0;
        for(int i=nums.length; i<ans.length; i++){
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
