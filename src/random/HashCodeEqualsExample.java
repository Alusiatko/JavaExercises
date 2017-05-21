package random;

public class HashCodeEqualsExample {
    public static void main(String[] args) {
        Integer integerOne = new Integer(12345678);
        Integer integerTwo = new Integer(12345678);
        if (integerOne == integerTwo) {
            System.out.println("integerOne is equal to integerTwo when using \"==\"");
        } else {
            System.out.println("integerOne is NOT equal to integerTwo when using \"==\"");
        }

        if (integerOne.equals(integerTwo)) {
            System.out.println("integerOne is equal to integerTwo when using equals()");
        } else {
            System.out.println("integerOne is NOT equal to integerTwo when using equals()");
        }
    }
}
