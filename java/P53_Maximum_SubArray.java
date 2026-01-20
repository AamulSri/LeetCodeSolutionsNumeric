public class P53_Maximum_SubArray {

    public static int sum_subarray( int nums[]){

        int current_sum = 0;
        int max_sum = 0;
        for(int i =0 ; i< nums.length ; i++){
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            max_sum = Math.max(current_sum , max_sum);
        }
        return max_sum;
    }

    public static void main(String args[]){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sum_subarray(nums));

    }
}