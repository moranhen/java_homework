package com.edu.tju.ex4;

public class TriRundemo implements Runnable {
    MatrixGenerator mg;
    int flag;
    double temp1[][];
    int a;
    int b;
    int c;

    public TriRundemo(MatrixGenerator mg, int flag) {
        this.mg = mg;
        this.flag = flag;
        temp1 = new double[mg.a][mg.c];
        a = mg.a / 2;
        b = mg.b / 2;
        c = mg.c / 2;
    }

    @Override
    public void run() {
        if (flag == 0) {
            for (int i = 0; i < a; i++) {//左上
                for (int j = 0; j < c; j++) {
                    double temp = 0;
                    for (int k = 0; k < mg.b; k++) {
                        temp += mg.first[i][k] * mg.second[k][j];
                    }
                    temp1[i][j] = temp;
                }
            }
        } else if (flag == 1) {//右上
            for (int i = 0; i < a;  i++) {
                for (int j = c; j < mg.c; j++) {
                    double temp = 0;
                    for (int k = 0; k < mg.b; k++) {
                        temp += mg.first[i][k] * mg.second[k][j];
                    }
                    temp1[i][j] = temp;
                }
            }
        } else if (flag == 2) {//右下
            for (int i = a; i < mg.a; i++) {
                for (int j = c; j < mg.c; j++) {
                    double temp = 0;
                    for (int k = 0; k < mg.b; k++) {
                        temp += mg.first[i][k] * mg.second[k][j];
                    }
                    temp1[i][j] = temp;
                }
            }
        } else if (flag == 3) {//左下
            for (int i = a; i < mg.a; i++) {//左上
                for (int j = 0; j < c; j++) {
                    double temp = 0;
                    for (int k = 0; k < mg.b; k++) {
                        temp += mg.first[i][k] * mg.second[k][j];
                    }
                    temp1[i][j] = temp;
                }
            }
        }
    }
}
