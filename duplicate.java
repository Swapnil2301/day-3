package day3;

public class duplicate {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 5, 6, 3, 5, 1};
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {

                if (array[i] == array[j]) {
                    count += 1;
                }

            }
            if (count > 1) {
                System.out.println(array[i]);
            }

        }
    }
}
