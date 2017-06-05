package random;

public class FourElementArray {
    void count(int[] array) {
        if (array.length != 4) {
            throw new IllegalArgumentException();
        } else {
            int sum = array[0];
            int subtraction = array[0];
            int multiplication = array[0];
            double division = array[0];
            for (int i = 1; i < array.length; i++) {
                sum += array[i];
                subtraction -= array[i];
                multiplication *= array[i];
                division /= array[i];
            }
            System.out.println(sum);
            System.out.println(subtraction);
            System.out.println(multiplication);
            System.out.println(division);
        }
    }

    public static void main(String[] args) {
        FourElementArray fea = new FourElementArray();
        fea.count(new int[]{1, 2, 3, 4});
    }
}