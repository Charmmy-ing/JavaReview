package JavaFoundationalCourse;

public class string7bufferbuilder {
    public static void main(String[] args) {
//        char[] ch ={'a','b','c','d','e'};
//        String st1= new String(ch);
//        System.out.println(st1);
        //--------------------------
        String str1 = "abcefghijklmn";
        int len = str1.length();
        System.out.println("the length of String is "+len);
        //格式化输出
        int i1=12;
        float f1=12.66f;
        System.out.printf("浮点型%f"+"整数型%d",f1,i1);
    }
}
