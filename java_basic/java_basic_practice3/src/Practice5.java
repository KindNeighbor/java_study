import java.util.ArrayList;

public class Practice5 {

    public static int sol(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;

        while(left < right) {
            System.out.println("left = " + left);
            System.out.println("leftMax = " + leftMax);
            System.out.println("height[left] = " + height[left]);
            System.out.println("right = " + right);
            System.out.println("rightMax = " + rightMax);
            System.out.println("height[right] = " + height[right]);
            System.out.println("result = " + result);
            System.out.println("=============");
            System.out.println();
            if(height[left] < height[right]) {
                if(height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    result += leftMax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    result += rightMax - height[right];
                }
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("=========== case1 ==========");
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(sol(height));
        System.out.println();


        System.out.println("=========== case2 ==========");
        height = new int[]{4, 2, 0, 3, 2, 5};
        System.out.println(sol(height));
    }
}
