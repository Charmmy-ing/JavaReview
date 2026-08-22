package JavaFoundationalCourse;
import java.util.*;


public class MultithreadedProgramming {
    public static void main(String[] args) {
//        //-----通过实现 Runnable
//        new Runnabledemo("Thread--1").start();
//        new Runnabledemo("Thread--2").start();
//        }
        new Thread(new  threaddemo("thread1")).start();
       
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
        class threaddemo extends Thread {
            private Thread t;
            private String name;

            public threaddemo(String name) {
                this.name = name;
            }

            @Override
            public void run() {
                System.out.println("线程启动");
                for (int i = 0; i <= 100; i++) {
                    System.out.println(i);
                    try {
                        t.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name + "线程存在");
            }

            @Override
            public void start() {
                if (t == null) {
                    t.start();
                }
            }
        }





