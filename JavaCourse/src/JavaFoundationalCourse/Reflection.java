package JavaFoundationalCourse;
import java.util.*;

public class Reflection {
    public static void main(String[] args) throws Exception {
        Student pre1=new Student("CanLu");
        Class c1=pre1.getClass();
        Class c2=Student.class;
        Class c3=Class.forName("JavaFoundationalCourse.Reflection.Student");
        System.out.println(c1==c2);
        System.out.println(c1==c3);
    }
}
class Student{
    String name;
    int age;
    public Student(String name){
        this.name=name;
    }
}
