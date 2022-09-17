import java.util.ArrayList;

public class Practice2 {
    public static ArrayList<Integer> sol(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                list.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(sol(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(sol(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(sol(nums));
    }
}
