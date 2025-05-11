public class singleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        singleNumber sol = new singleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single number is: " + sol.singleNumber(nums));
    }
}
