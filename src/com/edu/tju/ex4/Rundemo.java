package com.edu.tju.ex4;

public class Rundemo implements Runnable {
    MatrixGenerator mg;

    boolean flag;
    double temp1[][];
    public Rundemo(MatrixGenerator mg,boolean flag){
        this.mg=mg;
        this.flag =flag;
        temp1=new double[mg.a][mg.c];
    }
    @Override
    public void run() {
        if(flag){
            for(int i=0;i<mg.a;i=i+2){
                for(int j=0;j<mg.c;j++){
                    double temp =0;
                    for(int k=0;k<mg.b;k++){
                        temp+=mg.first[i][k]*mg.second[k][j];
                    }
                    temp1[i][j]=temp;
                }
            }
        }else {
            for(int i=1;i<mg.a;i=i+2){
                for(int j=0;j<mg.c;j++){
                    double temp =0;
                    for(int k=0;k<mg.b;k++){
                        temp+=mg.first[i][k]*mg.second[k][j];
                    }
                    temp1[i][j]=temp;
                }
            }
        }
    }
}
