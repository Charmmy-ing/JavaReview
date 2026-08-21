package JavaFoundationalCourse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.io.IOException;

public class IOStream {
    public static void main(String[] args)throws IOException {
//        char write;
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("enter character,q is down");
//        do {
//            write=(char) br.read();
//            System.out.println((char)write);
//            }while (write!='q');
//        }
        //---------------------------------
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        System.out.println("ENTER \"end\" to quit");
//       do {
//           str=br.readLine();
//           System.out.println(str);
//       }while(!str.equals("end"));
      //---------------------------------
//        InputStream is=new FileInputStream("D:\\javawork\\JavaReview\\JavaCourse\\src\\JavaFoundationalCourse\\Test");
//        OutputStream os=new FileOutputStream("D:\\javawork\\JavaReview\\JavaCourse\\src\\JavaFoundationalCourse\\Test");
        File file = new File("test.txt");

 try(
    OutputStream os = new FileOutputStream(file);
    OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");) {
    osw.append("Enter chinese");
    osw.append("\r\n");
    osw.append("Enter English");
    osw.close();
    InputStream is = new FileInputStream(file);
    InputStreamReader isr = new InputStreamReader(is, "UTF-8");
    StringBuffer sb = new StringBuffer();
    while (isr.ready()) {
        sb.append((char) isr.read());
        System.out.println(sb.toString());
    }
    isr.close();
}catch (IOException e) {
     e.printStackTrace();
 }
    }
     }


