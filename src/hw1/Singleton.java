package hw1;

public class Singleton {
    private static Singleton singleton = new Singleton();

    public int getNum() {
        return num;
    }

    private int num=0;
    private Singleton(){
        System.out.println("单例的构造函数仅执行了一次");
        num++;
    }
    public static Singleton getSingleton(){
        return singleton;
    }
}
