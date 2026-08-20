import java.awt.print.Printable;
import java.util.*;
public class Method {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
       float sum = 0.2f;
        Print(arr);
        Print(sum);
    }
        public static void Print ( int[] arr){
        for(int arr1:arr){
            System.out.print(arr1);
        }
        System.out.println();
        }
        public static void Print (float arr){
            System.out.println(arr);
        }
}
