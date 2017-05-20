package kozak.zadania2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kozak2Zadanie5_InnySposób {
    public static void main(String[] args) {

        List<Integer> numberList = enterNumbers();

        Integer[] numbers = prepareArrayWithNumbers(numberList);

        int max = Math.max(numbers[0], numbers[1]);
        int min = Math.min(numbers[0], numbers[1]);
        int minMaxSum;
        double minMaxAverage;

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        minMaxSum = max + min;
        minMaxAverage = (double) minMaxSum / 2;

        System.out.println(minMaxSum);
        System.out.println(minMaxAverage);
    }

    private static Integer[] prepareArrayWithNumbers(List<Integer> numberList) {
        numberList.remove((Integer) 0);
        Integer[] numbers = new Integer[numberList.size() - 1];
        numbers = numberList.toArray(numbers);
        return numbers;
    }

    private static List<Integer> enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<Integer>();
        boolean correctEntry = false;
        do {
            int inputNumber = 1;
            System.out.println("Enter series of numbers and end it with " + "0");
            while (inputNumber != 0) {
                inputNumber = scanner.nextInt();
                numberList.add(inputNumber);
            }
            if (numberList.size() < 3) {
                System.out.println("You have to enter at least 2 numbers and zero at the end");
            } else {
                correctEntry = true;
            }
        } while (!correctEntry);
        return numberList;
    }
}
