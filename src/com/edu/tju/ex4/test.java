package com.edu.tju.ex4;

public class test {
    public static void main(String[] args) {
        MatrixGenerator mg =new MatrixGenerator();
        System.out.println("串型矩阵输出：");
        long start =System.nanoTime();
        double result[][]=new double[mg.a][mg.c];
        for(int i=0;i<mg.a;i++){
            for(int j=0;j<mg.c;j++){
                double temp=0;
                for(int k=0;k<mg.b;k++){
                    temp+=mg.first[i][k]* mg.second[k][j];
                }
                result[i][j]=temp;
            }
        }
        long end =System.nanoTime();
        System.out.println("程序运行时间： "+(end-start)+"ns");
        for(int i=0;i< mg.a;i++){
            for(int j=0;j< mg.c;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        Rundemo m1 =new Rundemo(mg,true);
        Thread t1 =new Thread(m1,"奇数行：");
        Rundemo m2 = new Rundemo(mg,false);
        Thread t2 = new Thread(m2,"偶数行：");
        long start1 =System.nanoTime();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end1 =System.nanoTime();
        System.out.println("程序运行时间： "+(end1-start1)+"ms");
        System.out.println("多线程计算矩阵输出：");
        for(int i=0;i<mg.a;i++){
            for(int j=0;j<mg.c;j++){
                if(i%2!=0){
                    System.out.print(m2.temp1[i][j]+" " );
                }else {
                    System.out.print(m1.temp1[i][j]+" ");
                }
            }
            System.out.println();
        }
        TriRundemo r1 =new TriRundemo(mg,0);
        TriRundemo r2 =new TriRundemo(mg,1);
        TriRundemo r3 =new TriRundemo(mg,2);
        TriRundemo r4 =new TriRundemo(mg,3);
        Thread t11 =new Thread(r1,"左上");
        Thread t12 =new Thread(r2,"右上");
        Thread t13 =new Thread(r3,"右下");
        Thread t14 =new Thread(r4,"左下");
        long start2 = System.nanoTime();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        try {
            t11.join();
            t12.join();
            t13.join();
            t14.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end2 = System.nanoTime();
        System.out.println("4个线程程序运行时间： "+(end2-start2)+"ms");
    }
}
