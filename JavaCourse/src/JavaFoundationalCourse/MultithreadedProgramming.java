package JavaFoundationalCourse;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


public class MultithreadedProgramming {
    public static void main(String[] args) {
//        //-----通过实现 Runnable
//        new Runnabledemo("Thread--1").start();
//        new Runnabledemo("Thread--2").start();
//        }
        //new Thread(new  threaddemo("thread1")).start();
        Callable c=new demo(50) ;
        FutureTask ft=new FutureTask(c) ;
        new Thread(ft).start();
        try {
            System.out.println(ft.get());
        }catch (Exception e){
        e.printStackTrace();}
    }
}
//    class Runnabledemo implements Runnable{
//    private Thread t;
//    private String name;
//    public Runnabledemo(String name){
//        this.name=name;
//        System.out.println("Creating Thread"+name);
//    }
//        @Override
//        public void run () {
//        System.out.println("Starting Thread"+name);
//       try {
//           for (int j = 0; j < 10; j++) {
//               System.out.println(name+" "+j);
//               Thread.sleep(500);
//           }
//       }catch(InterruptedException e){
//           System.out.print("Interrupted  ");
//              e.printStackTrace();
//           }
//       }
//       public void start(){
//        System.out.println("Starting Thread"+name);
//       if(t==null){
//           t=new Thread(this,name);
//           t.start();
//        }
//        class threaddemo extends Thread {
//            private Thread t;
//            private String name;
//
//            public threaddemo(String name) {
//                this.name = name;
//            }
//
//            @Override
//            public void run() {
//                System.out.println("线程启动");
//                for (int i = 0; i <= 100; i++) {
//                    System.out.println(i);
//                    try {
//                        t.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println(name + "线程存在");
//            }
//
//            @Override
//            public void start() {
//                if (t == null) {
//                    t.start();
//                }
//            }
//        }
//----------实现Callable接口，调用FutureTask的get方法得到结果-------
class demo implements Callable<String> {
    private int nums;
    public demo(int nums) {
        this.nums = nums;
    }
    @Override
    public String call() throws Exception {
        int n=0;
        for(int j=1;j<nums;j++){
            n=n+j;
        }
        return "From one add to "+nums+" end is "+n+";";
    }

}




