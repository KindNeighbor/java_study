public class ArrayNewFor {
    public static void main(String args[]) {
        ArrayNewFor array = new ArrayNewFor();
        array.newFor();
        array.twoDimFor();
    }

    private void twoDimFor() {
        int[][]twoDim={{1,2,3},{4,5,6}};
        for(int[] dimArray:twoDim) {
            for(int data: dimArray) {
                System.out.println(data);
            }
        }
    }

    private void newFor() {
        int[] oneDim = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int data:oneDim) {
            System.out.println(data);
        }
    }
}
