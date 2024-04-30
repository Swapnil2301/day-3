package day3;

public class arrayrev {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 55};
        int x = 0;
        int y = array.length - 1;
        int tem = y;
        while(y>x){
            int temp = array[x];
            array[x]=array[y];
            array[y]=temp;
            y--;
            x++;
        }
        for(int i =0;i<=tem;i++){
            System.out.print(array[i]+" ");
        }

    }
}
