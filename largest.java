package day3;

public class largest {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8};
        int largest = 0;
        for(int i =0;i<7;i++){
            if(array[i]>largest) {

                largest = array[i];
            }
        }
        System.out.println(largest);}
}
