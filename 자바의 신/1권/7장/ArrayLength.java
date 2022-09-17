public class ArrayLength {
    public static void main(String args[]) {
        ArrayLength array = new ArrayLength();
        array.printArrayLength();
        array.printArray();
    }

    private void printArray() {
        int [][] twoDim = {{1,2,3},{4,5,6}};
        System.out.println("twoDim.length=" +twoDim.length);
        System.out.println("twoDim[0].length=" +twoDim[0].length);

        for(int oneLoop=0; oneLoop< twoDim.length; oneLoop++) {
            for(int twoLoop=0; twoLoop<twoDim[oneLoop].length; twoLoop++) {
                System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="+twoDim[oneLoop][twoLoop]);
            }
        }
    }

    private void printArrayLength() {
        int [] oneDim = new int[3];
        System.out.println(oneDim.length);
    }
}
