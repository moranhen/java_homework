package hw1;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println("单例模式实例化次数"+singleton2.getNum());
        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton1 singleton12 = Singleton1.getInstance();
        Singleton1 singleton13 = Singleton1.getInstance();
    }
}