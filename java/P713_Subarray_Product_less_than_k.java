public class P713_Subarray_Product_less_than_k {

    public static int subarrayProduct(int[] nums, int k) {
        int count = 0;
        int len = nums.length;
        int right = 1;
        for (int left = 0; left < len; left++) {
            int product = nums[left];
            if (nums[left] < k) {
                count++;
            }
            while (right < len) {
                product *= nums[right];
                if (product < k) {
                    count++;
                    right++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(subarrayProduct(nums, k));
    }
}
