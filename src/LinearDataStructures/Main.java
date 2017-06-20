package LinearDataStructures;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int arrNum[] = addToArr(n);
        print(arrNum);
        printMaxElement(arrNum);
        printMinElement(arrNum);
        sumOfAll(arrNum);
    }
    public static int[] addToArr(int num) throws IOException {
       int[] arr = new int[num];
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int printMaxElement(int[] maxElement){
        int max = maxElement[0];
        for (int i = 0; i < maxElement.length; i++) {
            if(maxElement[i] > max){
                max=maxElement[i];
            }
        }
        System.out.printf("Max number is %d%n",max);
        return max;
    }
    public static int printMinElement(int[] minElement){
        int min = minElement[0];
        for (int i = 0; i < minElement.length; i++) {
            if(minElement[i] < min){
                min = minElement[i];
            }
        }
        System.out.printf("Min numbers is %d%n",min);
        return min;
    }
    public static int sumOfAll(int[] sum){
        int sumator = 0;
        for (int i = 0; i < sum.length; i++) {
            sumator+=sum[i];
        }
        System.out.printf("Sum = %d",sumator);
        return sumator;
    }
}
