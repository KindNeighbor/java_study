import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {

    public static void sol() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("알파벳 입력: ");
        char input = (char)br.read();
        int output = 0;

        int step =(int)'a' - (int)'A';

        if(input >= 'a' && input <= 'z') {
            output = (int)input - step;
            System.out.println("대문자 변환: " + (char)output);
        } else if(input >= 'A' && input <= 'Z') {
            output = (int)input + step;
            System.out.println("소문자 변환: " + (char)output);
        } else {
            System.out.println("입력하신 값이 알파벳이 아닙니다.");
        }
    }

    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) throws IOException {
        reference();
        sol();
    }
}
