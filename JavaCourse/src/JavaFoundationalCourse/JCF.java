package JavaFoundationalCourse;
import java.util.*;
public class JCF {
    public static void main(String[] args) {
        //-------------ArrayList------------------
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(9);
//        list.add(3);
//        list.add(4);
//        list.add(0);
//        for(int flist:list){
//            System.out.print(flist);
//        }
//        System.out.println();
//       System.out.println(list.get(2));
//       System.out.println();
//        list.remove(2);
//        for(int flist:list){
//            System.out.println(flist);
//        }
//        System.out.println();
//        list.set(0,100);
//       System.out.println( list.get(0));
//       Collections.sort(list);
//       System.out.println(list);
        //---------LinkedList---------
        List<Integer> list=new LinkedList();
        list.add(1);
        list.add(0);
        list.add(9);
        list.add(3);
        list.add(3);
        list.addFirst(2);
        list.addLast(4);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        list.removeLast();
        list.removeFirst();
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

    }
}
