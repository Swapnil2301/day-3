package day3;

public class second_highest {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 8, 5, 6, 55, 42, 7, 99, 98};
        int max = array[0];
        int second_max = Integer.MIN_VALUE; // Initialize second_max with the minimum possible value

        for (int i = 1; i < array.length; i++) { // Start from the second element
            if (array[i] > max) {
                second_max = max;
                max = array[i];
            } else if (array[i] > second_max && array[i] != max) {
                second_max = array[i];
            }
        }

        System.out.println(second_max);
    }
}
