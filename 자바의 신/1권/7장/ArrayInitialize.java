public class ArrayInitialize {
    public static void main(String[] args) {
        ArrayInitialize array = new ArrayInitialize();
        System.out.println(array.getMonth(3));
    }

    private String getMonth(int monthInt) {
        String[] month = {"January","February","March","April","May","June","July",
                "August","September","October","November","December"};
        return month[monthInt];
    }
}
