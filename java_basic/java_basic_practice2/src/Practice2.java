
public class Practice2 {
    public static String sol(int num) {
        String result = "";
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i = 0;
        while(num > 0) {
            while(num >= values[i]) {
                num -= values[i];
                result += roman[i];
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sol(3));
        System.out.println(sol(4));
        System.out.println(sol(6));
        System.out.println(sol(13));
        System.out.println(sol(26));
        System.out.println(sol(1994));
    }
}
