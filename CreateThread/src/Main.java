//public class Main extends Thread{
//    public void run(){
//        System.out.println("Thread Is Running via Extend......");
//    }
//    public static void main(String[] args) {
//        System.out.println("Hello Java Multithreading!");
//        Main m = new Main();
//        m.start();
//    }
//}


public class Main implements Runnable{
    public void run(){
        System.out.println("Thread Is Running via Implements......");
    }
    public static void main(String[] args) {
        System.out.println("Hello Java Multithreading!");
        Main m = new Main();
        Thread t1 = new Thread(m);
        t1.start();
    }
}