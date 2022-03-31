public class ArrayInitValue {
    public static void main(String[] args){
        ArrayInitValue array = new ArrayInitValue();
        array.referenceTypesSetValue();
    }

    private void referenceTypesSetValue() {
        String[] strings = new String[2];
        ArrayInitValue [] array = new ArrayInitValue[2];
        strings[0] = "Please visit ~~~~";
        array[0] = new ArrayInitValue();
        System.out.println("strings[0]="+strings[0]);
        System.out.println("strings[1]="+strings[1]);
        System.out.println("array[0]="+array[0]);
        System.out.println("array[1]="+array[1]);
    }
}
