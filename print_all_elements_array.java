package day3;
import java.util.Scanner;
public class print_all_elements_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter all elements in array");
        for(int i =0;i<size;i++){
            System.out.print("Element " + (array[i] + 1) + ": ");
            array[i] = sc.nextInt();

        }
        for(int i:array){
            System.out.println(i+"");
        }

    }
}
