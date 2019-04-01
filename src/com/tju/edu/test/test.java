package com.tju.edu.test;

import java.lang.reflect.*;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        try {
            Class<?> clazz =Class.forName("com.tju.edu.test.Teacher");
            Field[] fields =clazz.getDeclaredFields();
            System.out.println("Teacher类的所有fields: ");
            for(Field field :fields){
                int mod =field.getModifiers();
                System.out.print(Modifier.toString(mod)+" ");
                System.out.println(field.getType().getName()+" "+field.getName());
            }
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Teacher类的所有methods: ");
            for(Method method :methods){
                int mod =method.getModifiers();
                System.out.print(Modifier.toString(mod)+" ");
                System.out.println(method.getReturnType().getName()+" "+method.getName()+" 其中参数为： ");
                Parameter[] parameters =method.getParameters();
                for(Parameter parameter:parameters){
                    System.out.print(parameter.getType().getName()+" "+parameter.getName()+", ");
                }
                System.out.println(" ");
            }
            System.out.println("Teacher类的所有构造方法: ");
            Constructor[] constructors =clazz.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                int mod = constructor.getModifiers();
                System.out.print(Modifier.toString(mod)+" ");
                System.out.println(constructor.getName()+" 其中参数为： ");
                Parameter[] parameters =constructor.getParameters();
                for(Parameter parameter:parameters){
                    System.out.print(parameter.getType().getName()+" "+parameter.getName()+", ");
                }
                System.out.println(" ");
            }
            System.out.println("com.tju.edu.test.Teacher 父类类名为： "+ clazz.getSuperclass().getName());
            System.out.println("com.tju.edu.test.Teacher 父类调用接口为： "+ Arrays.toString(clazz.getSuperclass().getInterfaces()));
            Method m1 = clazz.getMethod("skill");
            Object ret =m1.invoke(clazz.newInstance());
            Method m2 = clazz.getDeclaredMethod("teach", String.class, int.class);
            m2.setAccessible(true);
            Object re2 = m2.invoke(clazz.newInstance(),"ddd",1);
            Constructor constructor =clazz.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);
            Object teacher = constructor.newInstance(1);
            m1.invoke(teacher);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
