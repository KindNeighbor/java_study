public class OperatorComparison {
    public static void main(String[] args) {
        OperatorComparison operator=new OperatorComparison();
        operator.comparison();
    }
    public void comparison() {
        boolean charValue=false;
        System.out.println(false==charValue);
        int intValue=1;
        boolean booleanValue=true;
        System.out.println(charValue==booleanValue);
    }
}
