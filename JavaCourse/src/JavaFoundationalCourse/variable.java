package JavaFoundationalCourse;
//
// class COUNTER {
//     private static int counter = 0;
//
//     public COUNTER() {
//         counter++;
//     }
//
//     public static int getCounter() {
//         return counter;
//     }
//
// }
//public class variable {
//    public static void main(){
//        COUNTER user1=new COUNTER();
//        COUNTER user2=new COUNTER();
//        COUNTER user3=new COUNTER();
//        System.out.println("The numbers of users="+COUNTER.getCounter());
//    }
//}
class InstanceCounter {
    private static int counter=0;
    public static int getCounter() {
        return counter;
    }
    public static void addCounter() {
        counter++;
    }
    InstanceCounter() {
        InstanceCounter.addCounter();
    }
}
class test {
    public static void main(String[] args) {
        System.out.println("Starting with "+InstanceCounter.getCounter());
        for (int i = 0; i < 100; i++) {
             new InstanceCounter();
        }
        System.out.println("Finishing with "+InstanceCounter.getCounter());
    }
}
