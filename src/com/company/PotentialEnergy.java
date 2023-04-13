package com.company;

public class PotentialEnergy {
    public static final double g = 9.81;
    int h,m;
    PotentialEnergy(int h,int m){
        this.h = h;
        this.m = m;
    }
    void setH(int newH){
        h = newH;
    }
    void setM(int newM){
        h = newM;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }
    double CountEnergy(){
        return m*g*h;
    }
}
