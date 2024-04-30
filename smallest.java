package day3;

public class smallest {
    public static void main(String[] args) {
        int[] array = {11,3,4,6,79,7,4,1};
        int smallest = array[0];
        for(int i=0;i<8;i++){
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println(smallest);
    }
}
