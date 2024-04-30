package day3;

public class even_arrayprint {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8,9};
        for(int i =0;i<9;i++){
            if(i%2==0){
                System.out.println(array[i]);
            }
        }
    }
}
