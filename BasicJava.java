import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public int[] oneTo255() {
        int[] result = new int[255];
        for (int i = 0; i < 255; i++) {
            result[i] = i + 1;
        }
        return result;
    }
    public ArrayList<Integer> odd1To255() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++) {
            if (i % 2 == 1) {
                result.add(i);
            }
        }
        return result;
    }
    public void sum() {
        int result = 0;
        for (int i = 0; i < 256; i++) {
            result += i;
            System.out.println("New number: " + i + " Sum: " + result);
        }
    }
    public void iterateArray(ArrayList<Integer> aArray) {
        for (Integer number : aArray) {
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        BasicJava basicJava = new BasicJava();
        // Print 1-255:
        for (int number : basicJava.oneTo255()) {
            System.out.println(number);
        }
        // Print odd numbers between 1-255:
        for (int number : basicJava.odd1To255()) {
            System.out.println(number);
        }
        // Print Sum without using array:
        basicJava.sum();
        // Iterating through an array:
        ArrayList<Integer> array = new ArrayList<Integer>(
            Arrays.asList(1,3,5,7,9,13)
        );
        basicJava.iterateArray(array);

    }
}