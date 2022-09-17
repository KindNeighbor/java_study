import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {

        //예제: 1-10 숫자 중 짝수 들의 합
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int num : arr) {
            if(num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("sum = " + sum);

        int sum2 = IntStream.range(1,11).filter(x -> x % 2 == 0).sum();
        System.out.println("sum2 = " + sum2);
    }
}
