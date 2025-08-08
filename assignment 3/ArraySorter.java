
import java.util.Arrays;

public class ArraySorter {
    int[] num;

    public ArraySorter(int[] num){
        this.num = num;
    }

    public void sortArray(){
        Arrays.sort(num);
    }

    public void printArray(){
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        int[] arr={20,60,40,80,30,50,40,10,55,22};
        ArraySorter sorter = new ArraySorter(arr);

        System.out.println("Before Srting");
        sorter.printArray();

        sorter.sortArray();
        System.out.println("After Srting");
        sorter.printArray();
    }
}
