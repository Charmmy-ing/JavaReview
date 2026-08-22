package JavaFoundationalCourse;

import java.io.*;

public class Generics {
    public static void main(String[] args) {
        Integer[] i1={1,4,5,6};
        String[] s1={"A","B","C"};
        Double[] d1={1.1,2.2,3.3};
        Float[] f1={1.1f,2.2f,3.3f};
        cp(i1);
        cp(s1);
        cp(d1);
        cp(f1);
    }
    public static <E> void cp(E[] arr){
        for (E e:arr){
            System.out.print(e);
        }
        System.out.println();
    }
}
