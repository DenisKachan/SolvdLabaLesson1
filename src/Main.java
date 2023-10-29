import Task1.BubbleSort;
import Task1.HelloWorld;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.helloWorld();

        int[] simpleArray = {1, 5, 4, 3, 2};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bubbleSortArray(simpleArray)));
    }
}
