package JavaFoundationalCourse;
import java.util.*;


public class MultithreadedProgramming {
    public static void main(String[] args) {
        //-----通过实现 Runnable
        new Runnabledemo("Thread--1").start();
        new Runnabledemo("Thread--2").start();
        }
    }
    class Runnabledemo implements Runnable{
    private Thread t;
    private String name;
    public Runnabledemo(String name){
        this.name=name;
        System.out.println("Creating Thread"+name);
    }
        @Override
        public void run () {
        System.out.println("Starting Thread"+name);
       try {
           for (int j = 0; j < 10; j++) {
               System.out.println(name+" "+j);
               Thread.sleep(500);
           }
       }catch(InterruptedException e){
           System.out.print("Interrupted  ");
              e.printStackTrace();
           }
       }
       public void start(){
        System.out.println("Starting Thread"+name);
       if(t==null){
           t=new Thread(this,name);
           t.start();
        }
       }
    }



