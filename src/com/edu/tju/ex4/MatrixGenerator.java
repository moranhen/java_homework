package com.edu.tju.ex4;

import java.util.Random;

public class MatrixGenerator {
    Random random =new Random();
    int  a = random.nextInt(200);
    int b = random.nextInt(200);
    int c =random.nextInt(200);
    double first[][] = new double[a][b];
    double second[][] = new double[b][c];
    public MatrixGenerator(){
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                first[i][j]=random.nextDouble()*10;
            }
        }
        for (int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                second[i][j]=random.nextDouble()*10;
            }
        }

    }
}
