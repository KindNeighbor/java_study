import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

    public static void sol(int num) {
        int numReverse = 0;
        boolean isMinus = false;

        if(num < 0) {
            isMinus = true;
            num *= -1;
        }

        while(num > 0) {
            int r = num % 10;
            num /= 10;
            numReverse = numReverse * 10 + r;
        }
        System.out.println(isMinus ? numReverse * -1 : numReverse);
    }


    public static void main(String[] args) {

        sol(12345);
        sol(-12345);
        sol(100);
        sol(0);

    }
}