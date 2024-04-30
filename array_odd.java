package day3;

public class array_odd {
    public static void main(String[] args) {
        int[] array = {21,5,8,7,98,53,15,4};
        for(int i = 0;i<array.length;i++){
            if(i%2!=0){
                System.out.print(array[i]+" ");
            }
        }
    }
}
