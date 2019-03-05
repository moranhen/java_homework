package hw1;

public class Singleton1 {
    private static Singleton1 singleton1;
    private Singleton1(){
        System.out.println("第二种单例构造函数执行了，且也仅执行了一次");
    }
    public static Singleton1 getInstance(){
        if (singleton1==null){
            singleton1 =new Singleton1();
        }
            return singleton1;
    }
}
