import java.util.ArrayList;
import java.util.Arrays;

import com.sun.swing.internal.plaf.basic.resources.basic;

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
    public int findMax(int[] anArray) {
        int max = anArray[0];
        for (int i = 1; i < anArray.length; i++) {
            if (anArray[i] > max) {
                max = anArray[i];
            }
        }
        return max;
    }
    public double findAvg(int[] anArray) {
        double sum = 0.0;
        if (anArray.length > 0) {
            for (int i = 0; i < anArray.length; i++) {
                sum += anArray[i];
            }
            return sum / anArray.length;
        } else {
            return 0;
        }
    }
    public ArrayList<Integer> findOddNumbers() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++) {
            if (i % 2 == 1) {
                y.add(i);
            }
        }
        return y;
    }
    public int numberOfGreater(int[] anArray, int number) {
        int count = 0;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > number) {
                count++;
            }
        }
        return count;
    }
    public ArrayList<Integer> squareValues(ArrayList<Integer> anArray) {
        for (int i = 0; i < anArray.size(); i++) {
            int num = anArray.get(i);
            anArray.set(i, num * num);
        }
        return anArray;
    }
    public void noNegatives(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < 0) {
                anArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(anArray));
    }
    public void maxMinAvg(int[] anArray) {
        int max = anArray[0];
        int min = anArray[0];
        double sum = anArray[0];
        ArrayList<Object> result = new ArrayList<Object>();
        for (int i = 1; i < anArray.length; i++) {
            sum += anArray[i];
            if (anArray[i] > max) {
                max = anArray[i];
            } 
            if (anArray[i] < min) {
                min = anArray[i];
            }
        }
        result.add(max);
        result.add(min);
        result.add(sum / anArray.length);
        System.out.println(result);
    }
    public void shiftLeft(int[] anArray) {
        for (int i = 0; i < anArray.length - 1; i++) {
            anArray[i] = anArray[i + 1];
        }
        anArray[anArray.length - 1] = 0;
        System.out.println(Arrays.toString(anArray));
    }
    public static void main(String[] args) {
        BasicJava basicJava = new BasicJava();
        // Print 1-255:
        for (int number : basicJava.oneTo255()) {
            System.out.println("Print 1-255: " + number);
        }
        // Print odd numbers between 1-255:
        for (int number : basicJava.odd1To255()) {
            System.out.println("Print odd numbers betwen 1-255: " + number);
        }
        // Print Sum without using array:
        basicJava.sum();
        // Iterating through an array:
        ArrayList<Integer> array = new ArrayList<Integer>(
            Arrays.asList(1,3,5,7,9,13)
        );
        basicJava.iterateArray(array);
        // Find max:
        int[] array1 = {3,-1,0,-7,4,9};
        System.out.println("Find max: " + basicJava.findMax(array1));
        // Find average:
        int[] array2 = {2, 4, 6, 9};
        System.out.println("Find average: " + basicJava.findAvg(array2));
        // Create array with odd numbers:
        System.out.println(basicJava.findOddNumbers());
        // Greater Than Y:
        int[] array3 = {1,3,5,7};
        System.out.println("Number of values greater than 3: " + basicJava.numberOfGreater(array3, 3));
        // Square values:
        ArrayList<Integer> array4 = new ArrayList<Integer>(
            Arrays.asList(1, 5, 10, -2)
        );
        System.out.println("Square values: " + basicJava.squareValues(array4));
        // Eliminate Negative Numbers:
        int[] array5 = {1, 5, 10, -2};
        basicJava.noNegatives(array5);
        // Max, Min, and Average:
        int[] array6 = {1, 5, 10, -2};
        basicJava.maxMinAvg(array6);
        // Shifting the Values in Array:
        int[] array7 = {1, 5, 10, 7, -2};
        basicJava.shiftLeft(array7);
    }
}