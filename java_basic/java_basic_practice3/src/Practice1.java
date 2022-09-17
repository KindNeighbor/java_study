public class Practice1 {

    public static void sol(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            System.out.println("num: " + num);
            System.out.println("idx: " + idx);
            System.out.println("nums[idx]: " + nums[idx]);
            if(idx == 0 || num > nums[idx - 1]) {
                nums[idx++] = num;
            }
            System.out.println("idx: " + idx);
            System.out.println("=========");
        }

        System.out.print("[" + idx + "]");
        for (int i = 0; i < idx; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       sol(new int[] {1, 1, 2});
       sol(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
       sol(new int[] {1, 1, 1});

    }
}